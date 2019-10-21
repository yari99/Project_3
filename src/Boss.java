public class Boss extends BadGuy{
    private int specialDamage1;
    private int specialDamage2;
    private int specialDamage3;

    public void Boss() {
        specialDamage1 = 150;
        specialDamage2 = 300;
        specialDamage3 = 400;

    }

    @Override
    public int attackClose(GameEntity victim) {
        return super.attackClose(victim);

    }
}
