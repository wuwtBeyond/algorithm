package com.github.algorithm.str;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {

    /**
     * 负数 循环 0
     * @param numerator
     * @param denominator
     * @return
     */
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (numerator > 0 ^ denominator > 0) {
            sb.append("-");
        }
        long n = Math.abs(Long.valueOf(numerator));
        long d = Math.abs(Long.valueOf(denominator));
        // a 商 b 余数
        long a = 0, b = 0;
        // key 被除数  value 在sb中的位置
        Map<Long, Integer> map = new HashMap<>();
        a = n / d;
        b = n % d;
        if (b == 0) {
            return sb.append(a).toString();
        }
        sb.append(a).append(".");
        while (b != 0) {
            if (map.containsKey(b)) {
                sb.insert(map.get(b), "(");
                sb.append(")");
                break;
            }
            map.put(b, sb.length());
            b *= 10;
            sb.append(b/d);
            b %= d;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        FractionToDecimal main = new FractionToDecimal();
        System.out.println(main.fractionToDecimal(7, -12));
    }
}
