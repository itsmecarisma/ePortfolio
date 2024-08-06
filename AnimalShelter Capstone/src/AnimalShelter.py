from pymongo import MongoClient, errors, IndexModel, ASCENDING
import random
import string

class AnimalShelter:
    """CRUD operations for Animal collection in MongoDB"""

    def __init__(self, USER, PASS, HOST='localhost', PORT=27017):
        # Connection Variables
        self.USER = USER
        self.PASS = PASS
        self.HOST = HOST
        self.PORT = PORT
        self.DB = 'admin'
        self.COL = 'animals'

        print(f"Attempting to connect to MongoDB at {self.HOST}:{self.PORT} with user {self.USER}")

        try:
            # Initialize Connection with connection pooling
            self.client = MongoClient(
                f"mongodb://{self.USER}:{self.PASS}@{self.HOST}:{self.PORT}",
                maxPoolSize=50,  # Adjust pool size as needed
                connectTimeoutMS=30000
            )
            self.database = self.client[self.DB]
            self.collection = self.database[self.COL]

            # Create index for better read performance
            self.collection.create_indexes([IndexModel([("name", ASCENDING)])])
            print("Connection successful and index created!")

        except errors.PyMongoError as e:
            print(f"An error occurred while connecting to the database: {e}")

    def create(self, data):
        try:
            if data:
                result = self.collection.insert_one(data)  # data should be a dictionary
                return result.acknowledged
            else:
                raise ValueError("Nothing to save, because data parameter is empty")
        except errors.PyMongoError as e:
            print(f"An error occurred while inserting data: {e}")
            return False

    def read(self, query):
        try:
            if query:
                cursor = self.collection.find(query, {"_id": False})
            else:
                cursor = self.collection.find({}, {"_id": False})
            return list(cursor)
        except errors.PyMongoError as e:
            print(f"An error occurred while reading data: {e}")
            return []

    def update(self, query, updateData):
        try:
            if query and updateData:
                result = self.collection.update_one(query, {'$set': updateData})
                return result.modified_count
            else:
                raise ValueError("Both query and updateData must be provided")
        except errors.PyMongoError as e:
            print(f"An error occurred while updating data: {e}")
            return 0

    def delete(self, query):
        try:
            if query:
                result = self.collection.delete_one(query)
                return result.deleted_count
            else:
                raise ValueError("Query parameter must be provided for deletion")
        except errors.PyMongoError as e:
            print(f"An error occurred while deleting data: {e}")
            return 0

    def generate_test_data(self, num_records):
        species_list = ["Dog", "Cat", "Rabbit", "Hamster", "Bird"]
        for _ in range(num_records):
            name = ''.join(random.choices(string.ascii_uppercase + string.digits, k=5))
            species = random.choice(species_list)
            age = random.randint(1, 15)
            self.create({"name": name, "species": species, "age": age})
        print(f"Inserted {num_records} test records into the collection.")
