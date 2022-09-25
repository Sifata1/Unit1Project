import java.util.Scanner; // Link to GitHub: https://github.com/Sifata1/Unit1Project
public class Unit1Project {
    public static void main(String[] args) {

        System.out.println("Hello!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your total bill!"); // Here the computer is asking the user for information about the tip and the bill.
        double totalBill = s.nextDouble();
        totalBill = Math.round(totalBill * 100);
        totalBill = (totalBill / 100);
        System.out.println("Enter the percentage you wish to tip!");
        int tipPercentage = s.nextInt();
        System.out.println("Enter the number of people in your party");
        int numOfPeople = s.nextInt();

        System.out.println();
        String design = ("<---------------------------->");
        System.out.println(design);


        double totalTip = (totalBill)*((double)tipPercentage/100);
        totalTip = Math.round(totalTip * 100);
        totalTip = (totalTip / 100);
        System.out.println("Total Tip: $" + totalTip);

        double totalBillWithTip = (totalTip) + (double)(totalBill);
        totalBillWithTip = Math.round(totalBillWithTip * 100);
        totalBillWithTip = (totalBillWithTip / 100);
        System.out.println("Total Bill With Tip: $" + totalBillWithTip);

        double tipPerPerson = (totalTip)/(numOfPeople);
        tipPerPerson = Math.round(tipPerPerson * 100);
        tipPerPerson = (tipPerPerson/100);
        System.out.println("Tip Per Person: $" + tipPerPerson);

        double billPerPerson = (tipPerPerson) +  ((double)(totalBill)/numOfPeople);
        billPerPerson = Math.round(billPerPerson * 100);
        billPerPerson = (billPerPerson /100);
        System.out.println("Total Bill Per Person: $" + billPerPerson);

        System.out.println(design);






    }
}
