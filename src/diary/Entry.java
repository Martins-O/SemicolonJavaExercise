package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private int id;
    private String statement;
    private String title;
    private LocalDateTime timeOfEntry;
    public Entry(int id, String statement, String title) {
        this.title = title;
        this.statement = statement;
        timeOfEntry = LocalDateTime.now();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getStatement() {
        return statement;
    }

    public String  getTitle() {
        return title;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
        return String.format("""
                ==========================
                Entry %s
                Written on %s
                Title: %s
                Body: %s
                ==========================
                """, id,time,title,statement);
//        final StringBuffer sb = new StringBuffer("Entry{");
//        return "Entry{" +
//                "id=" + id +
//                ", statement='" + statement + '\'' +
//                ", title='" + title + '\'' +
//                ", timeOfEntry=" + timeOfEntry +
//                '}';
//        return sb.toString();
    }
}
