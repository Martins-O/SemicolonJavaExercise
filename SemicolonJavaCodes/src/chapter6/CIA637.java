package chapter6;
/*todo (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
todo computer-assisted instruction systems monitor the student’s performance over a period of time. The
todo decision to begin a new topic is often based on the student’s success with previous topics. Modify
todo the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
todo student. After the student types 10 answers, your program should calculate the percentage that are
todo correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
todo then reset the program so another student can try it. If the percentage is 75% or higher, display
todo "Congratulations, you are ready to go to the next level!", then reset the program so another
todo student can try it.*/
import java.security.SecureRandom;
import java.util.Scanner;

public class CIA637 {
   SecureRandom rand = new SecureRandom();
   int question = rand.nextInt(1,9);

}
