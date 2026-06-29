import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of each subject out of 100 : \n");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int subject4 = sc.nextInt();
        int subject5 = sc.nextInt();
        int sum = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total Marks = " + sum);
        int average = sum / 5;
        System.out.println("Average Percentage = " + average + "%");
        if (average >= 90) {
            System.out.println("Grade: A+");
        }
        else if (average >= 80) {
            System.out.println("Grade: A");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
        }
        else if (average >= 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
        sc.close();

    }
}
