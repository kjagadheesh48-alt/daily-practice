def armstrong(n):
    total = 0
    temp = n

    while temp > 0:
        digit = temp % 10
        total += digit ** 3
        temp = temp // 10

    if total == n:
        print("Armstrong Number")
    else:
        print("Not an Armstrong Number")

num = int(input("Enter a number: "))
armstrong(num)