package Facade;

/**
 * @author Niels on 08-03-2018.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}