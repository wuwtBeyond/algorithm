package com.github.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;

public class RestoreIpAddresses {

    private List<String> res = new LinkedList<String>();
    private int seg_count = 4;
    private int[] segments = new int[seg_count];

    /**
     * 输入：s = "25525511135"
     * 输出：["255.255.11.135","255.255.111.35"]
     * @param s
     * @return
     */
    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0, 0);

        return res;
    }

    /**
     * 遍历s，以seg_start为开始的字符串
     * @param s
     * @param seg_id 已填充的分组数量
     * @param seg_start
     */
    private void dfs(String s, int seg_id, int seg_start) {
        if (seg_id == seg_count) {
            if (seg_start == s.length()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < seg_count; i++) {
                    sb.append(segments[i]);
                    if (i != seg_count-1) {
                        sb.append(".");
                    }
                }
                res.add(sb.toString());
            }
            return;
        }
        if (seg_start >= s.length()) {
            return;
        }
        if (s.charAt(seg_start) == '0') {
            segments[seg_id] = 0;
            dfs(s, seg_id+1, seg_start+1);
        }
        int addr = 0;
        for (int seg_end = seg_start; seg_end < s.length(); seg_end ++) {
            addr = addr * 10 + (s.charAt(seg_end)-'0');
            if (addr > 0 && addr < 256) {
                segments[seg_id] = addr;
                dfs(s, seg_id+1, seg_end+1);
            } else {
                break;
            }
        }

    }
}
