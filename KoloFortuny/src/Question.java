import java.util.Scanner;

public class Question extends Questions implements QuestionsImp {
    private String questionType,difficulty,questionContent,answerA,answerB,answerC,answerD,correctAnswer;

    public Question(String questionType, String difficulty, String questionContent, String answerA, String answerB,
                    String answerC, String answerD, String correctAnswer) {
        this.questionType = questionType;
        this.difficulty = difficulty;
        this.questionContent = questionContent;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }


    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public String getDupa(){
        return doDziedziczna;
    }
    @Override
    public void showQuestion(){
        System.out.println("\n"+questionType+" "+difficulty+"\n"+questionContent+"\n"+answerA+"\n"+answerB+"\n"
                +answerC+"\n"+answerD+"\n"+correctAnswer);
    }
    @Override
    public boolean isCorrect() {
        System.out.println("podaj odp:");
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equals(correctAnswer)){
            return true;
        }else{
            return false;
        }
    }
}
