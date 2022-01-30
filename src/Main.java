import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Program przeliczania minut na dni i lat");
        System.out.println("Wpisz ilość minut:");

        int minutes = userInput.nextInt();

        int day = 1440;
        double year = 525948.76;

        double days = minutes/day;
        double minutesInYear = minutes/year;
        double daysInYear =days/365;

        System.out.println(minutes + " minut to: " + days + " dni/dnia.");
        System.out.println(minutes + " minut to: " +  minutesInYear + " lat/roku");
        System.out.println("BONUS: z podanych minut otrzymujemy: " + days + " dni których jest " + daysInYear + " w roku.");
        System.out.println("Dziękuje.");
    }
}