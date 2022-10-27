public class TestQuiz {
    public static void main(String[] args) {
        // Initialisierung eines neuen Rechenquiz
        RechenQuiz quiz = new RechenQuiz();
        quiz.getExercise();
        int result = quiz.getResult();
        // gibt Ergebnis der Zufallsaufgabe aus
        System.out.println("Ergebnis: "+result);
    }
}
