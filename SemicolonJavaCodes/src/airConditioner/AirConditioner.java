package airConditioner;

public class AirConditioner {

    public int getTemperature(){
        return temperature;
    }
    private int temperature = 16;
    private boolean status;

    public AirConditioner() {
    }

    public void whenAirConditionIsOff(boolean isON) {
    }

    public void turnOn() {
        status = true;
    }

    public boolean isOn() {
        return status;
    }

    public void turnOff() {
        status = false;
    }

    public void increaseTemperature() {
        if(temperature <30){
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if(temperature>16){
            temperature--;
        }

    }

    public void temperature() {
    }
}