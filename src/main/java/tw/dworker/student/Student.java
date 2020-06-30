package tw.dworker.student;

public class Student {
    String name;
    String id;
    int english;
    int math;

    //command + N 快速建構子
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2);
    }
}
