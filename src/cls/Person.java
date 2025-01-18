package cls;

public class Person {
    // 접근 제한자 : privater, protected, public
    // private : 외부에서 일체 접근 금지, 상속안됨, 클래스 내부에서만 접근 가능
    // protected : 같은 패키지의 객체들에서 접근 가능, 상속도 가능, 다른 패키지의 객체들에서 접근 불가
    // public : 제한없음, 완전공개


    // 데이터
    private int age;        // 나이, 데이터(속성, Attribute, Property, Member Variable)
    private String name;    // 이름 데이터
    private float height;

    // 생성자 : 클래스명과 같음, 객체가 생성될때 한번 호출됨
    public Person(String n, float h, int a) {
        age = a;
        name = n;
        height = h;
      //  System.out.println("Person 클래스로부터 객체가 생성됨");
    }

    // 행위(Method, Member function)
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "이고,");
        System.out.println("나이는 " + age + "살 입니다");
    }

    // getAge : 나이를 반환하는 메소드
    // setAge : 나이를 설정(저장)하는 메소드, 음수는 설정할 수 없도록 제한.
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if ( a < 0)
            return;
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        if (!name.isEmpty()){
           name = n;
        }
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float h){
        if (h < 0)
            return;
        height = h;
    }

    @Override
    public String toString() {
        return getName();
    }

    // static 내부클래스 Builder 정의
    public static class Builder {
        // 데이터
        private int a;        // 나이, 데이터(속성, Attribute, Property, Member Variable)
        private String n;    // 이름 데이터
        private float h;

        public Builder name(String n) {
            this.n = n;
            return this;
        }

        public Builder age(int a) {
            this.a = a;
            return this;
        }

        public Builder height(float h) {
            this.h = h;
            return this;
        }

        public Person build() {
            return new Person(n, h, a);
        }
    }
}
