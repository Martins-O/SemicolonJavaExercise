package enumfolder;

public enum Region {
    SOUTH_SOUTH("a","b"),
    SOUTH_WEST("", ""),
    NORTH("","");

    private String[][] states = new String[2][2];
//     Region(String[][] states){
//         this.states = states;
//     }

    Region(String s, String s1) {

    }
}
