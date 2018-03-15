package AbstractFactory;

/**
 * @author Niels on 15-03-2018.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}