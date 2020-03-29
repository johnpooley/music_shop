package instruments;

import Interfaces.IPlay;

public class Flute extends Instrument implements IPlay {

    public Flute(int age, int wholesale, String colour){
       super(age, wholesale, colour);
    }

    public String playSound() {
        return "parp flarp!";
    }
}
