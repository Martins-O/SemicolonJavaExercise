package practiceAll;

public class AlphaNumeric {

    public int totalNumbers(String numeric){
        int sum = 0;

        for (int i = 0; i < numeric.length(); i++) {
            String ch = ""+numeric.charAt(i);

            for(int j = 0; j < 10; j++){
                if(ch.equals(Integer.toString(j))){
                    sum++;
                }
            }
        }

        return sum;
    }
//    public static int count(String text){
//        int numberOfDigits = 0;
//        for (int i = 0; i <text.length() ; i++) {
//            if (Character.isDigit());
//        }
//    }

//    public static void main(String[] args) {
//        String numb = "g12g3h3k2g2";
//        System.out.println(totalNumbers(numb));
//    }
}
