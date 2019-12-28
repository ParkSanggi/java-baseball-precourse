package domain;

import View.InputView;
import View.OutputView;

public class Answer {
    private String answer;

    public Answer(int countOfCard) {
        answer = InputView.inputAnswerNumber();
        answer = checkSizeOfAnswer(countOfCard, answer);
    }

    private static String checkSizeOfAnswer(int countOfCard, String answer) {
        while (answer.length() != countOfCard) {
            OutputView.printInvalidLength(countOfCard);
            answer = InputView.inputAnswerNumber();
        }
        return answer;
    }

    public boolean isEqual(String secretNumber) {
        return answer.equals(secretNumber);
    }

    public int getStrikeCount(String secretNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < secretNumbers.length(); i++) {
            if (secretNumbers.charAt(i) == answer.charAt(i)) {
                strikeCount += 1;
            }
        }
        return strikeCount;
    }

    public int getBallCount(String secretNumber) {
        int ballCount = 0;
        for (int i = 0; i < answer.length(); i++) {
            char answerCharacter = answer.charAt(i);
            for (int j = 0; j < secretNumber.length(); j++) {
                if (i != j && secretNumber.charAt(j) == answerCharacter) {
                    ballCount++;
                }
            }
        }
        return ballCount;
    }
}
