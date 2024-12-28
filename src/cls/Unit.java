package cls;

import javax.lang.model.element.Name;

public class Unit {
    public static void main(String[] args) {

    }

    private int hp;
    private int power;
    private String name;

    public Unit(){
        hp = 0;
        power = 0;
        name = "";
    }

    public Unit(int h, int p, String n) {
        // this : 객체 자기 자신을 가리키는 참조 변수
        this.hp = hp;
        this.power = power;
        this.name = name;
        System.out.printf("%s : hp:%d, power%d\n", this.name, this.hp, this.power);
    }
    // method, member function
    public void move(int x, int y) {
        System.out.printf("(%d, %d) 위치로 이동합니다.\n", x, y);
    }
    // 메소드의 정의 방법
    // 접근제한자 반환형 메소드이름(메게변수들...)
    public int getHp(){
        return hp;
    }
    public int getpower(){
        return power;
    }
    public String getname(){
        return name;
    }

    public void setHp(int hp){
        if ( hp < 0 )
            return; // 메소드 강제 종료
        this.hp = hp;
    }
    public void setPower(int power){
        if ( power < 0 )
            return;
        this.power = power;
    }

    public void setname(String name){
        if ( !name.isEmpty() ){ // name 문자열이 빈문자열이 아니면...
        // if ( name.length() > 0 ){   // String.length(): 문자열의 길이를 반환하는 메소드
            // 이름의 길이가 0보다 크면 이름값을 설정함
            this.name = name;
        }
    }

    public void attack(Unit target){
        target.hp -= this.power;
    }

}
/*
* BankAccount : 클래스 이름
* accountNumber : 문자열, 접근 금지
* balance : 정수, 접근 금지
*
* 생성자 : 매개변수로 accountNumber만 입력받고,balance는 무조건 0으로 설정함
*
* 메소드(기능)
* deposit : 매개변수로 입금액(정수)를 주면 balance를 매개변수 값 만큼 증가 시킴
* 반환값 없음
*
* withdraw(출금) : 매개변수로 출금액(정수)를 주면 balance를 매개변수 값만큼 감소 시킴
* 반환값 없음
*
* print : 매개변수 없고 반환값 없는 츌력 기능
*  출력 형식)
* 현재 잔액은 xxx원 입니다.
*  */