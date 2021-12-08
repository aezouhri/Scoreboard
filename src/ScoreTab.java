/**
 * Class handling the Scoreboard.
 * @author aezouhri
 */
public class ScoreTab {

    /**
     * Name of the way to score.
     */
    private String score_type;

    /**
     * Worth of each way to score.
     */
    private int scoring_way;

    /**
     * Gets the way to score.
     * @return Name of the way to score.
     */
    public String getScore_type() {
        return score_type;
    }

    /**
     * Gets how much a way of scoring is worth.
     * @return worth of the scoring way.
     */
    public int getScoring_way() {
        return scoring_way;
    }

    /**
     * Constructor for the ScoreTab class
     * @param score_type Name of the way to score.
     * @param scoring_way Worth of the scoring way.
     */
    public ScoreTab(String score_type, int scoring_way) {
        this.score_type = score_type;
        this.scoring_way = scoring_way;

    }


}
