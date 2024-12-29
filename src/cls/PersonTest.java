package cls;

public class PersonTest {
    public static void main(String[] args) {
        Person lee = new Person("tom", 175.8F, 30);
        Person james = new Person("John", 185.2F, 20);
        Person tom = new Person("Jane", 168.0F, 25);

        // Jane의 나이를 28세로 바꾸기
        tom.setAge(28);
        tom.introduce();

        // Student 클래스를 이용하여 객체 생성
        Student s1 = new Student("Brad", 185.3F, 18);

        // s1의 학교를 "수원 초등학교"로 설정
        // s1의 학년을 2학년으로 설정

        // 학교이름이 주어지는 생성자를 이용하여 s2 객체 생성
        Student s2 = new Student("Mason", 183.9F, 16, "화홍");
        s2.setGrade(3);
        s1.setSchool("수원초등학교");
        s1.setGrade(2);

        s1.introduce();
        s2.introduce();




    }
}
