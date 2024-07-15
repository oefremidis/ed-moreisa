package ed.moreisa;


public class HeroShip extends SpaceShip implements Explodable{
    
    private int bullets;

    public HeroShip(int x, int y, int bullets){
        super(x, y);
        this.bullets = bullets;
    }
    
    @Override
    public void shoot(){
        System.out.println("HeroShip: shoot the gun...");
        bullets--;
        bullets = bullets <= 0 ? 0 : bullets;
    }
    
        @Override
    public void explode() {
        System.out.println("HeroShip: explode...");
    }
    
}
