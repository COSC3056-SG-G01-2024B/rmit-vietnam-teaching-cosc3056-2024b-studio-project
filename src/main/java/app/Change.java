package app;

public class Change {
    private int startYear, endYear;
    private float tempChange, popChange;
    private Region region;
    
    public int getStartYear() {
        return startYear;
    }
    public int getEndYear() {
        return endYear;
    }
    public float getTempChange() {
        return tempChange;
    }
    public float getPopChange() {
        return popChange;
    }
    public Region getRegion() {
        return region;
    }
    
    // Country
    public Change(int startYear, int endYear, float tempChange, float popChange, String name) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.tempChange = tempChange;
        this.popChange = popChange;
        this.region = new Region(name, "Country");
    }

    // City/State

    public Change(int startYear, int endYear, float tempChange, String country, String cityOrState, String name) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.tempChange = tempChange;
        this.region = new Region(name, cityOrState, country);
    }

    
    
    


}
