def divisible_by_5(n):
    if n % 5 == 0:
        print("Divisible by 5")
    else:
        print("Not Divisible by 5")

num = int(input("Enter a number: "))
divisible_by_5(num)