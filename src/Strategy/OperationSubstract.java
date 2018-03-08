package Strategy;

/**
 * @author Niels on 08-03-2018.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}