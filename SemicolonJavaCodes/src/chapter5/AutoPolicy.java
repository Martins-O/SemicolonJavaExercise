package chapter5;
//(Modified AutoPolicy Class) Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
//        state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
//        for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
//        and VT for Vermont. In AutoPolicy method setState, use the logical OR (||) operator
//        (Section 5.9) to create a compound condition in an if…else statement that compares the method’s
//        argument with each two-letter code. If the code is incorrect, the else part of the if…else statement
//        should display an error message. In later chapters, you’ll learn how to use exception
//        handling to indicate that a method received an invalid argument.

public class AutoPolicy {
    int accountNumber;
    String makeAndModel;
    static String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
    public void setState(String state) {
        if (state == "CT" || state == "MA" || state == "ME" || state == "VT" || state == "NH" || state == "NJ" || state == "NY" || state == "PA") {
            this.state = state;
        }else{
            System.out.println("you Input Wrong State!!!");
        }
    }
    public static String getState(){
        return state;
    }
    public static boolean isNoFaultState(){
        boolean noFaultState;
        switch (getState()){
            case "MA":
            case "NJ":
            case "NY":
            case "VT":
            case "CT":
            case "ME":
            case "PA":
            case "NH":
                noFaultState =true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }
}
