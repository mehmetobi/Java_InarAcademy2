package Chapters.Chapter11.Exercises11.Exercises11_Soru02;

public class Exercises11_Soru02 {
    public static void main(String[] args) {
        Person person = new Person("Emre" , "Sinop" , "41212", "emre@ozgun");
        Student student = new Student("Erdem", "Ordu", "21324","erdem@ergun", Student.FRESHMAN);
        Employee employee = new Employee("Nuri" , "Adana", "402334", "Nuri@gundugdu", "Sanayi mahallesi", 5000);
        Faculty faculty = new Faculty("Samet", "Umraniye" , "535353", "samet@gulmez","Slimstock", 15000, 5, 2);
        Staff staff = new Staff("Gunay", "Azerbaycan", "34535", "gunay@guliyeva", "Hocapasa", 5500, "rezervation operator");

        display(person);
        display(student);
        display(employee);
        display(faculty);
        display(staff);
    }

    public static void display(Person object) {
        System.out.println(object.toString() + "\n----------------------");

    }
}
