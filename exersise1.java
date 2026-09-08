import java.util.Random;
import java.util.Scanner;
class game {
    private int number;
    private int inputnumber;
    private int noofguesses;

public game(){
Random rand = new Random();
this.number = rand.nextInt(100) +1;
}

public void takeuserinput(){
    Scanner sc = new Scanner(System.in);
    System.out.println("guess the any number(1-100)" );
    this.inputnumber = sc.nextInt();
}

public boolean iscorrectnumber(){
    noofguesses++;
    if(inputnumber == number) {
        System.out.println("Congrats! you guess the right number\n" );
        return true;
    }
    else if(inputnumber < number){
        System.out.println("too low try new number");
    }
    else {
        System.out.println("too high try new number");
    }
    return false;
}
public int getnoofguesses(){
    return noofguesses;
}
public void setnoofguesses(int noofguesses){
    this.noofguesses = noofguesses;
}}

public class exersise1 {
    public static void main(String[] args) {
        game g = new game();
        boolean iscorrect = false;
        while (!iscorrect) {
            g.takeuserinput();
            iscorrect = g.iscorrectnumber();
            
        }
    }
    
}
