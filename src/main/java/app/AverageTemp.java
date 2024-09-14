package app;

public class AverageTemp {
    private int startYear, endYear;
    private float averageTemp, averagePop;
    private Region region;

    public float getAveragePop() {
        return averagePop;
    }
    
    public int getStartYear() {
        return startYear;
    }
    public int getEndYear() {
        return endYear;
    }
    public float getAverageTemp() {
        return averageTemp;
    }

    public Region getRegion() {
        return region;
    }

    
    //World
    public AverageTemp(int startYear, int endYear, float averageTemp) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.averageTemp = averageTemp;
    }
    
    // Country
        public AverageTemp(int startYear, int endYear, float averageTemp, String name) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.averageTemp = averageTemp;
        this.region = new Region(name, "Country");
    }

    // country with population
        public AverageTemp(int startYear, int endYear, float averageTemp, float averagePop, String name) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.averageTemp = averageTemp;
        this.region = new Region(name, "Country");
        this.averagePop = averagePop;
    }
        

    //City/State
    public AverageTemp(int startYear, int endYear, float averageTemp, String country, String cityOrState, String name) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.averageTemp = averageTemp;
        this.region = new Region(name, cityOrState, country);
    }
    
    
    

}
