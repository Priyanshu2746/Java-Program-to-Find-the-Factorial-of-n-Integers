import java.util.Arrays;

class FactorialException extends Exception {
    private int num;

    // Constructor to set the invalid number that caused the exception
    public FactorialException(int num) {
        this.num = num;
    }

    // Overridden toString method to display the exception message along with the invalid number
    public String toString() {
        return "FactorialException: " + num + " is out of range (0 to 15)";
    }
}

public class Factorial {
    // Method to calculate the factorial of a given number using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Declare variables
        int[] nums = new int[args.length];
        int i, num, result;

        // Convert the command line arguments to integers and store in an array
        try {
            for (i = 0; i < args.length; i++) {
                num = Integer.parseInt(args[i]);
                if (num < 0 || num > 15) {
                    // Throw the custom exception if the number is out of range
                    throw new FactorialException(num);
                }
                nums[i] = num;
            }

            // Calculate the factorial for each number in the array and output the result to the console
            for (i = 0; i < nums.length; i++) {
                result = factorial(nums[i]);
                System.out.println("Factorial of " + nums[i] + " is " + result);
            }
        } catch (NumberFormatException e) {
            // Handle the case where a non-integer input is provided in the command line
            System.out.println("Please enter integers only");
        } catch (FactorialException e) {
            // Handle the case where the input is out of range
            System.out.println(e.toString());
        }
    }
}
