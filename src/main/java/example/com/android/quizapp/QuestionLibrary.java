package example.com.android.quizapp;

/**
 * Created by Joe Kahora
 */

public class QuestionLibrary {
    private String mQuestions[];
    private String mPick[][];

    {
        mQuestions = new String[]{
                "whom among the following is not batman's robin",
                "whom of the following is superman arc-enemy",
                "how many lantern corp are there in the DC universe",
                "whose suit is made of the nTH metal",
        };
        mPick = new String[][]{
                {"dick Grayson", "jason todd", "tim drake", "jaime reyes"},
                {"Lex Luthor", "Poison Ivy", "H'el", "General Zod"},
                {"2", "4", "6", "7"},
                {"DeadShot", "DeathStroke", "BatMan", "BoosterGold"},
        };
    }

    private String mCorrectAnswers[] = {"jaime reyes", "Lex Luthor", "7", "DeathStroke"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
//returns the correct answer for the first question
    public String getPick1(int a) {
        String pick0 = mPick[a][3];
        return pick0;
    }
// returns correct answer for the second question
    public String getPick2(int a) {
        String pick1 = mPick[a][0];
        return pick1;
    }
    // returns correct answer for the third question
    public String getPick3(int a) {
        String pick2 = mPick[a][3];
        return pick2;
    }
    // returns correct answer for the fourth question
    public String getPick4(int a) {
        String pick3 = mPick[a][1];
        return pick3;
    }

    public String getCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
