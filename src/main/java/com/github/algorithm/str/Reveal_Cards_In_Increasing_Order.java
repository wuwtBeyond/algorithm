package com.github.algorithm.str;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : wuwentao
 * @date : 2020/5/1
 */
public class Reveal_Cards_In_Increasing_Order {

    /**
     * queue代表最终结果的下标值，模拟操作逻辑
     * @param deck
     * @return
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck == null || deck.length <= 1) return deck;

        Arrays.sort(deck);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0;i < deck.length;i ++) {
            queue.add(i);
        }

        int[] res = new int[deck.length];
        for (int i = 0;i < deck.length;i ++) {
            res[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }

        return res;
    }
}
