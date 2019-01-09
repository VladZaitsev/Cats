package object_oriented_programming;

/**
 * Игрушечный пушистый котик
 * Умеет: отображаться (display) и мяукать (meow).
 * Имплементация метода display - своя.
 */
public class ToyCat extends Cat {

    public ToyCat(){
        purrBehavior = new NoPurrBehavior();
        jumpBehavior = new NoJumpBehavior();
        meowBehavior = new GeneralMeowBehavior();
    }
    
    public void display() {
        //display implementation

        System.out.println("Toy cat is displayed, it is soft");
    }
}
