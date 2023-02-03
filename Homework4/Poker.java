package Homework4;

import java.util.ArrayList;
import java.util.Arrays;

public class Poker {
    public static void main (String[]args) {
        ArrayList<Integer> cards = new ArrayList<>();
        // Create cards 0-51
        for(int i = 0 ; i < 52; i++) {
            cards.add(i);
        }

        // Create 4 players
        int[] player1 = new int[cards.size()/4];
        int[] player2 = new int[cards.size()/4];
        int[] player3 = new int[cards.size()/4];
        int[] player4 = new int[cards.size()/4];


        // Send cards to player1 and remove 13 card from cards
        for(int i = 0; i < player1.length; i++) {
            int randomCard = (int) (Math.random() * cards.size());
            player1[i] = cards.get(randomCard);
            cards.remove(cards.get(randomCard));
        }

        // Send cards to player2 and remove 13 card from cards
        for(int i = 0; i < player2.length; i++) {
            int randomCard = (int) (Math.random() * cards.size());
            player2[i] = cards.get(randomCard);
            cards.remove(cards.get(randomCard));
        }

        // Send cards to player3 and remove 13 card from cards
        for(int i = 0; i < player3.length; i++) {
            int randomCard = (int) (Math.random() * cards.size());
            player3[i] = cards.get(randomCard);
            cards.remove(cards.get(randomCard));
        }

        // Send cards to player4 and remove 13 card from cards
        for(int i = 0; i < player4.length; i++) {
            int randomCard = (int) (Math.random() * cards.size());
            player4[i] = cards.get(randomCard);
            cards.remove(cards.get(randomCard));
        }

        System.out.println(Arrays.toString(player1));
        System.out.println(Arrays.toString(player2));
        System.out.println(Arrays.toString(player3));
        System.out.println(Arrays.toString(player4));
        System.out.println(cards);
    }
}
