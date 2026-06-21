def multiple_of_5(n):
    if n % 5 == 0:
        print("Multiple of 5")
    else:
        print("Not a Multiple of 5")

num = int(input("Enter a number: "))
multiple_of_5(num)