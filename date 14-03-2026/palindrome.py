def number_palindrome(n):
    original = n
    reverse = 0

    while n > 0:
        digit = n % 10
        reverse = reverse * 10 + digit
        n = n // 10

    if original == reverse:
        print("Palindrome Number")
    else:
        print("Not a Palindrome Number")

num = int(input("Enter a number: "))
number_palindrome(num)