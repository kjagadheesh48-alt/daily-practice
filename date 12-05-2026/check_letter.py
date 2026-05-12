def check_letter(ch):
    if ch.lower() in ['a', 'e', 'i', 'o', 'u']:
        print("Vowel")
    else:
        print("Consonant")

letter = input("Enter a letter: ")
check_letter(letter)
