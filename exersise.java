import java.util.Scanner;

public class exersise {
    public static void main(String[] args) {
        int number= 69;
        
        System.out.println("enter your guess");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        if(guess>number){
         System.out.println("your guess is high");
        }
        if(guess<number){
            System.out.println("your guess is low");
        }
        else if (guess == number) {
            System.out.println("Congrats! you guess the right number");
        }
    }
}
