package Homework4;

import java.util.Arrays;

public class CheckID2 {


    public boolean checkID(String id) {
        int checkNum = 0;
        boolean isCorrect = true;
        int[] numberArray = {10, 11, 12, 13, 14, 15, 16, 17, 34,
                18, 19, 20, 21, 22, 35, 23, 24, 25,
                26, 27, 28, 29, 32, 30, 31, 32};// A-Z對應的數字
        int[] arr = new int[id.length()];
        for (int i = 0; i < id.length(); i++) {
            arr[i] = (int) id.charAt(i);
        }
        System.out.println(Arrays.toString(arr));

        if (id.length() != 10) {
            isCorrect = false;
            System.out.println("Id should have 10 char! ");
        } else if (arr[0] < 65 || arr[0] > 90) { // Check first char
            isCorrect = false;
            System.out.println("First char is not uppercase! ");
            // Char "1" ascii code = 49
        } else if (arr[1] != 49 && arr[1] != 50) { // Check second char
            isCorrect = false;
            System.out.println(((int) arr[1]));
            System.out.println("Second char is not 1 or 2 ! ");
        } else if ((int) arr[2] > 57 || (int) arr[2] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        } else if (arr[3] > 57 || arr[3] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        } else if (arr[4] > 57 || arr[4] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        } else if (arr[5] > 57 || arr[5] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        } else if (arr[6] > 57 || arr[6] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        } else if (arr[7] > 57 || arr[7] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        } else if (arr[8] > 57 || arr[8] < 48) {
            System.out.println("The 3rd - 9th char is not number! ");
            isCorrect = false;
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    checkNum += numberArray[((int) arr[0]) - 65]/10;
                    checkNum += numberArray[((int) arr[0]) - 65]%10 * 9;
                }else {
                    System.out.println(checkNum);
                    System.out.println((arr[i] - 48)*(9-i));
                    checkNum += (arr[i] - 48)*(9-i);
                }
            }
            int result = 10 - checkNum%10;
            if (result % 10 == arr[9] -48) {
                System.out.println("Correct!");
            }else {
                System.out.println("Wrong!");
            }
        }
            return isCorrect;
    }

        public static void main (String[]args){
            String id = "Z171517579";
            System.out.println(id.length());

            CheckID2 ch2 = new CheckID2();
            ch2.checkID(id);
    }
}
