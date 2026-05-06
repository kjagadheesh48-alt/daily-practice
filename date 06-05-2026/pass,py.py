secret_word = "python"
guess = ""

while guess != secret_word:
    guess = input("Enter the secret word to stop the loop: ").lower()
    
    if guess != secret_word:
        print("Wrong! Try again.")

print("Correct! The loop has ended.")