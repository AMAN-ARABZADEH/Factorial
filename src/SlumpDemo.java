import java.util.Random;
import java.util.Scanner;

public class SlumpDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random();
        System.out.println();
        System.out.println();

        // Random 1
        System.out.print("random:  ");
        for (int i = 0; i < 5; i++){
            int rand =  random.nextInt(10) +1;
            System.out.print(rand +" ");
        }
        System.out.println();
        System.out.println();
        // Random 2
        System.out.print("random1: ");
        for (int i = 0; i < 5; i++){
            int rand = random1.nextInt(20) +1;
            System.out.print(rand + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to see factorial: ");
        int input = scanner.nextInt();
        System.out.print("Enter number to multiply the factorial of it: ");
        double multiFactsInput = scanner.nextDouble();
        System.out.print("Enter number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter one number: ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double num4 = scanner.nextDouble();
        int factorial = addFactorial(input);
        double multiFactMethod = multiFactorial(multiFactsInput);
        double addStartToEnd = sumStartToEnd(num1, num2);
        double multiFactStartEnd = multiFacStartToEnd(num3, num4);
        System.out.println("Factorial of " + input + " is " + factorial);
        System.out.println("Multiply factorial  of " + multiFactsInput + " is " + multiFactMethod);
        System.out.println("Sum from " + num1 + " to " + num2 +  " is " + addStartToEnd);
        System.out.println("Multiply start from  " + num3 + "  to "+ num4 + " is in factorial " + multiFactStartEnd);

    }
    // addFactorial
    public  static  int addFactorial(int x){
        if(x > 0){
            return x + addFactorial(x -1);
        } else{
            return 0;
        }
    }

    // Multiplication factorial
    public  static double multiFactorial(double x){
        if(x == 0){
            return 1;
        } else{
            return x * multiFactorial(x -1);
        }
    }

    // Lägg siffror mellan start till slut och skriv summan
    public static double sumStartToEnd(double start, double end){
        if(end > start){
            return end + sumStartToEnd(start, end - 1);
        } else {
            return end;
        }
    }


    // Multiplicera från stat värde till slutvärde factorial
    public static double multiFacStartToEnd(double start, double end){
        if(start == end){
            return 1;
        } else {
            return end * multiFacStartToEnd(start, end - 1);
        }
    }


}
