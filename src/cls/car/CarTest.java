package cls.car;

public class CarTest {
    public static void main(String[] args) {
        // car1 : Sedan 인스턴스 생성
        // Truck1 : Truck 인스턴스 생성
        Sedan car1 = new Sedan(4);

        Poter truck1 = new Poter();

        CarLoader loader = new CarLoader();
        loader.load(car1);
        loader.load(truck1);

    }
}
