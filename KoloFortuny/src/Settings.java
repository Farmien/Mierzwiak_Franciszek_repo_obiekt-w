public class Settings {
    private int numberOfPlayers, numberOfRounds;

    public Settings(int numberOfPlayers, int numberOfRounds) {
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRounds = numberOfRounds;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}
