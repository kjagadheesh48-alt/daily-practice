def check_number(n):
    if n > 0:
        print("Positive Number")
    elif n < 0:
        print("Negative Number")
    else:
        print("Zero")

num = int(input("Enter a number: "))
check_number(num)