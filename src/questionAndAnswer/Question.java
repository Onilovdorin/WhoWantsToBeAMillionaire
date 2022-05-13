package questionAndAnswer;

public class Question {

    private String quetionText;
    private int level;
    private int money;
    Answer answerOne;
    Answer answerTwo;
    Answer answerThree;
    Answer answerFour;

    Answer[] answers;


    public Question(String quetionText, Answer answerOne, Answer answerTwo, Answer answerThree, Answer answerFour, int level, int money) {
        this.quetionText = quetionText;
        this.level = level;
        this.money = money;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }

    public Answer[] getAnswers() {

        return answers;
    }

    public String getQuetionText() {
        return quetionText;
    }

    public void setQuetionText(String quetionText) {
        this.quetionText = quetionText;
    }

    public Answer getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(Answer answerOne) {
        this.answerOne = answerOne;
    }

    public Answer getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(Answer answerTwo) {
        this.answerTwo = answerTwo;
    }

    public Answer getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(Answer answerThree) {
        this.answerThree = answerThree;
    }

    public Answer getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(Answer answerFour) {
        this.answerFour = answerFour;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Answer getCorrectAnswer(Answer[] answers) {
        for (Answer correctAnswer : answers) {
            if (correctAnswer.isCorrect()) {
                return correctAnswer;
            }
        }
        return null;
    }


    public Answer[] getWrongAnswers(Answer[] answers) {
        Answer[] wrongAnswers = new Answer[3];
        int i = 0;
        for (Answer wrongAnswer : answers) {
            if (!wrongAnswer.isCorrect()) {
                wrongAnswers[i] = wrongAnswer;
                i++;
            }
        }
        return wrongAnswers;
    }

    public String getQuestion() {
        return quetionText;
    }

    public Answer[] getAnswer() {
        return answers;
    }
}
