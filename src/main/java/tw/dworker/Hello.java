package tw.dworker;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
//        person.hello();
        Person person = new Person("muscle",66.5f,1.7f);

        System.out.println();
        System.out.println(person.name+"的\n"+"BMI為"+person.bmi());

        int score = 88;
        System.out.println(score > 60 && score < 90);
        System.out.println(score < 60 || score > 90);

        char c = 'A';
        System.out.println(c < 'a');


       /* int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "muscle";*/


    }
}
