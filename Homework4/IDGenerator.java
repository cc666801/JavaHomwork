package Homework4;

public class IDGenerator {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] randomChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};
        int[] numberArray = {10, 11, 12, 13, 14, 15, 16, 17, 34,
                18, 19, 20, 21, 22, 35, 23, 24, 25,
                26, 27, 28, 29, 32, 30, 31, 32};// A-Z對應的數字
        int checkNum = 0;

        for(int i = 0; i < 9; i++) {
            if (i == 0) { // First char random A-Z (10 - 35)
                int randomCount = (int) (Math.random()*26 + 10);
                stringBuilder.append(randomChar[randomCount]);
            }else if(i == 1) { // Second char random 1-2
                int randomCount = (int) (Math.random()*2 + 1);
                stringBuilder.append(randomChar[randomCount]);
            }else {// 3rd - 8th char random 0-9
                int randomCount = (int) (Math.random()*10);
                stringBuilder.append(randomChar[randomCount]);
            }
        } // Final char is check code
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (i == 0) {
                checkNum += numberArray[((int) stringBuilder.charAt(0)) - 65]/10;
                checkNum += numberArray[((int) stringBuilder.charAt(0)) - 65]%10 * 9;
            }else {
                checkNum += (stringBuilder.charAt(i) - 48)*(9-i);
            }
        }
        int result = 10 - checkNum%10;
        stringBuilder.append(result%10);
        System.out.println(stringBuilder);

    }
}
