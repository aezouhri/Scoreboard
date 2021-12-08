/**
 * Class for handling a Football game.
 * @author aezouhri
 */
public class Football extends Sports {

    /**
     * Constructor for the Football class
     * @param home_team Home team object.
     * @param away_team Away team object.
     */
    public Football(Team home_team, Team away_team) {
        super(home_team, away_team, 1, 4, "Quarter");
        this.setAway_team(away_team);
        this.setHome_team(home_team);

        ScoreTab[] scores = new ScoreTab[6];

        scores[0] = new ScoreTab(home_team.getTeam_name() + " touchdown :", 7);
        scores[1] = new ScoreTab(away_team.getTeam_name() + " touchdown :", 7);

        scores[2] = new ScoreTab(home_team.getTeam_name() + " field goal :", 3);
        scores[3] = new ScoreTab(away_team.getTeam_name() + " field goal :", 3);

        scores[4] = new ScoreTab(home_team.getTeam_name() + " safety :", 2);
        scores[5] = new ScoreTab(away_team.getTeam_name() + " safety :", 2);

        //initializing the Sport's scoring array to the game played scoring array

        super.setArray_of_scores(scores);


    }
}

