package enumfolder;
import static enumfolder.Region.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
//        Native nati = new Native(Day.MONDAY);
//        out.println(nati.getDateOfBirth());
        Native region = new Native(SOUTH_SOUTH);
        out.println(region.getQuest());
        
    }
}
