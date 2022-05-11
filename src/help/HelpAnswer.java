package help;

import questionAndAnswer.Answer;

public class HelpAnswer {

    private Answer answer;
    private double probability;

    public HelpAnswer(Answer answer, double probability) {
        this.answer = answer;
        this.probability = probability;
    }

    public HelpAnswer() {

    }

    public HelpAnswer(Answer[] wrongHelpAnswer, int probability) {
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }


}
