import java.util.Scanner;

public class NumberGuessingGame {

    public void playGame(){
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("you can try upto 5 times");
        int max=100;
        int min=1;
        int targetNumber = (int)(Math.random()*(max-min+1)+min);
        System.out.println(targetNumber);
        int attempts=0;

        while(true){
            System.out.println("please enter the number from 1 to 100");
            Scanner scan = new Scanner(System.in);
            int guessNumber = scan.nextInt();
            attempts++;
            if (attempts<=5){
                    if(guessNumber == targetNumber){
                        System.out.println("Congratulations ! you guessed correct number in "+attempts+" attempts");
                        break;
                    }else if(guessNumber>targetNumber){
                        System.out.println("Too high . Better luck next time");

                    }
                    else {
                        System.out.println("Too low. Better luck next time");

                    }
            }

        }
        playAgain();
    }

    public void playAgain(){
        System.out.println("Do you want to play again?(yes/no)");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        if(choice.equalsIgnoreCase("yes")){
            playGame();
        }
        else {
            System.out.println("Thank you so much for participating in Game");
        }
    }
    public static void main(String[] args) {
        NumberGuessingGame object = new NumberGuessingGame();
        object.playGame();
    }
}
