import View.InputView;
import domain.Answer;
import domain.Grader;
import domain.SecretNumber;

public class Baseball {
    private static final int COUNT_OF_CARD = 3;

    public static void main(String[] args) {
        boolean playGame = true;
        while (playGame) {
            Grader grader = new Grader(SecretNumber.make(COUNT_OF_CARD));
            checkGradeResult(grader);
            playGame = askPlayAgain();
        }
    }

    private static void checkGradeResult(Grader grader) {
        boolean correctStatus = false;
        while (!correctStatus) {
            Answer answer = new Answer(COUNT_OF_CARD);
            correctStatus = grader.isCorrect(answer);
        }
    }

    private static boolean askPlayAgain() {
        String AgainStatus = InputView.inputPlayAgainNumber();
        return AgainStatus.equals("1");
    }
}
