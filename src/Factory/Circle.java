package Factory;

/**
 * @author Niels on 13-03-2018.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}