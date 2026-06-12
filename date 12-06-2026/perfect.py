def perfect_square(n):
    root = int(n ** 0.5)

    if root * root == n:
        print("Perfect Square")
    else:
        print("Not a Perfect Square")

num = int(input("Enter a number: "))
perfect_square(num)