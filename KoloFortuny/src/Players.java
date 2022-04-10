public class Players {
    private int score;
    private String playerNumber;

    public Players(String playerNumber ) {
        this.playerNumber = playerNumber;
    }

    public int getScore() {
        return score;
    }
    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
