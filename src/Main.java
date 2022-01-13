import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        // ln w tej samej linii
        System.out.print("Input first number: ");
        int a = userInput.nextInt();
        // ln linia ponizej
        System.out.println("Input second number: ");
        int b = userInput.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));

        int subtract = a - b;
        System.out.println(a + " - " + b + " = " + subtract);

        System.out.println(a + " x " + b + " = " + (a*b));

        int divide = a / b;
        System.out.println(a + " / " + b + " = " + divide);

        int modulo = a % b;
        System.out.println(a + " mod " + b + " = " + modulo);



    }
}
