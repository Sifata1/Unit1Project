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
        String design = ("<---------------------------->");
        System.out.println(design);


        double totalTip = (totalBill)*((double)tipPercentage/100); // The total is multiplied with the tip percentage in decimals to calculate the tip the user wishes to give.
        totalTip = Math.round(totalTip * 100); // The total tip calculated above is multiplied by 100 and then rounded, and then divided by 100 in order to round to two decimal places.
        totalTip = (totalTip / 100);
        System.out.println("Total Tip: $" + totalTip);

        double totalBillWithTip = (totalTip) + (double)(totalBill); // The tip and total bill are added together to calculate the net total.
        totalBillWithTip = Math.round(totalBillWithTip * 100);
        totalBillWithTip = (totalBillWithTip / 100);
        System.out.println("Total Bill With Tip: $" + totalBillWithTip);

        double tipPerPerson = (totalTip)/(numOfPeople); // The tip is divided by the amount of people in the party to calculate the tip given by each person.
        tipPerPerson = Math.round(tipPerPerson * 100);
        tipPerPerson = (tipPerPerson/100);
        System.out.println("Tip Per Person: $" + tipPerPerson);

        double billPerPerson = (tipPerPerson) +  ((double)(totalBill)/numOfPeople); // The total bill is divided by the number of people to calculate each person's portion of the bill. This is added to the tip per person to calculate the amount each person pays towards the bill and tip combined.
        billPerPerson = Math.round(billPerPerson * 100);
        billPerPerson = (billPerPerson /100);
        System.out.println("Total Bill Per Person: $" + billPerPerson);

        System.out.println(design);


    }
}
