public class BadGuy extends GameEntity {
    private int closeUpDamage;
    private int distanceDamage;


    public void BadGuy(){
        int closeUpDamage = 100;
        int distanceDamage = 200;
    }


    public int attackClose(GameEntity victim){
        takeDamage(closeUpDamage);
        return closeUpDamage;
    }
    public int attackFromFar(GameEntity victim){
        takeDamage(distanceDamage);
        return distanceDamage;
    }
}
