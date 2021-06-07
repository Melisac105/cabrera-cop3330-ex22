/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 */

import util.Output;
import util.Processing;
import util.UsrInput;

public class App {

    public static void main(String[] args) {
        int num1 = UsrInput.getNum("first");
        int num2 = UsrInput.getNum("second");
        int num3 = UsrInput.getNum("third");
        int largerNum = Processing.getLargerNum(num1, num2, num3);
        Output.printOutput(largerNum);
    }
}
