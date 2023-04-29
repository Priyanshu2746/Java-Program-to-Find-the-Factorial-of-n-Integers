# Java-Program-to-Find-the-Factorial-of-n-Integers
This is a Java program that accepts 'n' integers as command line arguments and calculates the factorial of each integer. The program also includes a custom exception class called FactorialException which validates the input values to be in a certain range and throws an exception if the input values are not valid.

How to Run the Program:  

To run the program, follow these steps:

Ensure that Java is installed on your machine.
Download or clone the source code from the repository.
Open a terminal or command prompt and navigate to the directory containing the source code.
Compile the program by executing the command: javac Factorial.java
Run the program by executing the command: java Factorial <n1> <n2> <n3> ... <n>
where <n1>, <n2>, <n3>, ..., <n> are the integer values for which the factorial needs to be calculated.
Error Handling
The program includes error handling to handle the following exceptions:

NumberFormatException: This exception is thrown when an ill-formed command line argument is provided. The program catches this exception and outputs an error message to the console.
FactorialException: This exception is thrown when an integer value outside the valid range (0 <= n <= 15) is provided as a command line argument. The program catches this exception and outputs an error message to the console along with the value that caused the exception.
Custom Exception Class
The program includes a custom exception class called FactorialException which extends the Exception class. This class is used to validate the input values and throw an exception if the values are outside the valid range. The FactorialException class includes the following methods:

FactorialException(String message): This is the constructor for the FactorialException class. It accepts a message as a parameter and sets the message for the exception.
toString(): This method overrides the toString() method of the Exception class and returns the message for the exception.
