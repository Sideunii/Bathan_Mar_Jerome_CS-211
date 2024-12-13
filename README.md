# StayFit
The StayFitApp is a Java-based personal fitness management system designed to promote a healthier lifestyle by allowing users to monitor their daily steps, water intake, and BMI (Body Mass Index). It focuses on creating an engaging and intuitive experience while maintaining a modular and clean architecture through the use of object-oriented programming (OOP) principles.
# OOP Principles Applied
Encapsulation:

Private Fields: User attributes like name, age, height, and weight are declared as private to protect data integrity. Access is provided via controlled methods (e.g., addSteps, addWater).
Encapsulation in Action: The StayFitUser class provides specialized methods to update fitness metrics, ensuring that changes are validated (e.g., only positive values are accepted for steps and water intake).
Abstraction:

The abstract class User serves as a blueprint for defining general user attributes and behaviors. This ensures that common properties like name, age, height, and weight are consistently implemented.
Complex computations like BMI calculation are abstracted into specific methods (calculateBMI, displayBMI) to hide internal details from the main application logic.
Inheritance:

The StayFitUser class extends the abstract User class, inheriting shared fields and methods while adding fitness-specific functionalities like daily steps and water intake management.
Polymorphism:

Method overriding is demonstrated in the displayDetails method, where StayFitUser customizes the implementation to include fitness statistics in addition to general user details.
The modular design allows for future extensions, such as adding new types of users or fitness metrics, by leveraging polymorphic behavior.
# Core Functionalities
View User Profile: Display detailed information about the user's general and fitness-related attributes.
Add Daily Steps: Increment the user's step count with input validation for positive numbers.
Add Water Intake: Update the user's daily water intake, ensuring proper validation.
Calculate BMI: Provide a health metric (BMI) and categorize it (e.g., underweight, normal, overweight, obese) to offer actionable insights.
Exit: A clear and friendly way to close the application with a thank-you message.

# SDG 3: Good Health and Well-being
Health Tracking: Users can monitor essential fitness metrics such as BMI, steps, and hydration, contributing to their overall health awareness.
Behavioral Change: By providing actionable insights into health data, the application encourages users to adopt and maintain healthy habits.
Accessibility: The program is simple to use and can benefit individuals at any fitness level.

# Running Instructions
Requirements:

Java Development Kit (JDK) 8 or later.
A text editor or IDE like IntelliJ IDEA, Eclipse, or VS Code.
Steps:

Save the code in a file named StayFitApp.java.
Compile with javac StayFitApp.java.
Run using java StayFitApp.
Menu Operations:

Follow prompts to interact with the system:
View user details.
Add fitness metrics (steps and water).
Calculate and view BMI.

