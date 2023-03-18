package com.easy.leetcode;

public class IsPalindrom {
    public static void main(String[] args) {
        //int num = -121;
        int num  = 121;
        boolean result = isPalindrome(num);
        System.out.println(result);
    }
    private static boolean isPalindrome(int x) {

        int num = 0;
        int temp = x;

        if(x< 0) return false;
        while(x>0){
            num = (num*10) + x%10;
            x = x/10;
        }
        if(temp == num) {return true;}
        return false;
    }
}
