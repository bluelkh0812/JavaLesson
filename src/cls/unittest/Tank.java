package cls.unittest;

public class Tank extends Unit {

    public boolean seize;

    public Tank(String name) {
        setName(name);
        setHp(500);
        setPower(50);
        seize = false;
    }

    public void setSeize(boolean setseize) {
        this.seize = setseize;
    }

    @Override
    public void damage(int power) {

    }

    public void attack(Unit target) {
        if (seize)
            setPower(getPower() * 3);
        else setPower(50);
    }

}
