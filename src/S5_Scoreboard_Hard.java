import java.util.Scanner;


/**
 * This class test the different method we have created in the other file using the input of a user.
 * @author aezouhri
 */
public class S5_Scoreboard_Hard {

    public static void main(String[] args) {

        Scanner user_input;
        int user_game_decision;
        String home_team;
        String away_team;


        user_input = new Scanner(System.in);

        System.out.println("Please enter the mame of the Home Team:");
        home_team = user_input.nextLine();
        System.out.println("Please enter the mame of the Away Team:");
        away_team = user_input.nextLine();

        Team homeTeam = new Team(home_team);
        Team awayTeam = new Team(away_team);

        Sports Game = new Sports(homeTeam, awayTeam, 0, 4, "garbage") {
        };


        System.out.println("Select the type of game: ");
        System.out.println("1. Hockey");
        System.out.println("2. Basketball");
        System.out.println("3. Soccer");
        System.out.println("4. Football");

        System.out.print("Enter Choice: ");
        user_game_decision = user_input.nextInt();


        while (user_game_decision <= 0 || user_game_decision > 4) {
            System.out.println("Wrong input, please choose a number between 1 and 4.");
            System.out.print("Enter Choice: ");
            user_game_decision = user_input.nextInt();
        }

        System.out.println();

        if (user_game_decision == 1) {
            Game = new Hockey(homeTeam, awayTeam);
        }

        if (user_game_decision == 2) {
            Game = new Basketball(homeTeam, awayTeam);
        }

        if (user_game_decision == 3) {
            Game = new Soccer(homeTeam, awayTeam);
        }

        if (user_game_decision == 4) {
            Game = new Football(homeTeam, awayTeam);
        }

        ScoreTab[] scoreTabs = Game.getArray_of_scores();


        while (Game.EndOfGame(Game.getCurrent_period(), Game.getNumber_of_periods())) {

            System.out.println("Choose an action from the following menu.");
            System.out.println("Menu: ");

            for (int i = 0; i < scoreTabs.length; i++) {

                System.out.println(i + 1 + ". " + scoreTabs[i].getScore_type() + scoreTabs[i].getScoring_way() + " points");

            }

            System.out.println(scoreTabs.length + 1 + "-" + " End of " + Game.getPeriod_name());

            System.out.print("Please enter you action:");
            user_game_decision = user_input.nextInt() - 1;


            while (user_game_decision < 0 || user_game_decision > scoreTabs.length) {
                System.out.println("Wrong input, please choose a number between 1 and " + scoreTabs.length + ".");
                System.out.print("Please enter you action: ");
                user_game_decision = user_input.nextInt() - 1;
            }
            System.out.println();

            if (user_game_decision == scoreTabs.length) {
                Game.setCurrent_period(Game.getCurrent_period() + 1);

            } else {
                Game.AssignScores(Game.getArray_of_scores(), user_game_decision, Game);
            }


            System.out.println(Game.getHome_team().getTeam_name() + " - " + Game.getHome_score() + ", " + Game.getAway_team().getTeam_name() + " - " + Game.getAway_score());
            if (Game.getCurrent_period() <= Game.getNumber_of_periods()) {
                System.out.println("Current " + Game.getPeriod_name() + ": " + Game.getCurrent_period());

            }

            System.out.println();

        }
        System.out.println("Game has ended. Finale scores are : ");
        System.out.println(Game.getHome_team().getTeam_name() + " : " + Game.getHome_score());
        System.out.println(Game.getAway_team().getTeam_name() + " : " + Game.getAway_score());


        if (Game.getAway_score() > Game.getHome_score()) {
            System.out.println(Game.getAway_team().getTeam_name() + " has won!");
        } else if (Game.getAway_score() < Game.getHome_score()) {
            System.out.println(Game.getHome_team().getTeam_name() + " has won!");
        } else {
            System.out.println("The game resulted in a tie");
        }


    }

}
