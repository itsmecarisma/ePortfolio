from pymongo import MongoClient, errors, IndexModel, ASCENDING

class AnimalShelter(object):
    """CRUD operations for Animal collection in MongoDB"""

    def __init__(self, USER, PASS):
        # Connection Variables
        self.USER = USER
        self.PASS = PASS
        self.HOST = 'nv-desktop-services.apporto.com'
        self.PORT = 31363
        self.DB = 'admin'
        self.COL = 'animals'

        try:
            # Initialize Connection with connection pooling
            self.client = MongoClient(
                'mongodb://%s:%s@%s:%d' % (self.USER, self.PASS, self.HOST, self.PORT),
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

    # Complete this create method to implement the C in CRUD.
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

    # Read method to implement the R in CRUD.
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

    # Update method to implement the U in CRUD
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

    # Delete method to implement the D in CRUD
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


class AnimalShelter(object):
    """CRUD operations for Animal collection in MongoDB"""

    def __init__(self, USER, PASS):
        # Connection Variables
        self.USER = USER
        self.PASS = PASS
        self.HOST = 'nv-desktop-services.apporto.com'
        self.PORT = 31363
        self.DB = 'admin'
        self.COL = 'animals'

        try:
            # Initialize Connection with connection pooling
            self.client = MongoClient(
                'mongodb://%s:%s@%s:%d' % (self.USER, self.PASS, self.HOST, self.PORT),
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

    # Complete this create method to implement the C in CRUD.
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

    # Read method to implement the R in CRUD.
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

    # Update method to implement the U in CRUD
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

    # Delete method to implement the D in CRUD
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
