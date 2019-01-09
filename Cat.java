package object_oriented_programming;

/**
 * Базовый класс, который определяет базовое поведение всех котиков.
 */
public adstract class Cat {

    PurrBehavior purrBehavior;
    MeowBehavior meowBehavior;
    JumpBehavior jumpBehavior;
    /**
     * Данный метод, для каждого конкретного котика, должен быть свой.
     */
    public abstract void display();

    public void performPurr() {
        purrBehavior.purr();
    }

    public void performMeow() {
        meowBehavior.meow();
    }

    public void performJump() {
        jumpBehavior.jump();
    }
    
    public void setPurrBehavior(PurrBehavior behavior){
        purrBehavior=behavior;
    }
    
    public void setMeowBehavior(MeowBehavior behavior){
        meowBehavior=behavior;
    }
    
    public void setJumpBehavior(JumpBehavior behavior){
        jumpBehavior=behavior;
    }
} 
