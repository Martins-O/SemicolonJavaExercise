package chapter7.tortiseAndHare;

import java.util.Random;

public class Tortoise {
    private int position;
    private String name;

    public Tortoise(String name) {
        this.name = name;
        this.position = 1;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(){
        Random random = new Random();
        int move = random.nextInt(10) + 1;

        if (this.name.equals("Tortise")){
            if (move <= 5){
                position +=3;
            }else if (move <= 7){
                position -=6;
            } else  {
                position +=1;
            }
        } else if (this.name.equals("Hare")) {
            if (move <= 2){
                position +=9;
            }else if (move <= 4){
                position -=12;
            } else if (move <= 8) {
                position +=1;
            } else {
                position -=2;
            }
        }
    }
}
