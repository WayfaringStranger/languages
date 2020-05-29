import json

# Sample JSON
userJSON = '{"first_name": "John", "last_name": "Doe", "age": 20}'

# Parse to dict
user = json.load(userJSON)

print(user)

