package Singleton;

/**
 * @author Niels on 08-03-2018.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        Singleton.SingleObject object = Singleton.SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}