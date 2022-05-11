package questionAndAnswer;

public class Answer {

    private String answerText;
    private boolean answerIsCorrect;
    private String answerSequence;

    public Answer(String answerText, boolean answerIsCorrect, String answerSequence) {
        this.answerText = answerText;
        this.answerIsCorrect = answerIsCorrect;
        this.answerSequence = answerSequence;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean getAnswerIsCorrect() {
        return answerIsCorrect;
    }

    public void setAnswerIsCorrect(boolean answerIsCorrect) {
        this.answerIsCorrect = answerIsCorrect;
    }

    public String getAnswerSequence() {
        return answerSequence;
    }

    public void setAnswerSequence(String answerSequence) {
        this.answerSequence = answerSequence;
    }

    public boolean isCorrect() {
        return answerIsCorrect;
    }

}
