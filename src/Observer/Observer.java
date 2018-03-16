package Observer;

/**
 * @author Niels on 16-03-2018.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}