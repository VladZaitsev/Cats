ackage object_oriented_programming;

/**
 * Порода кошек, с короткими лапками.
 * Умеет: мурлыкать (purr), мяукать (meow), и прыгать Низко (jump, своя имплементация)
 * Имплементация метода display - своя.
 */
public class MunchkinCat extends Cat {

    public MunchkinCat(){
        purrBehavior = new GeneralPurrBehavior();
        jumpBehavior = new LowJumpBehavior();
        meowBehavior = new GeneralMeowBehavior();
    }
    
    
    @Override
    public void display() {
        //display implementation

        System.out.println("Munchkin cat is displayed, he has small paws");
    }
}
