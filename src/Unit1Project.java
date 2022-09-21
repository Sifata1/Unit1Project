import java.util.Scanner;
public class Unit1Project {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your total bill!");
        int totalBill = s.nextInt();
        System.out.println("Enter the percentage you wish to tip!");
        int tipPercentage = s.nextInt();
        System.out.println("Enter the number of people in your party");
        int numOfPeople = s.nextInt();
    }
}
