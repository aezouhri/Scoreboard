/**
 * Class for handling a Basketball game.
 * @author aezouhri
 */
public class Basketball extends Sports {

    /**
     * Construcor for the Basketball class
     * @param home_team Home team object.
     * @param away_team Away team object.
     */
    public Basketball(Team home_team, Team away_team) {
        super(home_team, away_team, 1, 4, "Quarter");
        this.setAway_team(away_team);
        this.setHome_team(home_team);

        ScoreTab[] scores = new ScoreTab[6];

        scores[0] = new ScoreTab(home_team.getTeam_name() + " free throw :", 1);
        scores[1] = new ScoreTab(away_team.getTeam_name() + " free throw :", 1);

        scores[2] = new ScoreTab(home_team.getTeam_name() + " two-pointer :", 2);
        scores[3] = new ScoreTab(away_team.getTeam_name() + " two-pointer :", 2);

        scores[4] = new ScoreTab(home_team.getTeam_name() + " three-pointer :", 3);
        scores[5] = new ScoreTab(away_team.getTeam_name() + " three-pointer :", 3);

        //initializing the Sport's scoring array to the game played scoring array
        super.setArray_of_scores(scores);


    }
}

