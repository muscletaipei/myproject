package tw.dworker.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("joe", 60, 99);
        stu.print();

        System.out.println("The highest score is :" + stu.highest());

    }

    //option + command + M 直接把一包的程式集中 userInput的方法
    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the name:"+"\n");
        String name = scanner.next();
        System.out.println("Please insert the English score:"+"\n");
        int english = scanner.nextInt();
        System.out.println("Please insert the Math score::"+"\n");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();

        System.out.println("The highest score is :" + stu.highest());
    }
}
