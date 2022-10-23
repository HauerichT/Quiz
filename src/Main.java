public class Main {
    public static void main(String[] args) {

        RechenQuiz quiz = new RechenQuiz();
        quiz.getExercise();
        int result = quiz.getResult();
        System.out.println("Result: "+result);
    }
}
