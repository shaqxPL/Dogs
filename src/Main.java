import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner useInput = new Scanner(System.in);

        System.out.print("Input a number: ");
        int a = useInput.nextInt();

        for (int i = 0; i < 10; i++ ){
            System.out.println(a + " x " + (i+1) + " = " + (a*(i+1)));
        }







//        5) Write a Java program that takes a number as input and prints its multiplication up to 10.
//        Test Data:
//        Input a number: 5
//        Expected Output :
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15
//…
//        5 x 10 = 50

    }
}
