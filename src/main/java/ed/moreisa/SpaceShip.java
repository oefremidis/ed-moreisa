package ed.moreisa;

public abstract class SpaceShip extends GameObject implements Explodable, Movable {

    public SpaceShip(int x, int y) {
        super(x, y);
    }
    
//    public void shoot(){
//        System.out.println("Spaceship: shoot the gun...");
//    }
//    
    public abstract void shoot();
    @Override
    public abstract void explode();
    
    @Override
    public void spaceJump(int x, int y){
        System.out.println("Jump");
    };
    
    @Override
    public void increaseSpeed(int speed){
        System.out.println("Increase Speed");
    };
    
    public void rotate(int degree){
        System.out.println("Change heading:" + degree + " clockwise");
    }
    
}
