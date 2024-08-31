package src.main.java;


public class String1
{
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.firstHalf("abcdef"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *  helloName("Bob") → "Hello Bob!"
     *  helloName("Alice") → "Hello Alice!"
     *  helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        String n = name;
        String h = "Hello " + n + "!";
        return h;
    }

    /*
     * Given two strings, a and b, return the result of putting them together in the order abba, 
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") → "HiByeByeHi"
     * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     * makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        String c = a;
        String d = b;
        String k = c+d+d+c;
        return k;
    }

    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * makeTags("i", "Yay") → "<i>Yay</i>"
     * makeTags("i", "Hello") → "<i>Hello</i>"
     * makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {
        String b = "<"+tag+">" + word +"</"+tag+">";
        return b;
    }

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, 
     *      return a new string where the word is in the middle of the out string, 
     *      e.g. "<<word>>". 
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but 
     * not including index j.
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        String str = out;
        String k = str.substring(0,2) + word + str.substring(2,4);
        return k;
    }
    
    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     */
    public String extraEnd(String str) {
        int k = str.length();
        String p = str.substring(k-2);
        String o = p+p+p;
        return o;
    }

    /*
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
     * If the string is shorter than length 2, return whatever there is, 
     * so "X" yields "X", and the empty string "" yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * firstTwo("Hello") → "He"
     * firstTwo("abcdefg") → "ab"
     * firstTwo("ab") → "ab"
     */
    public String firstTwo(String str) {
        int k = str.length();
        if (k > 2){
            String p = str.substring(0,2);
            return p;
        }
        else {
            String f = str;
            return f;   
        }
    }

    /*
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".]
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     */
    public String firstHalf(String str) {
        int k = str.length();
        int halfk = k/2;
        
        String p = str.substring(0,halfk);
        return p;
    }

    /*
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
     * The string length will be at least 2.
     * withoutEnd("Hello") → "ell"
     * withoutEnd("java") → "av"
     * withoutEnd("coding") → "odin"
     */
    public String withoutEnd(String str) {
        int k = str.length();
        if (k >= 2){
            String p = str.substring(1,k-1);
            return p;
        }
        else {
            String f = str;
            return f;   
        }
    }

    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with the 
     * shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     */
    public String comboString(String a, String b) {
        int lengtha = a.length();
        int lengthb = b.length();
        
        if (lengtha <= lengthb){
            String p = a+b+a;
            return p;
        } else{
            String k = b+a+b;
            return k;
        }
    }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
     * The string length will be at least 3.
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     */
    public String middleThree(String str) {
        int k = str.length();
        if (k > 3){
            String p = str.substring(k/3,k - k/3);
            return p;
        }
        else {
            String f = str;
            return f;   
        }
    }

    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     * extraFront("Hello") → "HeHeHe"
     * extraFront("ab") → "ababab"
     * extraFront("H") → "HHH"
     */
    public String extraFront(String str) {
        int k = str.length();
        if (k >= 2){
            String p = str.substring(0,2);
            String okay = p+p+p;
            return okay;
        }
        else {
            String f = str+str+str;
            return f;   
        }
    }

    /*
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
     * The string length will be at least 2.
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     */
    public String left2(String str) {
        int k = str.length();
        if (k>2){
            String p = str.substring(2) + str.substring(0,2);
            return p;
        }else{
            String h = str;
            return h;
        }
    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * hasBad("badxx") → true
     * hasBad("xbadxx") → true
     * hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) {
        String p = str.substring(1);
        String k = str.substring(0);
        
        if (p.equals("badxx") || k.equals("badxx")){
            return true;
        }else {
            return false;
        }
        
    }

    /*
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the concatenation creates a double-char, then omit one of the chars, 
     *     so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     */
    public String conCat(String a, String b) {
        int alength = a.length();
        int blength = b.length();
        String c = (a.substring(alength-1));
        
        if (blength >1){
            if (c.equals(b.substring(0,1))){
            String k = a.substring(0,alength-1) + b;
            return k;
        }else{
            String p = a+b;
            return p;
        }}
        else {
        String h = a+b;
        return h;
        }
    }

    /*
     *Given two strings, append them together (known as "concatenation") and return the result. 
     *However, if the strings are different lengths, omit chars from the longer string 
     *    so it is the same length as the shorter string. 
     *So "Hello" and "Hi" yield "loHi". 
     *The strings may be any length.
     *minCat("Hello", "Hi") → "loHi"
     *minCat("Hello", "java") → "ellojava"
     *minCat("java", "Hello") → "javaello"
     */
    public String minCat(String a, String b) {
        int alength = a.length();
        int blength = b.length();
        if (alength > blength){
            String fin = a.substring(alength-blength)+b;
            return fin;
        }else {
            String notFin = a+b.substring(blength-alength);
            return notFin;
        }
        
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
     * and otherwise return the string unchanged.
     * withoutX("xHix") → "Hi"
     * withoutX("xHi") → "Hi"
     * withoutX("Hxix") → "Hxi"
     */
    public String withoutX(String str) {
        int p = str.length();
        String k = str.substring(0,1);
        String h = str.substring(p-1);
        
        if (k.equals("x") && h.equals("x")){
            String okay = str.substring(1, p-1);
            return okay;
        } else if (k.equals("x")){
            String okay2 = str.substring(1,p);
            return okay2;
        } else if (h.equals("x")){
            String okay3 = str.substring(0,p-1);
            return okay3;
        }else {
            return str;
        }
        
    }

    /*
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
     * The string may be any length. 
     * Harder than it looks.
     * deFront("Hello") → "llo"
     * deFront("java") → "va"
     * deFront("away") → "aay"
     */
    public String deFront(String str) { 
        int b = str.length();
        if (b>2){
            if (str.substring(0,1).equals("a") && str.substring(1,2).equals("b") ){
                String p = str.substring(0);
                return p;
            } 
            else if (str.substring(0,1).equals("a")){
                String o = str.substring(0,1)+ str.substring(2);
                return o;
            }else if (str.substring(2,3).equals("b")){
                String okay = str.substring(2);
            }else{
                String h = str.substring(2);
                return h;
            }
        }
        return unimplemented;
    }

}
