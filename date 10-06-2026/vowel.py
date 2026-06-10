def check_vowel(ch):
    if ch.lower() in "aeiou":
        print("Vowel")
    else:
        print("Consonant")

letter = input("Enter a character: ")
check_vowel(letter)