package help;

import questionAndAnswer.Question;

public class PhoneHelp extends HelpOption{


    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        return new HelpAnswer[1];
    }
}
