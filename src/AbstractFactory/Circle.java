package AbstractFactory;

/**
 * @author Niels on 15-03-2018.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
