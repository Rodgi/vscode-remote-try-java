package Week4.InPersonLab;

public class Artwork {
    /*
     * Define the Artwork class (in file Artwork.java) with constructors to
     * initialize an artwork's information, get methods, and a printInfo() method.
     * The default constructor should initialize the title to "unknown", the year
     * created to -1. printInfo() displays an artist's information by calling the
     * printInfo() method in Artist.java, followed by the artwork's title and the
     * year created. Declare a private field of type Artist in the Artwork class.
     */

    // TODO: Declare private fields - title, yearCreated
    String title;
    int yearCreated;
    // TODO: Declare private field artist of type Artist
    Artist artist;
    // TODO: Define default constructor
    public Artwork() {
        title = "unknown";
        yearCreated = -1;
    }
    // TODO: Define get methods: getTitle(), getYearCreated()
    public String getTitle() {
        return title;
    }
    public int getYearCreated() {
        return yearCreated;
    }
    // TODO: Define second constructor to initialize
    // private fields (title, yearCreated, artist)
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }
    // TODO: Define printInfo() method
    public void printInfo(){
        artist.printInfo();
        System.out.printf(" %s (%d)", title, yearCreated);
    }
    // Call the printInfo() method in Artist.java to print an artist's information
}
