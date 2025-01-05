package cls.phone;

// 추상 클래스
public abstract class GalaxyPhone implements Phone {
    private boolean on;

    public GalaxyPhone() {
        on = false;
    }

    @Override
    public boolean powerOn() {
        System.out.println("파워온");
        on = true;
        return on;
    }

    @Override
    public void powerOff() {
        on = false;
    }

    @Override
    public int charge() {
        return 0;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void playvideo() {
    }

    // 추상 메소드
    // 반환값 정수, pay, 매개변수 정수 amount
    // 메소드 이름 : pay
    // 매개변수 : 정수(int) amount
    public abstract int pay(int amount);
}
