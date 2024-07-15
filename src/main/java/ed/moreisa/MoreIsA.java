package ed.moreisa;

public class MoreIsA {

    public static void main(String[] args) {
      HeroShip heroShip = new HeroShip(22, 100, 50);
      
//       HeroShip heroShip = new HeroShip(22, 100, 50);
//       EnemyShip enemyShip = new EnemyShip(50, 120, 2);
       
//       System.out.println(heroShip);
//       System.out.println(enemyShip);
       
//       heroShip.explode();

//       GameObject heroShip = new HeroShip(22, 100, 50); // error - static - compiler

// polymorhism...
//       SpaceShip heroShip = new HeroShip(22, 100, 50); // error - static - compiler
//       SpaceShip enemyShip = new EnemyShip(50, 120, 2);
//
//       heroShip.shoot();
//       enemyShip.shoot();
//       
//       heroShip.rotate(90);
//       enemyShip.rotate(180);
//       
//       heroShip.explode();
//       enemyShip.explode();
//       
       
       // error - cannot instantiate an abstract class
//       SpaceShip ship = new SpaceShip(45, 67); 

// polymorhism - usage
       SpaceShip ship = new HeroShip(45, 67, 100); 
       System.out.println(ship);
       ship.shoot();
       ship.rotate(180);
       
       ship = new EnemyShip(100, 200, 2);
       System.out.println(ship);
       ship.shoot();
       ship.rotate(180);
       
       
      ship.explode();
      
      ship.increaseSpeed(50);
      ship.spaceJump(20, 20);

    }
}
