package com.leetcode.editor.cn.week_2nd;
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 366 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
public class N242_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s == t){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        if (s.length() != t.length()){
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        int idx = 0;
        while(idx < sChars.length){
            if (sChars[idx] != tChars[idx]){
                return false;
            }
            idx++;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
