package util;

public class Processing {

    static public int getLargerNum(int num1, int num2, int num3) {
        if(num1 == num2 && num1 == num3) {
            System.exit(0);
        }
        else if(num1 > num2 && num1 > num3){
            return num1;
        }
        else if(num2 > num3 && num2 > num1){
            return num2;
        }
        else if(num3 > num2 && num3 > num1){
            return num3;
        }
        return 0;
    }
}
