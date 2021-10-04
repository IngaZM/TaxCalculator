package Sprint4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        double salary;
        double tax;
        int age;

        // User input

        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();

        //calculations and results

        if (age < 65 && salary <= 216200) {
            tax = salary * 0.18;
            System.out.println("You have to pay: " + tax + " tax");
        } else if (age < 65 && (salary >= 216201 || salary <= 337800)) {
            tax = 38916 + 0.26;
            System.out.println("You have to pay: " + tax + " tax");
        } else if (age < 65 && (salary >= 337801 || salary <= 467500)){
            tax = 70532 + 0.31;
            System.out.println("You have to pay: " + tax + " tax");
        } else if (age < 65 && (salary >= 467501 || salary <= 613600)) {
            tax = 110739 + 0.36;
            System.out.println("You have to pay: " + tax + " tax");
        } else if (age < 65 && (salary >= 613601 || salary <= 782200)) {
            tax = 16335 + 0.39;
            System.out.println("You have to pay: " + tax + " tax");
        } else if (age < 65 && (salary >= 782201 || salary >= 1656600)) {
            tax = 229089 + 0.41;
            System.out.println("You have to pay: " + tax + " tax");
        }else if (age < 65 && (salary >= 1656601)) {
            tax = 587593 + 0.45;
            System.out.println("You have to pay: " + tax + " tax");
        }
    }
}
