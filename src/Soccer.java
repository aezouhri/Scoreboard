/**
 * Class for handling a Soccer game.
 * @author aezouhri
 */
public class Soccer extends Sports {

    /**
     * Construcor for the Soccer class
     * @param home_team Home team object.
     * @param away_team Away team object.
     */
    public Soccer(Team home_team, Team away_team) {
        super(home_team, away_team, 1, 2, "Halves");
        this.setAway_team(away_team);
        this.setHome_team(home_team);

        ScoreTab[] scores = new ScoreTab[2];

        scores[0] = new ScoreTab(home_team.getTeam_name() + " goal :", 1);

        scores[1] = new ScoreTab(away_team.getTeam_name() + " goal :", 1);

        //initializing the Sport's scoring array to the game played scoring array
        super.setArray_of_scores(scores);


    }
}

