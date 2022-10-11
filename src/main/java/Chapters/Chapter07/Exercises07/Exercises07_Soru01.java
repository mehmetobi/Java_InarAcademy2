package Chapters.Chapter07.Exercises07;

import java.util.Scanner;

public class Exercises07_Soru01 {

    public static void main(String[] args) {
        test_the_array_max();

        int student_count;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        student_count = input.nextInt();

        // System.out.println("Student count : " + student_count);

        int [] student_grades = new int[student_count];

        System.out.println("Enter " + student_count + " scores:");

        for(int i = 0; i < student_count; i++) {
            student_grades[i] = input.nextInt();
        }

        int max_grade = theArrayMax(student_grades);

        printAllGrades(student_grades, max_grade);

    }

    public static void test_the_array_max() {

        int[] testArray = {10, 20, 30, 40, 50};
        assert (theArrayMax(testArray) == 50): theArrayMax(testArray);

        int[] testArray2 = {-10, -20, -30, -40, -50};
        assert (theArrayMax(testArray2) == -10);

        int[] testArray3 = {0, 0, 0, 0, 0};
        assert (theArrayMax(testArray3) == 0);

        int[] testArray4 = {10, 20, 0, -40, -50};
        assert (theArrayMax(testArray4) == 20);

    }


    public static int theArrayMax(int [] grades) {

        int max_grades = grades[0];

        for (int i = 0; i < grades.length; i++){
                if(grades[i] > max_grades) {
                    max_grades = grades[i];
                }
        }

        return max_grades;
    }

    public static void printAllGrades(int [] grades, int max_grade) {

        char grade_letter;
        System.out.println(max_grade);
        for (int i = 0; i < grades.length; i++) {
            //System.out.println((max_grade - 10) + " " + grades[i]);
            if (max_grade  <= grades[i] + 10)
                grade_letter = 'A';
            else if(max_grade  <= grades[i] + 20)
                grade_letter = 'B';
            else if(max_grade  <= grades[i] + 30)
                grade_letter = 'C';
            else if(max_grade  <= grades[i] + 40)
                grade_letter = 'D';
            else
                grade_letter = 'F';
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + grade_letter );
        }

    }


}
