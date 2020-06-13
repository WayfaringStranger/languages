class Person:
    """ This is a person class. """
    age = 10

    def greet(self):
        print("Hello")

admin = Person()

print(admin.age)

print(admin.greet)

print(admin.__doc__)

admin.greet()
