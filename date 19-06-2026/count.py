def count_lowercase(text):
    count = 0
    for ch in text:
        if ch.islower():
            count += 1
    return count

word = input("Enter a string: ")

print("Lowercase letters =", count_lowercase(word))