import java.util.Scanner;

// Abstract class for user profiles
abstract class User {
    protected String name;
    protected int age;
    protected double height; // in meters
    protected double weight; // in kilograms

    public User(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public abstract void displayDetails();
}

// Class for managing StayFit functionalities
class StayFitUser extends User {
    private int dailySteps = 0;
    private double waterIntake = 0.0; // in liters

    public StayFitUser(String name, int age, double height, double weight) {
        super(name, age, height, weight);
    }

    // Increment daily steps
    public void addSteps(int steps) {
        if (steps > 0) {
            dailySteps += steps;
            System.out.println("\n Steps added successfully!");
        } else {
            System.out.println("\n Invalid input! Steps must be positive.");
        }
    }

    // Increment water intake
    public void addWater(double liters) {
        if (liters > 0) {
            waterIntake += liters;
            System.out.println("\n Water intake updated successfully!");
        } else {
            System.out.println("\n Invalid input! Water intake must be positive.");
        }
    }

    // Calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }

    // Display user details and fitness stats
    @Override
    public void displayDetails() {
        System.out.println("\n==========================");
        System.out.println("     USER DETAILS");
        System.out.println("==========================");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Height      : " + height + " m");
        System.out.println("Weight      : " + weight + " kg");
        System.out.println("Daily Steps : " + dailySteps);
        System.out.println("Water Intake: " + waterIntake + " L");
        System.out.println("==========================");
    }

    // Display BMI and its category
    public void displayBMI() {
        double bmi = calculateBMI();
        System.out.println("\n==========================");
        System.out.println("       BMI RESULTS");
        System.out.println("==========================");
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Category   : Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Category   : Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Category   : Overweight");
        } else {
            System.out.println("Category   : Obese");
        }
        System.out.println("==========================");
    }
}

// Main application for StayFit
public class StayFitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("===================================");
        System.out.println("   WELCOME TO THE STAYFIT APP!");
        System.out.println("===================================\n");

        // Collect user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        StayFitUser user = new StayFitUser(name, age, height, weight);

        // Main menu
        int choice;
        do {
            System.out.println("\n===================================");
            System.out.println("           MAIN MENU");
            System.out.println("===================================");
            System.out.println("1. View User Profile");
            System.out.println("2. Add Daily Steps");
            System.out.println("3. Add Water Intake");
            System.out.println("4. Calculate BMI");
            System.out.println("5. Exit");
            System.out.println("===================================");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter steps to add: ");
                    int steps = scanner.nextInt();
                    user.addSteps(steps);
                    break;
                case 3:
                    System.out.print("Enter water intake in liters: ");
                    double liters = scanner.nextDouble();
                    user.addWater(liters);
                    break;
                case 4:
                    user.displayBMI();
                    break;
                case 5:
                    System.out.println("\nThank you for using StayFit! Stay healthy!");
                    break;
                default:
                    System.out.println("\n Invalid option! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
