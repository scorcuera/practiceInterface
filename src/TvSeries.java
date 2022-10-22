public class TvSeries extends Video{

    private int seasons;
    private int episodes;

    public TvSeries(double lengthMinutes, int seasons, int episodes) {
        setLengthMinutes(lengthMinutes);
        setSeasons(seasons);
        setEpisodes(episodes);
    }

    public double getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(double lengthMinutes) {
        this.lengthMinutes = lengthMinutes/60;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
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
