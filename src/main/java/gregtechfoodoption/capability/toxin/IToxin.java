package gregtechfoodoption.capability.toxin;


public interface IToxin {
    public double getToxinConcentration();

    public void setToxinConcentration(double newToxinConcentration);

    public default boolean isBodyHealthy() {
        return getToxinConcentration() <= 750D;
    }
}
