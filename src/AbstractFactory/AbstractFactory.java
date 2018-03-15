package AbstractFactory;

/**
 * @author Niels on 15-03-2018.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
