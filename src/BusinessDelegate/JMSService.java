package BusinessDelegate;

/**
 * @author Niels on 09-03-2018.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}