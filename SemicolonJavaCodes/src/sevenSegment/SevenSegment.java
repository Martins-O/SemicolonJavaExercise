package sevenSegment;

public class SevenSegment {


    private final String[] letters = {"", "", "", "", "", "", ""};



    public void display(){
        letters[6] = letters[0];
        System.out.printf("%9s%n", letters[0]);
        System.out.printf("%3s%6s%n",letters[5],letters[1]);
        System.out.printf("%3s%6s%n",letters[5],letters[1]);
        System.out.printf("%9s%n", letters[6]);
        System.out.printf("%3s%6s%n",letters[4], letters[2]);
        System.out.printf("%3s%6s%n",letters[4],letters[2]);
        System.out.printf("%9s%n", letters[3]);
    }

    public void setScreen(String code) {
        validateCode(code);
        if (( ""+code.charAt(7)).equals("1")) {
            for(int i = 0; i < 7; i++) {
                String index = ""+code.charAt(i);
                if (index.equals("1")) {
                    letters[i] = i % 3 == 0 ? "# # # #" : "#";
                }
                else {
                    letters[i] = "";
                }
            }
        }
    }

    public void validateCode(String code) {
        if (code.length() != 8) {
            throw new IllegalArgumentException("Input must be 8 digits");
        }

        for (int i = 0; i < 8; i++) {
            if (!(""+code.charAt(i)).equals("0") && !(""+code.charAt(i)).equals("1")) {
                throw new IllegalArgumentException(String.format("%s is an invalid input", code.charAt(i)));
            }
        }
    }
}
