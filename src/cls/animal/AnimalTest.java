package cls.animal;

public abstract class AnimalTest {
    public static void main(String[] args) {
//        Animal ani = new Animal();
//        System.out.println( ani );
//        ani.crying();

        Pig Pig = new Pig();
        System.out.println( Pig );  // animal 클래스에 toString 호출
        Pig.crying();

        Dog dog = new Dog();
        System.out.println( dog );
        dog.crying();

        // 챔피언
        // 케이틀린, 가렌
    }
}
