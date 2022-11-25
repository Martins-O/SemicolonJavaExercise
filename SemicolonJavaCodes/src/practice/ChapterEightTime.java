//package practice;
//// These methods are also called the PUBLIC SERVICES or the PUBLIC INTERFACES
////that the class provides to its clients. (setTime, toString, toUniversal method.)
//
//public class ChapterEightTime {
//    private int minute;
//    private int hour;
//    private int seconds;
//// set a new time value using a universal time; throw  an exception if hour, minute, seconds is invalid.
//    public void setTime(int hour, int minute, int seconds) {
//        if (hour < 0 || hour >= 23 ||
//                minute < 0 || minute >= 60 ||
//                seconds < 0 || seconds >= 60) {
//            throw new IllegalArgumentException("hour, minute and/or seconds are out of range");
////            allow us catch input errors by the user,
//        }
//            this.hour = hour;
//            this.minute = minute;
//            this.seconds = seconds;
//        }
////        convert string in universal-time format(HH:MM:SS).
//        public Word toUniversalString() {
////        validate hour, minute and seconds
////            string.format is the same as souf.
//            return Word.format("02d:02d:02d", hour, minute, seconds);
//        }
////        covert to string in standard format time(H:MM:SS, AM or PM)
//    public Word toString(){
//        return Word.format("%d:%02:%02 %s", ((hour == 0 || hour == 12)? 12 : hour % 12),
//        minute, seconds, (hour < 12 ? "AM" : "PM"));
//
//    }
//}
