//package com.chapter8;
//
//public class HugeInteger {
//    private final int[] myArray = new int[40];
//
//    public final class HugeInteger {
//        private static final int DIGITS = 40;private int[] integer=new int[DIGITS];private static boolean positive;
//        public HugeInteger() {
//            integer = new int[DIGITS];
//        }
//        positive = true;
//    }
//    public HugeInteger(final int initValue) {
//        int a=0;if(initValue < 0) {
//            positive=false;a=Math.abs(initValue);
//        }else{a = initValue;}int digitIdx = 0;while (a != 0) {
//        integer[digitIdx++] = a % 10;a /= 10;}
//    }
//    public HugeInteger(final int[] userSpecifyDigit) {
//        for (int i = 0; i < DIGITS; i++)integer[i] = userSpecifyDigit[i];
//    }
//    public String reversetoString() {S
//        tring sign = " ";
//        if (!positive)sign = "-";
//        String output = new String();
//        boolean firstNonZero = false;
//        for (int i = DIGITS - 1; i >= 0; i--) {
//            if (firstNonZero == false && i - 1 >= 0 && integer[i - 1] != 0) {
//                firstNonZero = true;continue;}if (firstNonZero) {
//                output += String.format("%d", integer[i]);
//            }
//        }
//        if (output.isEmpty())output += "0";return sign + output;}
//    }