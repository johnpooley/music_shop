package instruments;

import Interfaces.IPlugIn;

public class ElectricGuitar extends Guitar implements IPlugIn {

    public ElectricGuitar(int age, int wholesale, int strings, String colour){
        super(age, wholesale, strings, colour );
    }

    public String plugIntoSpeaker() {
        return "twang!";
    }

    public String playSound(){
        return "silence because it's not plugged in";
    }
}
