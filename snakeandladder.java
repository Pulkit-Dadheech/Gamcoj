
    import java.util.Random;

    public class snakeandladder {
        int WINNING_POSITION = 100;
        int[] LADDERS = {3, 7, 19, 27, 39, 43, 54, 61};
        int[] LADDER_MOVES = {17, 21, 38, 56, 60, 84, 73, 81};
        int[] SNAKES = {14, 31, 47, 50, 63, 70, 87, 93};
        int[] SNAKE_MOVES = {-10, -18, -22, -25, -37, -43, -63, -74};

        private int currentPlayerPosition;
        private Random random;
         int count=0;

        public snakeandladder() {
            currentPlayerPosition = 0;
            random = new Random();
        }

        private int rollDice() {
            return random.nextInt(6) + 1;
        }

        private void movePlayer(int moves) {
            currentPlayerPosition += moves;
            for (int i = 0; i < LADDERS.length; i++) {
                if (currentPlayerPosition == LADDERS[i]) {
                    currentPlayerPosition += LADDER_MOVES[i];
                    System.out.println("Congratulations!! You got a ladder");

                    break;
                }
            }
            for (int i = 0; i < SNAKES.length; i++) {
                if (currentPlayerPosition == SNAKES[i]) {
                    currentPlayerPosition += SNAKE_MOVES[i];
                    System.out.println("Snake bites you and your position is decreased now");
                    break;
                }
            }
            if (currentPlayerPosition < 0) {
                currentPlayerPosition = 0;
                count++;
            }
            if (currentPlayerPosition > WINNING_POSITION) {
                currentPlayerPosition = WINNING_POSITION;
                count++;
            }
        }

        public void playGame() {
            while (currentPlayerPosition != WINNING_POSITION) {
                int diceRoll = rollDice();
                System.out.println("You got a "+ diceRoll + " on dice");



                movePlayer(diceRoll);
                System.out.println("Player moves " + diceRoll + " steps.");
                System.out.println("Player is now at position " + currentPlayerPosition);
                count++;
            }
            System.out.println("Player wins in " + count + " chances");

        }


    }


