def count_words(sentence):
    return len(sentence.split())

text = input("Enter a sentence: ")

print("Number of words =", count_words(text))