//Create a program that will calculate the weekly average tax withholding for a customer given the following weekly income guidelines:
//
//Income less than $500: tax rate 10%
//Incomes greater than/equal to $500 and less than $1500: tax rate 15%
//Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
//Incomes greater than/equal to $2500: tax rate 30%
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weekly income: $");
        double income = input.nextDouble();

        double taxWithholding;

        if (income < 500) {
            taxWithholding = income * .10;
        } else if (income < 1500) {
            taxWithholding = income * .15;
        } else if (income < 2500) {
            taxWithholding = income * .20;
        } else {
            taxWithholding = income * .30;
        }

        System.out.printf("Tax withholding: $%.2f%n", taxWithholding);

        input.close();
    }

}