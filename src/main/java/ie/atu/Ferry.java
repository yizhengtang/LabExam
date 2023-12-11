package ie.atu;

public class Ferry extends Ship{
    private int MaxPassenger;

    public Ferry(){
        MaxPassenger = 0;
    }

    public void setMaxPassenger(int maxPassenger){
        this.MaxPassenger = maxPassenger;
    }
    public int getMaxPassenger(){
        return MaxPassenger;
    }

    public void vesselDetails(){
        System.out.println("The name of the ferry: " + getName());
        System.out.println("The maximum passenger: "+ getMaxPassenger() );
    }
}
