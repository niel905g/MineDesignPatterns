package BusinessDelegate;

/**
 * @author Niels on 09-03-2018.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){

        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else {
            return new JMSService();
        }
    }
}