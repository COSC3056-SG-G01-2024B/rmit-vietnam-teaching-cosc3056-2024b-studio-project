package app;

public class YearRange {
    private int startYear, endYear, range;

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getRange() {
        return range;
    }

    public YearRange(int startYear, int endYear, int range) {
        this.startYear = startYear;
        this.endYear = endYear;
        this.range = range;
    }
    
}
