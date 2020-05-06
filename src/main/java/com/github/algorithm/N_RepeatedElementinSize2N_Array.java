package com.github.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : wuwentao
 * @date : 2020/5/7
 */
public class N_RepeatedElementinSize2N_Array {

    public int repeatedNTimes(int[] A) {
        Set<Integer> counts = new HashSet<Integer>();
        for (int i = 0;i < A.length;i ++) {
            if (!counts.add(A[i])) {
                return A[i];
            }
        }

        return 0;
    }
}
