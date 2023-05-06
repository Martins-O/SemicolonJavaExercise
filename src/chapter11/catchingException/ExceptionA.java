package chapter11.catchingException;

public class ExceptionA {

    public void tryCatch() {
        String condition = null;
        try {
            condition = " ";

        } catch (IllegalArgumentException e) {
            System.out.println("Exception error:" + condition);
        }catch (NullPointerException e){
            System.out.println("Exception caught");
        }catch (RuntimeException e){
            System.out.println("Exception caught");
        }
    }
}
