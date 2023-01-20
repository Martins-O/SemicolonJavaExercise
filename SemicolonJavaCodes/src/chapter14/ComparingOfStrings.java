package chapter14;

/*14.4
(Comparing Portions of Strings) Write an application that uses
String method region-Matches to compare two strings input by the user.
The application should input the number of characters to be
compared and the starting index of the comparison. The
application should state whether the compared characters are equal.
Ignore the case of the characters when performing the
comparison.*/

public class ComparingOfStrings {
    public String compareTwoStrings(String firstInput, String secondInput, int startingPoint, int endPoint){
        if(firstInput.regionMatches(startingPoint,secondInput
                ,startingPoint, endPoint)){
            return "The word are the same!";
        }else if(firstInput.regionMatches(true, startingPoint, secondInput,
                startingPoint, endPoint)){
            return "The word are the same with ignorecase!.";
        }
            return "They are not equal!";
    }

    public static void main(String[] args) {
        String word1 = "Martins";
        String word2 = "martins";
        int start = 0;
        int end = word1.length();
        ComparingOfStrings strings = new ComparingOfStrings();
        System.out.println(strings.compareTwoStrings(word1, word2, start, end));
    }
}
