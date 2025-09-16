import java.util.Scanner;
import java.lang.Math;

/**
 * Menu-Driven Calculator Application
 * Developed using Core Java (Command-Line Based Project)
 * Team Members: Uday Sai (Leader), Bhargavi, Sanjay, Ravi Teja
 */

public class CalculatorApp {
    void newLine() {
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorApp app = new CalculatorApp();
        int normalChoice = 1, trigChoice = 1, mainOption = 1;
        int[] numbers = new int[100];
        int addition, subtraction, multiplication;
        float cosine, tangent, logarithm;
        
        // giving menus to the user 
        
        while (mainOption != 3) {
            app.newLine();
            System.out.println("\t\t\t\t ********** MAIN MENU **********");
            System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            app.newLine();
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Trigonometric & Advanced Operations");
            System.out.println("3. Exit");
            app.newLine();

            System.out.print("Enter your choice: ");

            try {
                mainOption = scanner.nextInt();
                switch (mainOption) {
                    case 1:                                          // Basic Arithmetic Operations 
                        app.newLine();
                        System.out.println("\t\t\t\t BASIC ARITHMETIC OPERATIONS");
                        System.out.println("\t\t\t\t ============================");
                        normalChoice = 1;

                        while (normalChoice != 5) {                 //Arithmetic Operation menu 
                            app.newLine();
                            System.out.println("1. Addition");
                            System.out.println("2. Subtraction");
                            System.out.println("3. Multiplication");
                            System.out.println("4. Division");
                            System.out.println("5. Back to Main Menu");
                            app.newLine();

                            System.out.print("Enter your choice: ");
                            normalChoice = scanner.nextInt();

                            switch (normalChoice) {
                                case 1:                                // Addition
                                    addition = 0;
                                    System.out.print("Enter number of elements: ");
                                    int n = scanner.nextInt();
                                    for (int i = 1; i <= n; i++) {    // using arrays concept for read & calculating n numbers
                                        System.out.print("Enter value " + i + ": ");
                                        numbers[i] = scanner.nextInt();
                                    }
                                    for (int i = 1; i <= n; i++) {
                                        addition += numbers[i];
                                    }
                                    System.out.println("Result of Addition = " + addition);
                                    break;

                                case 2: // Subtraction
                                    subtraction = 0;
                                    System.out.print("Enter number of elements: ");
                                    int l = scanner.nextInt();
                                    for (int i = 1; i <= l; i++) {
                                        System.out.print("Enter value " + i + ": ");
                                        numbers[i] = scanner.nextInt();
                                    }
                                    for (int i = 1; i <= l; i++) {
                                        if (i == 1) {
                                            subtraction = numbers[i];
                                        } else {
                                            subtraction -= numbers[i];
                                        }
                                    }
                                    System.out.println("Result of Subtraction = " + subtraction);
                                    break;

                                case 3:                                                 // Multiplication
                                    multiplication = 1;
                                    System.out.print("Enter number of elements: ");
                                    int m = scanner.nextInt();
                                    for (int i = 1; i <= m; i++) {
                                        System.out.print("Enter value " + i + ": ");
                                        numbers[i] = scanner.nextInt();
                                    }
                                    for (int i = 1; i <= m; i++) {
                                        multiplication *= numbers[i];
                                    }
                                    System.out.println("Result of Multiplication = " + multiplication);
                                    break;

                                case 4:                                                 // Division
                                    System.out.print("Enter dividend: ");
                                    float dividend = scanner.nextFloat();
                                    System.out.print("Enter divisor: ");
                                    float divisor = scanner.nextFloat();
                                    if (divisor == 0) {
                                        System.out.println("Error: Division by zero is not allowed!");
                                    } else {
                                        float quotient = dividend / divisor;
                                        float remainder = dividend % divisor;
                                        System.out.println("Quotient = " + quotient);
                                        System.out.println("Remainder = " + remainder);
                                    }
                                    break;

                                case 5:
                                    System.out.println("Returning to Main Menu...");
                                    break;

                                default:
                                    System.out.println("Invalid option! Please try again.");
                            }
                        }
                        break;

                    case 2:                                                         // Trigonometric & Advanced Operations
                        app.newLine();
                        System.out.println("\t\t\t\t TRIGONOMETRIC & ADVANCED OPERATIONS");
                        System.out.println("\t\t\t\t ===================================");
                        trigChoice = 1;

                        while (trigChoice != 7) {                                   // menu for trigonometric operations 
                            System.out.println("1. Power");
                            System.out.println("2. Square Root");
                            System.out.println("3. Sine");
                            System.out.println("4. Cosine");
                            System.out.println("5. Tangent");
                            System.out.println("6. Logarithm");
                            System.out.println("7. Back to Main Menu");
                            app.newLine();

                            System.out.print("Enter your choice: ");
                            trigChoice = scanner.nextInt();

                            switch (trigChoice) {
                                case 1:                                              // Powers or squres 
                                    System.out.print("Enter base value: ");
                                    float base = scanner.nextFloat();
                                    System.out.print("Enter exponent value: ");
                                    int exponent = scanner.nextInt();
                                    float result = 1;
                                    for (int i = 1; i <= exponent; i++) {
                                        result *= base;
                                    }
                                    System.out.println("Result of Power = " + result);
                                    break;

                                case 2:                                                // Square Root
                                    System.out.print("Enter value: ");
                                    float val = scanner.nextFloat();
                                    System.out.println("Square Root = " + Math.sqrt(val));
                                    break;

                                case 3:                                                 // Sine using built in math operation using math class
                                    System.out.print("Enter value (in radians): ");
                                    float sineInput = scanner.nextFloat();
                                    System.out.println("Sine = " + Math.sin(sineInput));
                                    break;

                                case 4:                                                 // Cosine using built in math operation using math class
                                    System.out.print("Enter value (in radians): ");
                                    float cosInput = scanner.nextFloat();
                                    cosine = (float) Math.cos(cosInput);
                                    System.out.println("Cosine = " + cosine);
                                    break;

                                case 5:                                                 // Tangent using built in math operation using math class
                                    System.out.print("Enter value (in radians): ");
                                    float tanInput = scanner.nextFloat();
                                    tangent = (float) Math.tan(tanInput);
                                    System.out.println("Tangent = " + tangent);
                                    break;

                                case 6:                                                 // Logarithm using built in math operation using math class
                                    System.out.print("Enter value: ");
                                    float logInput = scanner.nextFloat();
                                    logarithm = (float) Math.log(logInput);
                                    System.out.println("Natural Logarithm = " + logarithm);
                                    break;

                                case 7:
                                    System.out.println("Returning to Main Menu...");
                                    break;

                                default:
                                    System.out.println("Invalid option! Please try again.");
                            }
                        }
                        break;

                    case 3:                                                             // Exit and printing my team names 
                        app.newLine();
                        System.out.println("\t\t\t\t -------- Thanking You --------");
                        app.newLine();
                        System.out.println("\t\t\t\t Uday Sai   - BCA (Data Science)");
                        System.out.println("\t\t\t\t Bhargavi   - BCA (Data Science)");
                        System.out.println("\t\t\t\t Ravi Teja  - BCA (Data Science)");
                        System.out.println("\t\t\t\t Sanjay     - BCA (Data Science)");
                        app.newLine();
                        System.out.println("\t\t\t\t ----------- Exiting -----------");
                        break;

                    default:
                        System.out.println("Invalid main menu option! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input type! Please enter numbers only.");
                scanner.nextLine();                                                         // clear invalid input or taking new intput 
            }
        }

        scanner.close();                                                                   //scanner class closing function 
    }
}
