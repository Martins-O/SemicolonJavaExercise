package chapter7.archeryGame;

public class ArcheryGame {
    private Player[] players;

    public ArcheryGame(int numberOfArchers){
        players = new Player[numberOfArchers];
    }

    public Player[] getPlayers(){
        return players;
    }
}
