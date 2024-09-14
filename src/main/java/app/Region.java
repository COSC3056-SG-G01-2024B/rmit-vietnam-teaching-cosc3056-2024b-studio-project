package app;

public class Region {
    private String name;
    private String type;
    private String country;
    
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getCountry() {
        return country;
    }

    //for Country 
    public Region(String name, String type) {
        this.name = name;
        this.type = type;
        this.country = "";
    }

    // for City/State
    public Region(String name, String type, String country) {
        this.name = name;
        this.type = type;
        this.country = country;
    } 

    
}
