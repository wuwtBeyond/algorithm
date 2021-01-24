package com.github.algorithm.str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/3
 */
public class Queens_That_Can_Attack_the_King {

    /**
     * 横向 横坐标相同
     * 纵向 纵坐标相同
     * 对角线 1，横+纵 相等
     *       2，横和纵有相同的距离
     *
     * 更新：以queue为起点，从8个方向去寻找
     * @param queens
     * @param king
     * @return
     */
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();

        boolean[][] locs = new boolean[8][8];
        for (int i = 0; i < queens.length; i++) {
            locs[queens[i][0]][queens[i][1]] = true;
        }

        int x_king = king[0];
        int y_king = king[1];
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int x, y;
                for (int k = 1; k <= 8; k++) {
                    x = x_king + i * k;
                    y = y_king + j * k;
                    if (x >= 0 && x < 8 && y >= 0 && y < 8 && locs[x][y]) {
                        List<Integer> list = new ArrayList<>();
                        list.add(x);
                        list.add(y);
                        res.add(list);
                        break;
                    }
                }
            }
        }

        return res;
    }
//        Map<Integer, int[]> map = new HashMap<>();
//        for (int i = 0;i < queens.length;i ++) {
//            int x = queens[i][0];
//            int y = queens[i][1];
//
//            if (x == x_king) {
//                if (!map.containsKey(x)) {
//                    int[] coordinates = new int[2];
//                    coordinates[0] = y;
//                    map.put(x, coordinates);
//                }
//                if (y > y_king) {
//                    int[] temp = map.get(x);
//
//                }
//
//
//            }else if (y == y_king) {
//
//            }else if (x+y == x_king+y_king) {
//
//            }else if (x-x_king == y-y_king) {
//
//            }
//
//        }

//        return null;
//    }
}
