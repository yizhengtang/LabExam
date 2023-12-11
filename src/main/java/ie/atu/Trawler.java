package ie.atu;

public class Trawler extends Ship{
    private int Cap;

    public Trawler(){
        Cap = 0;
    }

    public void setCap(int Cap){
        this.Cap = Cap;
    }

    public int getCap(){
        return Cap;
    }

    public void vesselDetails(){
        System.out.println("The name of the Trawler: " + getName());
        System.out.println("The cargo capacity in tonnage: " + getCap());
    }
}
