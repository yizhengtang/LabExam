package ie.atu;

public class Ship {
    private String Name;
    private String Year;
    private int minCrew;

    public Ship(){
        Name = "";
        Year = "";
        minCrew = 0;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setYear(String Year){
        this.Year = Year;
    }

    public String getYear(){
        return Year;
    }

    public void setMinCrew(int minCrew){
        this.minCrew = minCrew;
    }

    public int getMinCrew(){
        return minCrew;
    }

    public void vesselDetails(){
        System.out.println("The name of the ship: " + getName());
        System.out.println("The year that the ship is made: " + getYear());
        System.out.println("The minimum number of crew: " + getMinCrew());
    }
}
