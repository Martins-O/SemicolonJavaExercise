package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private boolean isLocked = true;
    private String password;
    private List<Entry> entries = new ArrayList<>();

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

    public void write(String body, String title){
        if (isLocked)throw new IllegalArgumentException("You cannot write while is locked");
        writeIntoDiary(title, body);
    }
    private void writeIntoDiary(String statement, String title) {
        int id = numberOfHappenings()+1;
        Entry entry = new Entry(id, statement, title);
        entries.add(entry);
    }

    public int numberOfHappenings() {
        return entries.size();
    }

    public Entry findEntryWithId(int id) {
        for (Entry entry: entries) {
            if (entry.getId()== id) {
                return entry;
            }
        }
        return null;
    }

}
