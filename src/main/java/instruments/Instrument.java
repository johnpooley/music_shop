package instruments;

public abstract class Instrument {
    protected int wholesale;
    protected double retail;
    protected int age;
    protected String colour;

    public Instrument(int age, int wholesale, String colour){
        this.wholesale=wholesale;
        this.retail= this.wholesale*2.5;
        this.age=age;
        this.colour=colour;
    }


    //    getters
    public double getRetail() { return retail; }
    public int getWholesale() { return wholesale; }
    public int getAge() { return age; }
    public String getColour() { return colour; }

    //    setters
    public void setWholesale(int wholesale) { this.wholesale = wholesale; }
    public void setAge(int age) { this.age = age; }
    public void setColour(String colour) { this.colour = colour; }
}
