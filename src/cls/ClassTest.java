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

        // Unit class test
        Unit u1 = new Unit(100, 10, "Tom");
        Unit u2 = new Unit(150, 15, "john");
        Unit u3 = new Unit();
        Unit u4 = new Unit(100, 10, "Tom");
        Unit u1_1 = u1;



        u3.setHp(200);
        u3.setPower(20);
        u3.setname("James");


        // int u1_hp = u1.getHp();
        // int u2_hp = u2.getHp();
        System.out.printf("u1의 HP는 %d입니다.\n", u1.getHp());
        System.out.printf("u2의 HP는 %d입니다.\n", u2.getHp());
        System.out.printf("u3의 HP는 %d입니다.\n", u3.getHp());

        // int u1_power = u1.getpower();
        // int u2_power = u2.getpower();
        System.out.printf("u1의 power는 %d입니다.\n", u1.getpower());
        System.out.printf("u2의 power는 %d입니다.\n", u2.getpower());
        System.out.printf("u3의 power는 %d입니다.\n", u3.getpower());

        // String u1_name = u1.getname();
        // String u2_name = u2.getname();
        System.out.printf("u1의 name는 %d입니다.\n", u1.getname());
        System.out.printf("u2의 name는 %d입니다.\n", u2.getname());
        System.out.printf("u3의 name는 %d입니다.\n", u3.getname());

        // 대리자를 이용하여 기능을 호출한다.
        u1_1.setname("Java");
        System.out.printf("u1의 name는 %d입니다.\n", u1.getname());

        //
        u1.attack(u2);
        System.out.printf("u2의 HP는 %d입니다.\n", u2.getHp());

        /*
        *  클래스 이름 : Unit
        *  HP : int
        *  power : int
        *
        *  move : 반환값은 없음, 매개변수 (x, y) : int, 외부에서 호출가능
        *  X, Y 위치로 이동합니다, "출력"
        * */


    }
}
