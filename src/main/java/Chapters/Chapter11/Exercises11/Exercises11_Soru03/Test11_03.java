package Chapters.Chapter11.Exercises11.Exercises11_Soru03;

public class Test11_03 {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(25, 25000, 100);
        SavingsAccount s = new SavingsAccount(65, 10000);

        c.withDraw(50000);
        s.withDraw(100);

        System.out.println(c.toString());
        System.out.println("------------------------");
        System.out.println(s.toString());
    }
}
