package chibuzorAssignment;

public class TddReverse {
    public static int[] reverse(int[] userArray){
        int[] reverseArray = new int[userArray.length];
        int backwardCounter = userArray.length-1;
        int forwardCounter = 0;
        while (backwardCounter != -1){
            reverseArray[forwardCounter] = userArray[backwardCounter--];
        }
        return reverseArray;
    }
    public static  String reverse (String userString){
        String reversedString="";
        int backwardCounter = userString.length()-1;
        while(backwardCounter != -1){
            reversedString +=userString.charAt(backwardCounter--);
        }
        return reversedString;
    }

}
