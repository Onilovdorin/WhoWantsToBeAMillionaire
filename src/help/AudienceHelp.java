package help;

import questionAndAnswer.Question;

public class AudienceHelp extends HelpOption{


    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        return new HelpAnswer[4];
    }
}
