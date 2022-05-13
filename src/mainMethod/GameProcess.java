package mainMethod;

import questionAndAnswer.Answer;
import questionAndAnswer.Question;

import java.util.Scanner;

public class GameProcess {
    Question[] allQuestions;

    public void startGame() {
        allQuestions = initQuestion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("|-----------------------------------|");
        System.out.println("|   Cine vrea sa devina milionar?   |");
        System.out.println("|-----------------------------------|");
        boolean answer = true;
        int level = 1;
        int totalMoney = 0;
        while (answer && level <= 10) {
//            Question question = getQuestionByLevel(level);
//            System.out.println(question.getQuestion());
//            for (Answer myAnswer : question.getAnswer()) {
//                System.out.println(myAnswer.answerSequence() + " : " + myAnswer.getAnswer());
//            }
//            System.out.println("Raspunsul este: ");
//            String gamerAnswer = scanner.nextLine();
            Question question = getQuestionByLevel(level);
            if (question != null) {
                System.out.println("-------------");
                System.out.println("| Nivelul " + level + " |");
                System.out.println("---------------------------------------------------|");
                System.out.println(question.getQuetionText());
//                for (Answer answers : question.getAnswers()){
//                    System.out.println(answers.getAnswerSequence() + ":" +answers.getAnswerText());
//                }

                System.out.println("a:" + question.getAnswerOne().getAnswerText()+"\t\tb:" + question.getAnswerTwo().getAnswerText());
                System.out.println("c:" + question.getAnswerThree().getAnswerText()+"\t\td:" + question.getAnswerFour().getAnswerText());
                System.out.println("---------------------------------------------------|");
                System.out.println("Raspunsul tau este :");

                String gamerAnswer = scanner.nextLine();
//                AnswerSequence gamesAnswers = AnswerSequence.valueOf(gamerAnswer.toUpperCase());

//                if (question.getVerifyAnswer(gamesAnswers)) {
//                    System.out.println("Raspunsul este corect!");
//                    totalMoney += question.getMoney();
//                    System.out.println("Punctaj: " + totalMoney);
//                } else {
//                    System.out.println("Raspunsul nu este corect");
//                    System.out.println("Jocul s-a sfirsit");
//                    System.out.println("Punctaj acumulat:" + totalMoney);
//                    answer = false;
//                }

                switch (gamerAnswer) {
                    case "a":
                        if (question.getAnswerOne().getAnswerIsCorrect()) {
                            System.out.println("Raspunsul este corect!");
                            totalMoney += question.getMoney();
                            System.out.println("Punctaj: " + totalMoney);
                        } else {
                            System.out.println("Raspunsul nu este corect");
                            System.out.println("Jocul s-a sfirsit");
                            System.out.println("Punctaj acumulat:" + totalMoney);
                            answer = false;
                        }
                        break;
                    case "b":
                        if (question.getAnswerTwo().getAnswerIsCorrect()) {
                            System.out.println("Raspunsul este corect!");
                            totalMoney += question.getMoney();
                            System.out.println("Punctaj: " + totalMoney);
                        } else {
                            System.out.println("Raspunsul nu este corect");
                            System.out.println("Jocul s-a sfirsit");
                            System.out.println("Punctaj acumulat:" + totalMoney);
                            answer = false;
                        }
                        break;
                    case "c":
                        if (question.getAnswerThree().getAnswerIsCorrect()) {
                            System.out.println("Raspunsul este corect!");
                            totalMoney += question.getMoney();
                            System.out.println("Punctaj: " + totalMoney);
                        } else {
                            System.out.println("Raspunsul nu este corect");
                            System.out.println("Jocul s-a sfirsit");
                            System.out.println("Punctaj acumulat:" + totalMoney);
                            answer = false;
                        }
                        break;
                    case "d":
                        if (question.getAnswerFour().getAnswerIsCorrect()) {
                            System.out.println("Raspunsul este corect!");
                            totalMoney += question.getMoney();
                            System.out.println("Punctaj: " + totalMoney);
                        } else {
                            System.out.println("Raspunsul nu este corect");
                            System.out.println("Jocul s-a sfirsit");
                            System.out.println("Punctaj acumulat:" + totalMoney);
                            answer = false;
                        }
                        break;
                    default:
                        System.out.println("Raspunsul tau nu este valabil. Introdu a, b, c sau d!");
                        level--;
                }

                level++;
            } else {
                answer = false;
            }
        }
        if (totalMoney==30000){
            System.out.println("FELICITARI AI CASTIGAT JOCUL!");
        }
    }



    public Question getQuestionByLevel(int level) {
        Question question = null;
        Question[] allQuestions = initQuestion();
        for (Question questions : allQuestions) {
            if (questions.getLevel() == level) {
                question = questions;
                break;
            }
        }


        return question;
    }

    private Question[] initQuestion() {
        Question[] questions = new Question[10];

        Answer question1Answer1 = new Answer("Saturn", false, "a");
        Answer question1Answer2 = new Answer("Mercur", false, "b");
        Answer question1Answer3 = new Answer("Jupiter", true, "c");
        Answer question1Answer4 = new Answer("Marte", false, "d");
        Question question1Level1 = new Question("Care este cea mai mare planetă din sistemul solar?:",
                question1Answer1,question1Answer2,question1Answer3,question1Answer4, 1, 100);

        Answer question2Answer1 = new Answer("Ghepardul", true, "a");
        Answer question2Answer2 = new Answer("Leul", false, "b");
        Answer question2Answer3 = new Answer("Jaguarul", false, "c");
        Answer question2Answer4 = new Answer("Leopardul", false, "d");
        Question question1Level2 = new Question("Care este cel mai rapid animal terestru?:",
                question2Answer1,question1Answer2,question1Answer3,question1Answer4, 2, 400);

        Answer question3Answer1 = new Answer("10", true, "a");
        Answer question3Answer2 = new Answer("8 ", false, "b");
        Answer question3Answer3 = new Answer("6 ", false, "c");
        Answer question3Answer4 = new Answer("4 ", false, "d");
        Question question1Level3 = new Question("Câte picioare are un homar?: ",
                question3Answer1, question3Answer2, question3Answer3, question3Answer4, 3, 1000);

        Answer question4Answer1 = new Answer("Thomas Edison", false, "a");
        Answer question4Answer2 = new Answer("Albert Einstein", false, "b");
        Answer question4Answer3 = new Answer("Nikola Tesla", false, "c");
        Answer question4Answer4 = new Answer("Alexander Graham Bell", true, "d");
        Question question1Level4 = new Question("Cine a inventat telefonul?: ",
                question4Answer1, question4Answer2, question4Answer3, question4Answer4, 4, 1500);

        Answer question5Answer1 = new Answer("104", false, "a");
        Answer question5Answer2 = new Answer("206", true, "b");
        Answer question5Answer3 = new Answer("219", false, "c");
        Answer question5Answer4 = new Answer("183", false, "d");
        Question question1Level5 = new Question("Câte oase are corpul uman?: ",
                question5Answer1, question5Answer2, question5Answer3, question5Answer4, 5, 2000);

        Answer question6Answer1 = new Answer("Piatra Jad", false, "a");
        Answer question6Answer2 = new Answer("Fildes", true, "b");
        Answer question6Answer3 = new Answer("Chihlimbar", false, "c");
        Answer question6Answer4 = new Answer("Nici un raspuns nu e corect", false, "d");
        Question question1Level6 = new Question("Din ce este făcut colțul unui elefant?: ",
                question6Answer1, question6Answer2, question6Answer3, question6Answer4, 6, 2500);

        Answer question7Answer1 = new Answer("Hidrogen", true, "a");
        Answer question7Answer2 = new Answer("Heliu", false, "b");
        Answer question7Answer3 = new Answer("Aluminiu", false, "c");
        Answer question7Answer4 = new Answer("Aur", false, "d");
        Question question1Level7 = new Question("Care este primul element al tabelului periodic?: ",
                question7Answer1, question7Answer2, question7Answer3, question7Answer4, 7, 3500);

        Answer question8Answer1 = new Answer("3", false, "a");
        Answer question8Answer2 = new Answer("6", false, "b");
        Answer question8Answer3 = new Answer("4", false, "c");
        Answer question8Answer4 = new Answer("2", true, "d");
        Question question1Level8 = new Question("Câte valve are inima omului?:",
                question8Answer1, question8Answer2, question8Answer3, question8Answer4, 8, 4500);

        Answer question9Answer1 = new Answer("8", false, "a");
        Answer question9Answer2 = new Answer("6", false, "b");
        Answer question9Answer3 = new Answer("5", false, "c");
        Answer question9Answer4 = new Answer("7", true, "d");
                Question question1Level9 = new Question("Câte continente există pe Pământ?:",
                question9Answer1, question9Answer2, question9Answer3, question9Answer4, 9, 6000);

        Answer question10Answer1 = new Answer("Helsinki", false, "a");
        Answer question10Answer2 = new Answer("Reykjavik", true, "b");
        Answer question10Answer3 = new Answer("Stockholm", false, "c");
        Answer question10Answer4 = new Answer("Oslo", false, "d");
        Question question1Level10 = new Question("Care este capitala Islandei?:",
                question10Answer1, question10Answer2, question10Answer3, question10Answer4, 10, 8500);

        questions[0] = question1Level1;
        questions[1] = question1Level2;
        questions[2] = question1Level3;
        questions[3] = question1Level4;
        questions[4] = question1Level5;
        questions[5] = question1Level6;
        questions[6] = question1Level7;
        questions[7] = question1Level8;
        questions[8] = question1Level9;
        questions[9] = question1Level10;

        return questions;
    }
}
