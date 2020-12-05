package com.github.algorithm.dp;

public class CuttingRope {
    public int cuttingRope(int n) {
        if(n == 2){
            return 1;
        }else if(n == 3){
            return 2;
        }

        int t = n / 3;
        int r = n % 3;
        if(r == 0){
            return (int) Math.pow(3, t);
        }else if(r == 1){
            return (int) Math.pow(3, t-1) * 4;
        }else if(r == 2){
            return (int) Math.pow(3, t) * 2;
        }

        return -1;
    }
}
