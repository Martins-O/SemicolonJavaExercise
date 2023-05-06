package Bike;

public class Bike {

    private boolean status;
    private String gearType;
    private int speed;

    public boolean isOn() {
        return status;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public void accelerate() {
        if (status) {
            if (speed >= 0 && speed < 21) {
                speed = speed + 1;
            } else if (speed >= 21 && speed <= 30) {
                speed = 2+speed;
            } else if (speed >= 31 && speed <= 40) {
                speed = speed + 3;
            } else if (speed >= 41) {
                speed = speed + 4;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (status == true) {
            if (speed >= 41) {
                speed = speed - 4;
            }

            else if (speed >= 31) {
                    speed = speed - 3;
                }
            else if (speed >= 21) {
                speed = speed - 2;
            }
            else if (speed >= 0) {
                speed = speed - 1;
            }
        }
    }

        public String getGearType () {
            if (status == true) {
                if (speed >= 41) {
                    return "Gear4";
                }
                if (speed >= 31) {
                    return "Gear3";
                }
                if (speed >= 21) {
                    return "Gear2";
                }
                if (speed >= 0) {
                    return "Gear1";
                }
            }
            return "No Gear Type Available!";
        }
    }
