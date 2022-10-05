package practice;



import static jdk.internal.org.jline.keymap.KeyMap.display;

import static org.junit.jupiter.api.Assertions.*;

class ChapterEightTimeApp {
   public static void main(String[] args) {
        ChapterEightTime chapterEightTime = new ChapterEightTime();

        chapterEightTime.setTime(13, 27, 6);
        displayTime("After time is created", chapterEightTime);
        System.out.println();

        chapterEightTime.setTime(13, 27, 6);
        displayTime("After calling setTime", chapterEightTime);

        try {
            chapterEightTime.setTime(99,99,99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", chapterEightTime);
//       System.out.println();



//       int a = 10;
//       System.out.println("AAA");
//       if (a == 10)
//           System.exit(12);
//       System.out.println("BBB");
   }

    private static void displayTime(String header, ChapterEightTime c) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, c.toUniversalString(), c.toString());
    }
}