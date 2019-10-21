import java.awt.*;

public class GameEntity {
    private java.awt.Rectangle rect;
    private int health;



    public GameEntity() {
        GameEntity = rect;
        health = 500;

    }
        public class Rectangle {
             private Point bottomLeft;
             private Point topRight;
        }
        public class Point {
            private int rect1;
            private int rect2;
        }


        public boolean doesCollide (​GameEntity other){
            if (this.rect.getY() < other.rect.getY() || this.rect.getY() > other.rect.getY())
                return false;
            if (this.rect.getX() < other.rect.getX()||
                    this.rect.getX() > other.rect.getX()) {
                return false;
            }
            return true;
        }
    public void takeDamage (int amount){
        health  =- amount;
    }
    public String toString() {
        return  GameEntity + health;
        System.out.println(GameEntity + health);

        ;


    }
}

