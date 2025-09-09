
print("Welcome to Rock-Paper-Scissors!")
player1 = input("What is Player 1's name? ")
player2 = input("What is Player 2's name? ")

    # Get choices from both players
player1_ch = input("Player 1, enter Rock, Paper, or Scissors: ").strip().lower()
player2_ch = input("Player 2, enter Rock, Paper, or Scissors: ").strip().lower()

    # Determine winner
if player1_ch == player2_ch:
        print("It's a Draw!")
elif (player1_ch == "rock" and player2_ch == "scissors") or \
         (player1_ch == "scissors" and player2_ch == "paper") or \
         (player1_ch == "paper" and player2_ch == "rock"):
        print("Player 1 Wins!")
elif (player2_ch == "rock" and player1_ch == "scissors") or \
         (player2_ch == "scissors" and player1_ch == "paper") or \
         (player2_ch == "paper" and player1_ch == "rock"):
        print("Player 2 Wins!")
else:
        print("Invalid input! Please enter Rock, Paper, or Scissors.")
        # Ask them if they want to play again
repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    # If they say yes, don't do anything
if(repeat == "yes"):
        pass
    # If they say no, exit the game
elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
