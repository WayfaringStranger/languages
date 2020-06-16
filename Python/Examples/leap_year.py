# Python Program to check given year is leap year.

year = int(input("Enter year: "))
if (year % 4 == 0 and year % 100 != 0 or year % 400 == 0):
    print("The year is leap year!")
else:
    print("The year isn't leap year!")
