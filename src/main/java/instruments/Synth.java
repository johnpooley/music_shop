package instruments;

import Interfaces.IPlugIn;
import Interfaces.ISell;


public class Synth extends Instrument implements IPlugIn, ISell {

    private double retail;


    public Synth(int age, int wholesale, double retail, String colour) {
        super(age, wholesale, colour);
        this.retail=retail;
    }

    public String plugIntoSpeaker() {
        return "beep boop!";
    }

    @Override
    public double getRetail() { return retail; }

    public double calculateMarkup() {
        return this.retail-this.wholesale;
    }
}
