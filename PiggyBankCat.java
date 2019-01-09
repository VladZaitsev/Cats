package object_oriented_programming;

/**
 * Кот-копилка.
 * Так как это неодушевленный предмет, он умеет только отображаться (display).
 * Имплементация метода display - своя.
 */
public class PiggyBankCat extends Cat {

    public void PiggyBankCat(){
        purrBehavior = new NoPurrBehavior();
        jumpBehavior = new NoJumpBehavior();
        meowBehavior = new NoMeowBehavior();
    }
    
    @Override
    public void display() {
        //display implementation

        System.out.println("Piggy bank cat is displayed, it can keep money");
    }

}
