/**
 * Class for handling a Hockey game.
 * @author aezouhri
 */
public class Hockey extends Sports {

    /**
     * Constructor for the Hockey class.
     * @param home_team Home team object.
     * @param away_team Away team object.
     */
    public Hockey(Team home_team, Team away_team) {
        super(home_team, away_team, 1, 3, "Regulation");
        this.setAway_team(away_team);
        this.setHome_team(home_team);

        ScoreTab[] scores = new ScoreTab[2];

        scores[0] = new ScoreTab(home_team.getTeam_name() + " points :", 1);

        scores[1] = new ScoreTab(away_team.getTeam_name() + " points :", 1);

        //initializing the Sport's scoring array to the game played scoring array
        super.setArray_of_scores(scores);


    }
}

