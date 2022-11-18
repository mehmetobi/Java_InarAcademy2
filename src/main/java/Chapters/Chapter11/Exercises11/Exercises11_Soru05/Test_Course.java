package Chapters.Chapter11.Exercises11.Exercises11_Soru05;

public class Test_Course {
    public static void main(String[] args) {


        Course course1 = new Course("Java ");
        Course course2 = new Course("Tester");

        course1.addStudent("Mehmet Obi");
        course1.addStudent("Erdem");
        course1.addStudent("Emre");

        course2.addStudent("Nurullah");
        course2.addStudent("Samet");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
    }
}
