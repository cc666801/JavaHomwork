package Homework4;

public class Verifier {

    public static void main (String[]args) {
        // (1)
//        int num = 0;
//        StringBuilder stringBuilder1 = new StringBuilder();
//        for (int i = 0; i < 4; i++) {
//            num =(int) (Math.random()*10);
//            stringBuilder1.append(num);
//        }
//        System.out.println(stringBuilder1);

        //(2)
//        int num = 0;
//        StringBuilder stringBuilder2 = new StringBuilder();
//        // Add 4 number to stringBuilder
//        for (int i = 0; i < 4; i++) {
//            // Check number is repeat or not
//            num =(int) (Math.random()*10);
//            for (int j = 0; j < stringBuilder2.length(); j++) {
//                while((int) stringBuilder2.charAt(j) == (num + 48)) {
//                    num =(int) (Math.random()*10);
//                    j = 0;
//                }
//            }
//            stringBuilder2.append(num);
//        }
//        System.out.println(stringBuilder2);

        // (3)

        char[] verifilerChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7',
                                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                                            'G', 'H', 'I', 'J', 'K', 'L', 'M',
                                            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                                            'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder stringBuilder3 = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random()*36);
            stringBuilder3.append(verifilerChar[index]);
        }

        System.out.println(stringBuilder3);
    }
}
