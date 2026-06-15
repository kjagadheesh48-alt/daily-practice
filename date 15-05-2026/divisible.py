def divisible_by_10(n):
    if n % 10 == 0:
        print("Divisible by 10")
    else:
        print("Not Divisible by 10")

num = int(input("Enter a number: "))
divisible_by_10(num)