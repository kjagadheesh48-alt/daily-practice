def divisible_by_3_and_7(n):
    if n % 3 == 0 and n % 7 == 0:
        print("Divisible by both 3 and 7")
    else:
        print("Not divisible by both 3 and 7")

num = int(input("Enter a number: "))
divisible_by_3_and_7(num)