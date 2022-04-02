public class QuestionAnswer {
    String QUESTION_1_LEVEL_1 = "Care este cea mai mare planetă din sistemul solar?:";
    String QUESTION_1_ANSWER_1 = "Saturn";
    String QUESTION_1_ANSWER_2 = "Mercur";
    String QUESTION_1_ANSWER_3 = "Jupiter";
    String QUESTION_1_ANSWER_4 = "Marte";
    int QUESTION_1_MONEY = 100;

    String QUESTION_2_LEVEL_2 = "Care este cel mai rapid animal terestru?:";
    String QUESTION_2_ANSWER_1 = "Ghepardul";
    String QUESTION_2_ANSWER_2 = "Leul";
    String QUESTION_2_ANSWER_3 = "Jaguarul";
    String QUESTION_2_ANSWER_4 = "Leopardul";
    int QUESTION_2_MONEY = 200;

    String QUESTION_3_LEVEL_3 = "Câte picioare are un homar?: ";
    String QUESTION_3_ANSWER_1 = "10";
    String QUESTION_3_ANSWER_2 = "8";
    String QUESTION_3_ANSWER_3 = "6";
    String QUESTION_3_ANSWER_4 = "4";
    int QUESTION_3_MONEY = 500;

    String QUESTION_4_LEVEL_4 = "Cine a inventat telefonul?: ";
    String QUESTION_4_ANSWER_1 = "Thomas Edison";
    String QUESTION_4_ANSWER_2 = "Albert Einstein";
    String QUESTION_4_ANSWER_3 = "Alexander Graham Bell";
    String QUESTION_4_ANSWER_4 = "Nikola Tesla";
    int QUESTION_4_MONEY = 1000;

    String QUESTION_5_LEVEL_5 = "Câte oase are corpul uman?: ";
    String QUESTION_5_ANSWER_1 = "104";
    String QUESTION_5_ANSWER_2 = "206";
    String QUESTION_5_ANSWER_3 = "219";
    String QUESTION_5_ANSWER_4 = "183";
    int QUESTION_5_MONEY = 2000;

    String QUESTION_6_LEVEL_6 = "Din ce este făcut colțul unui elefant?:";
    String QUESTION_6_ANSWER_1 = "Piatra Jad";
    String QUESTION_6_ANSWER_2 = "Fildes";
    String QUESTION_6_ANSWER_3 = "Chihlimbar";
    String QUESTION_6_ANSWER_4 = "Nici un raspuns nu e corect";
    int QUESTION_6_MONEY = 3000;

    String QUESTION_7_LEVEL_7 = "Care este primul element al tabelului periodic?: ";
    String QUESTION_7_ANSWER_1 = "Hidrogen";
    String QUESTION_7_ANSWER_2 = "Heliu";
    String QUESTION_7_ANSWER_3 = "Aluminiu";
    String QUESTION_7_ANSWER_4 = "Aur";
    int QUESTION_7_MONEY = 4000;

    String QUESTION_8_LEVEL_8 = "Câte valve are inima omului?:";
    String QUESTION_8_ANSWER_1 = "3";
    String QUESTION_8_ANSWER_2 = "6";
    String QUESTION_8_ANSWER_3 = "4";
    String QUESTION_8_ANSWER_4 = "2";
    int QUESTION_8_MONEY = 5000;


    Answer question1Answer1 = new Answer(QUESTION_1_ANSWER_1, false, "a");
    Answer question1Answer2 = new Answer(QUESTION_1_ANSWER_2, false, "b");
    Answer question1Answer3 = new Answer(QUESTION_1_ANSWER_3, true, "c");
    Answer question1Answer4 = new Answer(QUESTION_1_ANSWER_4, false, "d");

    Answer question2Answer1 = new Answer(QUESTION_2_ANSWER_1, true, "a");
    Answer question2Answer2 = new Answer(QUESTION_2_ANSWER_2, false, "b");
    Answer question2Answer3 = new Answer(QUESTION_2_ANSWER_3, false, "c");
    Answer question2Answer4 = new Answer(QUESTION_2_ANSWER_4, false, "d");

    Answer question3Answer1 = new Answer(QUESTION_3_ANSWER_1, true, "a");
    Answer question3Answer2 = new Answer(QUESTION_3_ANSWER_2, false, "b");
    Answer question3Answer3 = new Answer(QUESTION_3_ANSWER_3, false, "c");
    Answer question3Answer4 = new Answer(QUESTION_3_ANSWER_4, false, "d");

    Answer question4Answer1 = new Answer(QUESTION_4_ANSWER_1, false, "a");
    Answer question4Answer2 = new Answer(QUESTION_4_ANSWER_2, false, "b");
    Answer question4Answer3 = new Answer(QUESTION_4_ANSWER_3, true, "c");
    Answer question4Answer4 = new Answer(QUESTION_4_ANSWER_4, false, "d");

    Answer question5Answer1 = new Answer(QUESTION_5_ANSWER_1, false, "a");
    Answer question5Answer2 = new Answer(QUESTION_5_ANSWER_2, true, "b");
    Answer question5Answer3 = new Answer(QUESTION_5_ANSWER_3, false, "c");
    Answer question5Answer4 = new Answer(QUESTION_5_ANSWER_4, false, "d");

    Answer question6Answer1 = new Answer(QUESTION_6_ANSWER_1, false, "a");
    Answer question6Answer2 = new Answer(QUESTION_6_ANSWER_2, true, "b");
    Answer question6Answer3 = new Answer(QUESTION_6_ANSWER_3, false, "c");
    Answer question6Answer4 = new Answer(QUESTION_6_ANSWER_4, false, "d");

    Answer question7Answer1 = new Answer(QUESTION_7_ANSWER_1, true, "a");
    Answer question7Answer2 = new Answer(QUESTION_7_ANSWER_2, false, "b");
    Answer question7Answer3 = new Answer(QUESTION_7_ANSWER_3, false, "c");
    Answer question7Answer4 = new Answer(QUESTION_7_ANSWER_4, false, "d");

    Answer question8Answer1 = new Answer(QUESTION_8_ANSWER_1, false, "a");
    Answer question8Answer2 = new Answer(QUESTION_8_ANSWER_2, false, "b");
    Answer question8Answer3 = new Answer(QUESTION_8_ANSWER_3, true, "c");
    Answer question8Answer4 = new Answer(QUESTION_8_ANSWER_4, false, "d");


    Question question1Level1 = new Question(QUESTION_1_LEVEL_1, question1Answer1, question1Answer2, question1Answer3, question1Answer4, 1, QUESTION_1_MONEY);
    Question question2Level2 = new Question(QUESTION_2_LEVEL_2, question2Answer1, question2Answer2, question2Answer3, question2Answer4, 2, QUESTION_2_MONEY);
    Question question3Level3 = new Question(QUESTION_3_LEVEL_3, question3Answer1, question3Answer2, question3Answer3, question3Answer4, 3, QUESTION_3_MONEY);
    Question question4Level4 = new Question(QUESTION_4_LEVEL_4, question4Answer1, question4Answer2, question4Answer3, question4Answer4, 4, QUESTION_4_MONEY);
    Question question5Level5 = new Question(QUESTION_5_LEVEL_5, question5Answer1, question5Answer2, question5Answer3, question5Answer4, 5, QUESTION_5_MONEY);
    Question question6Level6 = new Question(QUESTION_6_LEVEL_6, question6Answer1, question6Answer2, question6Answer3, question6Answer4, 6, QUESTION_6_MONEY);
    Question question7Level7 = new Question(QUESTION_7_LEVEL_7, question7Answer1, question7Answer2, question7Answer3, question7Answer4, 7, QUESTION_7_MONEY);
    Question question8Level8 = new Question(QUESTION_8_LEVEL_8, question8Answer1, question8Answer2, question8Answer3, question8Answer4, 8, QUESTION_8_MONEY);


}
