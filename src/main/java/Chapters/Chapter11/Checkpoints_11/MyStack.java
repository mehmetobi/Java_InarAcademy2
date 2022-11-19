package Chapters.Chapter11.Checkpoints_11;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> list;

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Integer peek() {
        return list.get(list.size() - 1);
    }

    public Integer pop() {
        Integer sayi = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return sayi;
    }

    public void push(Integer sayi) {
        list.add(sayi);
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack();

    }
}
