import java.util.*;
public class Dice {
    private int noofdices;
    Dice(int noofdices){
        this.noofdices=noofdices;
    }
    public int getNofDices(){
        return noofdices;
    }
    int roll(){
        return ((int) (Math.random()*(6*noofdices - 1*noofdices))) + 1;
    }
}