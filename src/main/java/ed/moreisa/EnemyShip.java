package ed.moreisa;

public class EnemyShip extends SpaceShip implements Explodable {

    private int size;

    public EnemyShip(int x, int y, int size) {
        super(x, y);
        this.size = size;
    }
    
    @Override
    public void shoot(){
        System.out.println("EnemyShip: shoot the gun...");
    }

    @Override
    public void explode() {
        System.out.println("EnemyShip: explode...");
    }
    
    
}
