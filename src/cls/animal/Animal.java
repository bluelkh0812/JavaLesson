package cls.animal;

public abstract class Animal {
    // 접근제한자 : private, protected, public
    // private : 상속안됨, 외부클래스에서 접근 금지, 내부에서만 사용 가능
    // protected : 상속된, 외부클래스에서 접근 금지, 같은 패키지의 외부 클래스에서는 가능
    // public : 다됨, 접근 제한 없음

    protected String name;
    protected String sound;

    // 생성자
    public Animal() {
        name = "animal";
        sound = "ㅠㅠ";
    }

    // toString 오버라이드해서 name을 반환하기
    @Override
    public String toString() {
        return name;
    }

    public void Crying() {
        System.out.printf("%s는 %s\n", name, sound );
    }

    public abstract void crying();
}