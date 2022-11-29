package diary;

public class Diary {

    private boolean isLocked = true;
    private String password;

    public Diary(String password, String ownersName) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unLockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if(passwordMatches) {
            isLocked = false;
        }
    }

    public void lock() {
        isLocked = true;
    }

    public void write(String statement) {

    }

    public int numberOfHappenings() {
        return 0;
    }
}
