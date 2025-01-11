package cls.animal;

public class Poodle extends Dog {
    public Poodle() {
        name = "푸들";
        sound = "월월";
    }

    @Override
    public void Crying() {
        System.out.printf("%s은 % 작게 짖습니다\n", name, sound);
    }
}
