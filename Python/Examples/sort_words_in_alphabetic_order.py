# Program to sort alphabetically the words form a string provided by the user

my_str = "Hello this Is an Example With cased letters"

# To take input from the user
# my_str = input("Enter a string: ")

# Breakdown the string into a list of words
words = my_str.split()

# Sort the list
words.sort()

# Display the sorted words

print("The sorted words are: ")
for word in words:
    print(word)
