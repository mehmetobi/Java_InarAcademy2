package Chapters.Chapter11.Exercises11.Exercises11_Soru02;

public class Person {
    private String name;
    private String adress;
    private String phoneNumber;
    private String e_mail;
    public Person() {
        this(null, null, null, null);
    }

    public Person (String name, String adress, String phoneNumber, String e_mail) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.e_mail = e_mail;

    }

    public String getName () {
        return this.name ;
    }
    public String getAdress() {
        return this.adress;
    }
    public String getPhoneNumber (){
        return this.phoneNumber;
    }
    public String getE_mail(){
        return this.e_mail;
    }
    public void setName (){
        this.name = name ;
    }
    public void setAdress(){
        this.adress = adress;
    }
    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
    public void setE_mail(){
        this.e_mail = e_mail;
    }
    @Override
    public String toString(){
        return " Name: " + this.name +
                "\nAdress: " + this.adress +
                "\nPhone Number: " + this.phoneNumber +
                "\nEmail: " + this.e_mail ;

    }
}
