public class Movie extends Video{
    private boolean onTheatres;
    private int awards;

    public Movie(double lengthMinutes, boolean onTheatres, int awards) {
        setLengthMinutes(lengthMinutes);
        setOnTheatres(onTheatres);
        setAwards(awards);
    }

    public double getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(double lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public boolean getIsOnTheatres() {
        return onTheatres;
    }

    public void setOnTheatres(boolean onTheatres) {
        this.onTheatres = onTheatres;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    @Override
    void play() {
        this.isPlayed = true;
    }

    @Override
    void stop() {
        this.isPlayed = false;
    }
}
