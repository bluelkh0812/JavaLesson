package cls.unittest;

public class Tank extends Unit {

    public boolean seize;

    public Tank(String name) {
        setname(name);
        setHp(500);
        setPower(50);
        seize = false;
    }

    public void setSeize(boolean setseize) {
        this.seize = setseize;
    }

    public void attack(Unit target) {
        if (seize)
            setPower(getpower() * 3);
        else setPower(50);
    }

}
