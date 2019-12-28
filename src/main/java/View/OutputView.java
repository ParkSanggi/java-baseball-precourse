package View;

public class OutputView {

    public static void printInvalidLength(int countOfCard) {
        System.out.printf("%d 자리의 숫자를 입력해주세요.\n", countOfCard);
    }

    public static void printCorrectAnswer() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }
}
