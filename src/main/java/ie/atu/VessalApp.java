package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VessalApp {
    public static void main(String[] args) {
        Ship ship = new Ship();
        Ferry ferry = new Ferry();
        Trawler trawler = new Trawler();

        ship.setName("A");
        ship.setYear("2003");
        ship.setMinCrew(1000);

        ferry.setName("B");
        ferry.setMaxPassenger(2000);

        trawler.setName("C");
        trawler.setCap(200);

        ship.vesselDetails();
        ferry.vesselDetails();
        trawler.vesselDetails();
    }
}