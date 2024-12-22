package cls;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        // Primitive Data Type
        // byte, char, shot, int, long, float, double, boolean
        int number1 = 10;
        int number2 = 30;
        int number3 = 20;

        //Referenced Data Type
        String str1 = "Hello Java"; // 문자열 변수
        System.out.println(str1);

        String str2 = new String("헬로우 자바");
        System.out.println(str2);

        String str3 = new String("헬로우 자바");
        str3 = "이것은 자바 문자열입니다";


        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();
        Person lee = new Person("구라", 178.0F, 20);  // 객체가 생성되는 시점
        Person james = new Person("Dean", 180.1F, 30);
        Person tom = new Person("Cruz", 177.3F, 40);

        lee.introduce();      // 메소드에 접근
        james.introduce();
        tom.introduce();


    }
}
