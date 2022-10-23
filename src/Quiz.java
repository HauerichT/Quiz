public class Quiz {
    public static void main(String[] args) {
        RechenQuiz quiz = new RechenQuiz();
        quiz.getExercise();
        int result = quiz.getResult();
        System.out.println("Ergebnis: "+result);
    }
}
