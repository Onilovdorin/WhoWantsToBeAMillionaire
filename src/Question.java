public class Question {

    String quetionText;
    Answer answerOne;
    Answer answerTwo;
    Answer answerThree;
    Answer answerFour;
    int level;
    int money;

    public Question(String quetionText, Answer answerOne, Answer answerTwo, Answer answerThree, Answer answerFour,  int level, int money) {
        this.quetionText = quetionText;
        this.level = level;
        this.money = money;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }
}
