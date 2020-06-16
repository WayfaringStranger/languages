# Python Program to check if a number is palindrome.

n = int(input("Enter number: "))
temp = n
rev = 0
while(n > 0):
    num = n % 10
    rev = rev * 10 + num
    n  = n // 10

if temp == rev:
    print("The number is palindrome!")
else:
    print("The number isn't palindrome!")
