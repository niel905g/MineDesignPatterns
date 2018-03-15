package Factory;

/**
 * @author Niels on 13-03-2018.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}