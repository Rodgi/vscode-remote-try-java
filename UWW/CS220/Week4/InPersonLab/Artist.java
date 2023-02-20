package Week4.InPersonLab;

public class Artist {
    // TODO: Declare private fields - artistName, birthYear, deathYear
    String artistName;
    int birthYear;
    int deathYear;

    // TODO: Define default constructor
    public Artist() {
        artistName = "unknown";
        birthYear = -1;
        deathYear = -1;
    }

    // TODO: Define second constructor to initialize
    // private fields (artistName, birthYear, deathYear)
    public Artist(String artistName, int birthYear, int deathYear) {
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
    public String getName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    // TODO: Define printInfo() method
    public void printInfo() {
        
        if(birthYear != -1 && deathYear != -1){
            System.out.printf("Artist: %s (%d to %d)", artistName, birthYear, deathYear);
        }
        else if(birthYear != -1){
            System.out.printf("Artist: %s (%d to present)", artistName, birthYear);
        }
        else{
            System.out.printf("Artist: %s (unknown)", artistName);
        }
        
    }

}