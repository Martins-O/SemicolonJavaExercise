class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(24, 60, 60);
        clock.setHour (23);
        clock.setMinutes(40);
        clock.setSeconds(60);

        System.out.print(" "+clock.getHour());
        System.out.print(": "+clock.getMinutes());
        System.out.println(": "+clock.getSeconds());


       // System.out.printf("%d%n%d%n%d%n ", Clock.getHour);
    }
}