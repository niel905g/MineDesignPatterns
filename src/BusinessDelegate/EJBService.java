package BusinessDelegate;

/**
 * @author Niels on 09-03-2018.
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}