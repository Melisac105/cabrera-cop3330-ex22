package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public int getNum(String type) {
        System.out.printf("Enter the %s number: ", type);
        return input.nextInt();
    }
}
