package domain;

import View.OutputView;

public class Grader {
    private final String secretNumbers;
    private Answer answer;

    public Grader(String secretNumbers) {
        this.secretNumbers = secretNumbers;
    }

    public boolean isCorrect(Answer answer) {
        this.answer = answer;
        if (answer.isEqual(secretNumbers)) {
            OutputView.printCorrectAnswer();
            return true;
        }
        System.out.println(getHint());
        return false;
    }

    private String getHint() {
        int strikeCount = answer.getStrikeCount(secretNumbers);
        int ballCount = answer.getBallCount(secretNumbers);
        return formatHint(strikeCount, ballCount);
    }

    private static String formatHint(int strikeCount, int ballCount) {
        String strikeForm = "";
        String ballForm = "";
        if (strikeCount != 0) {
            strikeForm = strikeCount + " 스트라이크 ";
        }
        if (ballCount != 0) {
            ballForm = ballCount + "볼";
        }
        if (strikeCount == 0 && ballCount == 0) {
            ballForm = "낫싱";
        }
        return strikeForm + ballForm;
    }
}
