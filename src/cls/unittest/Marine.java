package cls.unittest;

public class Marine extends Unit {
    // steampack : 논리형(boolean), 접근금지
    private boolean Steampack;

    public Marine(String name){
        setname(name);
        setHp(200);
        setPower(10);
        Steampack = false;
    }

    private void setname(String name) {
    }

    public void setSteampack(boolean steampack){
        this.Steampack = steampack;
    }

    public void attack(Unit target){
        if ( Steampack )
            setPower( getpower()*2);
        // steampack이 false이면 원래 power로 설정하기
        else
            setPower( 10 );

    }
    public void damage(int power){

    }

}
// 클래스이름 : Tank from Unit
// 생성자 : 이름만 받아서 생성함, HP : 500, Power : 50
// seize : boolean형 필드(멤버 변수) 선언하기
// setseize : seize 변수를 생성하는 setter 메소드
// attack 메소드 재정의 seize가 참이면 공격력 3배 아니면 원래대로 50