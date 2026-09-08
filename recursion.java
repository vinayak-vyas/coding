import java.util.Scanner;

public class recursion {
    static int factorial(int n){
        if (n==0 || n ==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("enter the number you want to factorial : ");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        System.out.println("the value of the factorial is :" + factorial(fact));   
    }
}
