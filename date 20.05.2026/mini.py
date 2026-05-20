def minimum(a, b):
    if a < b:
        return a
    else:
        return b

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

print("Minimum =", minimum(x, y))