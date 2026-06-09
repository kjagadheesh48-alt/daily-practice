def check_number(n):
    if n > 0:
        print("Positive")
    elif n < 0:
        print("Negative")
    else:
        print("Zero")

num = int(input("Enter a number: "))
check_number(num)
