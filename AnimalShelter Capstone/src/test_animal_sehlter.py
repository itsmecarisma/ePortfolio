import unittest
from src.AnimalShelter import AnimalShelter


class TestAnimalShelter(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        # Replace these with your actual MongoDB credentials
        USER = "accuser"
        PASS = "ccarter2"
        HOST = "localhost"  # Update with your host
        PORT = 27017  # Update with your port if different

        cls.shelter = AnimalShelter(USER, PASS, HOST, PORT)

        # Sample data
        cls.sample_data = [
            {"name": "Buddy", "species": "Dog", "age": 3},
            {"name": "Mittens", "species": "Cat", "age": 5},
            {"name": "Charlie", "species": "Dog", "age": 2},
            {"name": "Luna", "species": "Cat", "age": 1},
            {"name": "Max", "species": "Dog", "age": 4},
            {"name": "Bella", "species": "Cat", "age": 3},
            {"name": "Lucy", "species": "Dog", "age": 6},
            {"name": "Simba", "species": "Cat", "age": 2},
            {"name": "Daisy", "species": "Dog", "age": 5},
            {"name": "Nala", "species": "Cat", "age": 4},
            {"name": "Rocky", "species": "Dog", "age": 3},
            {"name": "Sophie", "species": "Cat", "age": 1},
            {"name": "Bailey", "species": "Dog", "age": 2},
            {"name": "Milo", "species": "Cat", "age": 6},
            {"name": "Sadie", "species": "Dog", "age": 4},
            {"name": "Chloe", "species": "Cat", "age": 5},
            {"name": "Jack", "species": "Dog", "age": 1},
            {"name": "Zoe", "species": "Cat", "age": 3},
            {"name": "Toby", "species": "Dog", "age": 6},
            {"name": "Lily", "species": "Cat", "age": 2},
            {"name": "Oscar", "species": "Dog", "age": 5},
            {"name": "Tiger", "species": "Cat", "age": 4},
            {"name": "Rusty", "species": "Dog", "age": 3},
            {"name": "Molly", "species": "Cat", "age": 1},
            {"name": "Buster", "species": "Dog", "age": 2},
            {"name": "Angel", "species": "Cat", "age": 6},
            {"name": "Sam", "species": "Dog", "age": 4},
            {"name": "Princess", "species": "Cat", "age": 5},
            {"name": "Henry", "species": "Dog", "age": 1},
            {"name": "Missy", "species": "Cat", "age": 3},
            {"name": "Harley", "species": "Dog", "age": 6},
            {"name": "Sassy", "species": "Cat", "age": 2},
            {"name": "Jake", "species": "Dog", "age": 5},
            {"name": "Smokey", "species": "Cat", "age": 4},
            {"name": "Rex", "species": "Dog", "age": 3},
            {"name": "Dixie", "species": "Cat", "age": 1},
            {"name": "Bruno", "species": "Dog", "age": 2},
            {"name": "Penny", "species": "Cat", "age": 6},
            {"name": "Bentley", "species": "Dog", "age": 4},
            {"name": "Coco", "species": "Cat", "age": 5},
            {"name": "Zeus", "species": "Dog", "age": 1},
            {"name": "Gracie", "species": "Cat", "age": 3},
            {"name": "Baxter", "species": "Dog", "age": 6},
            {"name": "Mimi", "species": "Cat", "age": 2},
            {"name": "Murphy", "species": "Dog", "age": 5},
            {"name": "Pepper", "species": "Cat", "age": 4},
            {"name": "Riley", "species": "Dog", "age": 3},
            {"name": "Patches", "species": "Cat", "age": 1},
            {"name": "Gizmo", "species": "Dog", "age": 2}
        ]

        # Insert sample data
        for animal in cls.sample_data:
            cls.shelter.create(animal)

    def test_create(self):
        new_animal = {"name": "Fido", "species": "Dog", "age": 5}
        result = self.shelter.create(new_animal)
        self.assertTrue(result, "Failed to create new animal")

    def test_read(self):
        result = self.shelter.read({"name": "Fido"})
        self.assertIsInstance(result, list, "Read result should be a list")
        self.assertGreater(len(result), 0, "Read result should not be empty")

    def test_update(self):
        result = self.shelter.update({"name": "Fido"}, {"age": 6})
        self.assertEqual(result, 1, "Failed to update animal")

    def test_delete(self):
        result = self.shelter.delete({"name": "Fido"})
        self.assertEqual(result, 1, "Failed to delete animal")

    @classmethod
    def tearDownClass(cls):
        # Clean up the database by deleting all sample data
        for animal in cls.sample_data:
            cls.shelter.delete({"name": animal["name"]})


if __name__ == '__main__':
    unittest.main()
