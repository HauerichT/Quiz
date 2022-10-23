public class Test {

    public void test() {
        RechenQuiz quiz = new RechenQuiz();
        quiz.getExercise();
        int result = quiz.getResult();
        System.out.println("Ergebnis: "+result);
    }
}
