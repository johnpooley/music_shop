package OtherSaleItems;

import Interfaces.ISell;
import instruments.Instrument;

public class SheetMusic implements ISell {

    private String title;
    private int year;
    private Instrument instrument;
    private int wholesale;
    private double retail;

    public SheetMusic(String title, int year, Instrument instrument, int wholesale, double retail){
        this.title=title;
        this.year=year;
        this.instrument=instrument;
        this.wholesale=wholesale;
        this.retail=retail;
    }


//    getters
    public int getWholesale() { return wholesale; }
    public double getRetail() { return retail; }
    public int getYear() { return year; }
    public Instrument getInstrument() { return instrument; }
    public String getTitle() { return title; }


//    setters

    public void setRetail(double retail) { this.retail = retail; }
    public void setInstrument(Instrument instrument) { this.instrument = instrument; }
    public void setTitle(String title) { this.title = title; }
    public void setWholesale(int wholesale) { this.wholesale = wholesale; }
    public void setYear(int year) { this.year = year; }

    public double calculateMarkup() {
        return this.retail-this.wholesale;
    }
}
