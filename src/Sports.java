import java.util.Arrays;

/**
 * This class handles all the different sports' information and game actions.
 * @author aezouhri
 */
public abstract class Sports {
    /**
     * Team object for the Home team.
     */
    private Team home_team;

    /**
     * Team object for the Away team.
     */
    private Team away_team;

    /**
     * Variable for the Home team score.
     */
    private int home_score;

    /**
     * Variable for the Away team score.
     */
    private int away_score;

    /**
     * Variable for the current period being played.
     */
    private int current_period;

    /**
     * Variable for the total number of period in the chosen sport.
     */
    private int number_of_periods;

    /**
     * Variable for the name of a period in the chosen sport.
     */
    private String period_name;

    /**
     * ScoreBoard object
     */
    private ScoreTab[] array_of_scores;


    /**
     * Gets the name of the Home team.
     * @return name of the Home team.
     */
    public Team getHome_team() {
        return home_team;
    }

    /**
     * Sets the name of the Home team.
     * @param home_team Name of the Home team.
     */
    public void setHome_team(Team home_team) {
        this.home_team = home_team;
    }

    /**
     * Gets the name of the Away team.
     * @return Name of the Away team.
     */
    public Team getAway_team() {
        return away_team;
    }

    /**
     * Sets the name of the Away team.
     * @param away_team Name of the Away team.
     */
    public void setAway_team(Team away_team) {
        this.away_team = away_team;
    }

    /**
     * Gets the score of the Home team.
     * @return Score of the Home team.
     */
    public int getHome_score() {
        return home_score;
    }


    /**
     * Gets the score of the Away team.
     * @return Score of the Away team.
     */
    public int getAway_score() {
        return away_score;
    }


    /**
     * Gets the current period being played.
     * @return Current period being played.
     */
    public int getCurrent_period() {
        return current_period;
    }

    /**
     * Sets the period being played.
     * @param current_period Current period being played.
     */
    public void setCurrent_period(int current_period) {
        this.current_period = current_period;
    }

    /**
     * Gets the total number of period for the chosen sport.
     * @return Total number of periods.
     */
    public int getNumber_of_periods() {
        return number_of_periods;
    }


    /**
     * Gets the name of the periods played in the chosen sport.
     * @return Name of the periods.
     */
    public String getPeriod_name() {
        return period_name;
    }

//    /**
//     *
//     * @param period_name
//     */
//    public void setPeriod_name(String period_name) {
//        this.period_name = period_name;
//    }

    /**
     * Gets the ScoreBoard object for the game played.
     * @return ScoreBoard.
     */
    public ScoreTab[] getArray_of_scores() {
        return array_of_scores;
    }

    /**
     * Sets the ScoreBoard values.
     * @param array_of_scores Array containing scores.
     */
    public void setArray_of_scores(ScoreTab[] array_of_scores) {
        this.array_of_scores = array_of_scores;
    }

    /**
     * Constructor for the Sports class
     * @param home_team Home team.
     * @param away_team Away team.
     * @param current_period Current period played.
     * @param number_of_periods Total number of periods for chosen sport.
     * @param period_name Name of the periods in the sport.
     */
    public Sports(Team home_team, Team away_team, int current_period, int number_of_periods, String period_name) {

        this.home_team = home_team;
        this.away_team = away_team;
        this.current_period = current_period;
        this.number_of_periods = number_of_periods;
        this.period_name = period_name;


    }



    /**
     * This methods is used to handle the interaction between the user and the ScoreBoard.
     * @param score ScoreBoard for the current game.
     * @param user_choice Choice of what is happening during the game inputted by user.
     * @param game Current game being played.
     */
    public void AssignScores(ScoreTab[] score, int user_choice, Sports game) {
        int pts_to_add;

        if (user_choice % 2 == 0) {
            pts_to_add = game.home_score + score[user_choice].getScoring_way();
            game.home_score = pts_to_add;
        } else if (user_choice % 2 == 1) {
            pts_to_add = game.away_score + score[user_choice].getScoring_way();
            game.away_score = pts_to_add;
        }


    }

    /**
     * This methods is used to check if the game is over.
     * @param present_period Represents the current period played.
     * @param max_period Represents the total number of periods in a game of the chosen sport.
     * @return True if the game has ended, false otherwise.
     */
    public boolean EndOfGame(int present_period, int max_period) {
        if (present_period <= max_period) {
            return true;
        } else
            return false;
    }
}
