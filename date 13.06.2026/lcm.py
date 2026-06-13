def find_lcm(a, b):
    greater = max(a, b)

    while True:
        if greater % a == 0 and greater % b == 0:
            return greater
        greater += 1

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

print("LCM =", find_lcm(x, y))