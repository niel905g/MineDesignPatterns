package Memento;

/**
 * @author Niels on 14-03-2018.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}