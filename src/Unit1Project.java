import javax.swing.*;
import java.util.Scanner; // Link to GitHub: https://github.com/Sifata1/Unit1Project

public class Unit1Project {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your total bill!"); // Here the computer is asking the user for information about the tip and the bill.
        double totalBill = s.nextDouble();
        totalBill = Math.round(totalBill * 100);
        totalBill = (totalBill / 100);
        System.out.println("Enter the percentage you wish to tip!"); // Here the computer is asking the user for the tip percentage
        int tipPercentage = s.nextInt();
        System.out.println("Enter the number of people in your party"); // Here the computer is asking the user for the number of people in the party.
        int numOfPeople = s.nextInt();

        System.out.println();
        String design = ("<---------------------------->"); // A design is added for fluidity.
        System.out.println(design);

        double totalTip = (totalBill)*((double)tipPercentage/100); // The total is multiplied with the tip percentage in decimals to calculate the tip the user wishes to give.
        System.out.printf("Total Tip: $"+ "%.2f" + "\n", totalTip); // The total tip is rounded to 2 decimal places.

        double totalBillWithTip = (totalTip) + (double)(totalBill); // The tip and total bill are added together to calculate the net total.
        System.out.printf("Total Bill With Tip: $"+ "%.2f" + "\n", totalBillWithTip);

        double tipPerPerson = (totalTip)/(numOfPeople); // The tip is divided by the amount of people in the party to calculate the tip given by each person.
        System.out.printf("Tip Per Person: $"+ "%.2f" + "\n", tipPerPerson);

        double billPerPerson = (tipPerPerson) +  ((double)(totalBill)/numOfPeople); // The total bill is divided by the number of people to calculate each person's portion of the bill. This is added to the tip per person to calculate the amount each person pays towards the bill and tip combined.
        System.out.printf("Total Bill Per Person: $"+ "%.2f" + "\n", billPerPerson);

        System.out.println(design);


    }
}
