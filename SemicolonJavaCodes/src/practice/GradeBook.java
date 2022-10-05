package practice;

public class GradeBook {
    private String courseName;
    private int [][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }
        public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }
    public void processGrade(){
        outputGrades();
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is: ", getMinimum(),
                "Highest grade in the grade book is: ", getMaximum());

        outputBarChart();
    }
    private int getMinimum() {
        int lowGrades = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grades : studentGrades) {
                if (grades < lowGrades) {
                    lowGrades = grades;
                }
            }

        }
        return lowGrades;
    }
    private int getMaximum() {
        int highGrades = grades[0][0];
        for (int [] studentGrades :
             grades) {
            for (int grades :
                 studentGrades) {
                if (grades > highGrades) {
                    highGrades = grades;

                }

            }
            
        }
        return highGrades;
    }
    public double getAverage(int [] setOfGrades){
        var total = 0;

        for (int grades :
             setOfGrades) {
            total+= grades;
        }
        return (double) total / setOfGrades.length;
    }

    private void outputBarChart() {
        System.out.println("Overall Grades distribution: ");
        int[] frequency = new int [11];

        for (int [] studentGrades : grades) {
            for (int grades : studentGrades) {
                ++frequency [grades / 10];

            }
        }
        for (int i = 0; i < frequency.length ; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        i * 10, i * 10 + 9);
            }
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("      ");

        for (int t = 0; t < grades[0].length; t++) {
            System.out.printf("  Test %d  ", t + 1);
        }
        System.out.println("   Average");

        for (int g = 0; g < grades.length; g++) {
            System.out.printf("Student %2d ", g + 1);

            for (int test : grades[g]) {
                System.out.printf("%8d ", test);
            }
            double average = getAverage(grades[g]);
            System.out.printf("%9.2f%n", average);
        }
    }

    public static void main(String[] args) {
        int gradesArray[] [] ={{87, 96, 70},
                               {68, 87, 90},
                               {94, 100, 90},
                               {100, 81, 82},
                               {100, 81, 82},
                               {78, 87, 65},
                               {85, 75, 83},
                               {91, 94, 100},
                               {76, 72, 84},
                               {87, 93, 73}};
        GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to grade book for%n%s%n%n",
                gradeBook.getCourseName());
        gradeBook.processGrade();

    }
}