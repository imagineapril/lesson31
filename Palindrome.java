package ru.timokhina.algorithm.lesson31;

public class Palindrome {

    static boolean isPalindrome2(String s2){

        StringBuffer rev = new StringBuffer(s2).reverse();
        String strRev = rev.toString();
        if (s2.equals(strRev)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindrome1(String s1){
        int n = s1.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s1.charAt(i) != s1.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1("12121"));
        System.out.println(isPalindrome2("12121"));
        System.out.println(isPalindrome1("мадам"));
        System.out.println(isPalindrome2("мадам"));
    }
}
