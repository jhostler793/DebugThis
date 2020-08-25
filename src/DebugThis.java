import java.util.Scanner;

public class DebugThis {

    public static void main(String[] args){
       Scanner input=new Scanner(System.in);

       int testScore;
       testScore = 65;
        char grade;
        grade = 'A';

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        }else if (testScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

    }
}
