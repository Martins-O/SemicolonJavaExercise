package chapter6.coinTossing;

public class CoinTossingMain {
    public static void main(String[] args) {
        CoinTossing coin = new CoinTossing();
        String message = """
                press 1 to toss the coin 
                or 2 ro quit""";
        int user = Integer.parseInt(coin.userInput(message));
        if (user == 1) {
            while (user == 1) {
                int side = coin.tossCoin();
                Status headOrTail = coin.checkSides(side);
                System.out.println(headOrTail);
                user = Integer.parseInt(coin.userInput(message));
            }
        }
        else System.exit(0);

        System.out.println("The total counting for head is "+coin.getHeadCount());
        System.out.println("The total counting for tail is "+coin.getTailCount());

    }
}
