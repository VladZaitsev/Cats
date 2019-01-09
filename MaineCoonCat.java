package object_oriented_programming;

/**
 * Порода больших кошек.
 * Умеет: мурлыкать (purr), мяукать (meow) и прыгать Высоко (jump)
 * Имплементация метода display - своя.
 */
public class MaineCoonCat extends Cat {

    public MaineCoonCat(){
            purrBehavior = new GeneralPurrBehavior();
            jumpBehavior = new HighJumpBehavior();
            meowBehavior = new GeneralMeowBehavior();
    }
    
    @Override
    public void display() {
        //display implementation

        System.out.println("Maine coon cat is displayed, it is very big");
    }
}
