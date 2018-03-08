package Facade;

/**
 * @author Niels on 08-03-2018.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}