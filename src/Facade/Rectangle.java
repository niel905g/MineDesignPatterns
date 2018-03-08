package Facade;

/**
 * @author Niels on 08-03-2018.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
