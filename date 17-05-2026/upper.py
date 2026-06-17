def count_uppercase(text):
    count = 0
    for ch in text:
        if ch.isupper():
            count += 1
    return count

word = input("Enter a string: ")

print("Uppercase letters =", count_uppercase(word))
