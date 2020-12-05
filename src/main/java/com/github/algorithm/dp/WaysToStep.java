package com.github.algorithm.dp;

public class WaysToStep {

    public int waysToStep(int n) {
        if (n <= 2) {
            return n;
        }

        long n1 = 1, n2 = 2, n3 = 4;
        for (int i = 4; i <= n; i++) {
            long temp = (n1 + n2 + n3) % 1000000007;
            n1 = n2 % 1000000007;
            n2 = n3 % 1000000007;
            n3 = temp;
        }

        return (int) n3;
    }

    public static void main(String[] args) {
        WaysToStep waysToStep = new WaysToStep();
        waysToStep.waysToStep(61);
    }
}
