package instruments;

import Interfaces.IPlay;
import Interfaces.IPlugIn;

public class Guitar extends Instrument implements IPlay {

    private int strings;

    public Guitar(int age, int strings, int wholesale, String colour){

        super(age, wholesale, colour);

        this.strings=strings;
    }


    public int getStrings(){return this.strings;};


    public String playSound(){
        return "";
    }

}
