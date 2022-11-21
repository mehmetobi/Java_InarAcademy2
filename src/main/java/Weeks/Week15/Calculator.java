package Weeks.Week15;

public class Calculator {


    public Number add(Number ob1, Number ob2){

        int temp = ob1.value + ob2.value;

        Number sumObj = new Number(temp);

        return sumObj;
    }
}
