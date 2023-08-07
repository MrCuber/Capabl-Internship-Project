import random
words = ["Apple", "Banana", "Orange", "Coconut", "strawberry", "lime", "grapefruit", "lemon", "kumquat", "blueberry", "melon"]
random_word = random.choice(words)
incorrect_guesses = len(random_word) - 2

print("_" * 25)
print("Welcome to Hangman!")
print("_" * 25)

guessed_letters = []
for _ in random_word:
    guessed_letters.append("_")

while incorrect_guesses > 0:
    print("Word: ", end="")
    for letter in guessed_letters:
        print(letter, end=" ")
    print()

    guess = input("Guess a letter: ").lower()

    if len(guess) != 1:
        print("Please enter only one letter.")
        continue

    if guess in guessed_letters:
        print("You've already guessed that letter.")
        continue

    guessed_correctly = False
    for index, letter in enumerate(random_word):
        if letter == guess:
            guessed_letters[index] = letter
            guessed_correctly = True

    if guessed_correctly:
        print("Correct guess!")
        
        if "_" not in guessed_letters:
            print("Congratulations! You won!")
            print("The word is", random_word)
            break
    else:
        incorrect_guesses -= 1
        print("Incorrect guess! You have", incorrect_guesses, "guesses left.")

        if incorrect_guesses == 0:
            print("Sorry, you lost. The word was", random_word)
            break
