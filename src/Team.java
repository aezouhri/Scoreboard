/**
 * Class is used to create new Teams for a the played game
 * @author aezouhri
 */
public class Team {
    /**
     * Variable representing the name of a team.
     */
    private String team_name;

    /**
     * Variable representing the score of a team.
     */
    private int team_score;

    /**
     * Constructor for the Team class.
     * @param team_name Name of the team.
     */
    Team(String team_name) {
        this.team_name = team_name;
        team_score = 0;
    }

    /**
     * Gets the name of a team
     * @return Name of the team.
     */
    public String getTeam_name() {
        return team_name;
    }

    /**
     * Sets the name of a team.
     * @param team_name Name of the team.
     */
    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    /**
     * Gets the score of a team.
     * @return Score of the team.
     */
    public int getTeam_score() {
        return team_score;
    }

    /**
     * Sets the score of a team.
     * @param team_score Score of the team.
     */
    public void setTeam_score(int team_score) {
        this.team_score = team_score;
    }
}
