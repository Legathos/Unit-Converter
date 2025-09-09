import java.io.IOException;
import java.util.Scanner;

/***
 * Unit Converter
 *
 * Celsius <-> Fahrenheit
 * Meters <-> Feet
 * Km <-> Miles
 * Kg <-> Lbs
 *
 */


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to convert?");
        System.out.println("1. Metric to Imperial");
        System.out.println("2. Imperial to Metric");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        while (choice != 3) {

            switch (choice) {
                case 1:
                    System.out.println("Choose a unit");
                    System.out.println("1. Celsius");
                    System.out.println("2. Meters");
                    System.out.println("3. Km");
                    System.out.println("4. Kg");
                    System.out.println("5. Back");

                    int unit = scanner.nextInt();

                    switch (unit) {
                        case 1:
                            System.out.println("Enter temperature in Celsius");
                            double celsius = scanner.nextDouble();

                            System.out.println(celsius + " Celsius is " + (celsius * 1.8) + " Fahrenheit");
                            break;
                        case 2:
                            System.out.println("Enter length in meters");
                            double meters = scanner.nextDouble();

                            System.out.println(meters + " meters is " + (meters * 3.28) + " feet");
                            break;
                        case 3:
                            System.out.println("Enter distance in km");
                            double km = scanner.nextDouble();

                            System.out.println(km + " km is " + (km * 0.621371) + " miles");
                            break;
                        case 4:
                            System.out.println("Enter weight in kg");
                            double kg = scanner.nextDouble();

                            System.out.println(kg + " kg is " + (kg * 2.20462) + " lbs");
                            break;
                        case 5:

                            System.out.println("Back to menu");
                            break;
                        default:

                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Choose a unit");
                    System.out.println("1. Fahrenheit");
                    System.out.println("2. Feet");
                    System.out.println("3. Miles");
                    System.out.println("4. Lbs");
                    System.out.println("5. Back");
                    int unit2 = scanner.nextInt();

                    switch (unit2) {
                        case 1:
                            System.out.println("Enter temperature in Fahrenheit");
                            double fahrenheit = scanner.nextDouble();

                            System.out.println(fahrenheit + " Fahrenheit is " + (fahrenheit * 0.555555) + " Celsius");
                            break;
                        case 2:
                            System.out.println("Enter length in feet");
                            double feet = scanner.nextDouble();

                            System.out.println(feet + " feet is " + (feet * 0.3048) + " meters");
                            break;
                        case 3:
                            System.out.println("Enter distance in miles");
                            double miles = scanner.nextDouble();

                            System.out.println(miles + " miles is " + (miles * 1.60934) + " km");
                            break;
                        case 4:
                            System.out.println("Enter weight in lbs");
                            double lbs = scanner.nextDouble();

                            System.out.println(lbs + " lbs is " + (lbs * 0.453592) + " kg");
                            break;
                        case 5:

                            System.out.println("Back to menu");
                            break;
                        default:

                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("\n");
            System.out.println("What would you like to convert?");
            System.out.println("1. Metric to Imperial");
            System.out.println("2. Imperial to Metric");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        }
    }
}