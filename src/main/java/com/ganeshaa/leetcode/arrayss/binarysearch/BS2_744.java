package com.ganeshaa.leetcode.arrayss.binarysearch;

//Hint: Apply ceiling of a no solution here:
public class BS2_744 {
    public static void main(String[] args) {
        BS2_744 app = new BS2_744();
        char nextGreatestLetter = app.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j');
        System.out.println("nextGreatestLetter = " + nextGreatestLetter);
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < letters[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];// we have done this because while loop breaks when start=3, mid=2, end=2
//        and when start = 3 loop breaks, but length of letters array is only till 2;
    }

}
