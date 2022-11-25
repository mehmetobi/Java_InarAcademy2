package Chapters.Chapter12.Checkpoints_12;

import java.io.IOException;

public class RepeatedException {
    public static void main(String[] args) {

        method1();
    }

    public static void method1() {
        try {
            method2();
            System.out.println("try-method1-after-call");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());
        }
        System.out.println("try-method1-after-catch");

    }

    public static void method2() {
        try {
            int x = 1/0;
            method3();
            System.out.println("try-method2-after-call");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("A: " + ex.getMessage() + "\n");
            System.out.println("B" + ex.toString() + "\n");
            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
        System.out.println("try-method2-after-catch");

    }

    public static void method4() throws Exception{
        throw new Exception("asdasd");
    }

    public static void method3() {

        System.out.println("after method4 call");
    }


}
