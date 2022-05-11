package help;

import questionAndAnswer.Answer;
import questionAndAnswer.Question;

public class FiftyFiftyHelp extends HelpOption {


    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        return new HelpAnswer[2];
    }
}