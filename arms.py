def armstrong(n):
    s = 0
    temp = n

    while temp > 0:
        digit = temp % 10
        s += digit ** 3
        temp //= 10

    return s == n

print(armstrong(153))