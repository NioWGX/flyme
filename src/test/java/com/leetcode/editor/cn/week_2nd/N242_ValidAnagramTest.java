package com.leetcode.editor.cn.week_2nd;

import org.junit.Assert;
import org.junit.Test;

/**
 * N242_ValidAnagram Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>4ÔÂ 11, 2021</pre>
 */
public class N242_ValidAnagramTest {

    /**
     * Method: isAnagram(String s, String t)
     */
    @Test
    public void testIsAnagram() {
        N242_ValidAnagram validAnagram = new N242_ValidAnagram();
        Assert.assertEquals(true, validAnagram.isAnagram(null, null));
        Assert.assertEquals(false, validAnagram.isAnagram(null, ""));
        Assert.assertEquals(true, validAnagram.isAnagram( "anagram", "nagaram"));
        Assert.assertEquals(false, validAnagram.isAnagram( "rat", "cat"));
    }


} 

