public class RechenQuiz {

    int operand1;
    int operand2;
    int operator;

    int result;

    public void getExercise() {

        do {
            operand1 = 1 + (int)(Math.random() * ((20 - 1) + 1));
            operand2 = 1 + (int)(Math.random() * ((20 - 1) + 1));
            operator =  1 + (int)(Math.random() * ((3 - 1) + 1));

            if (operator == 1) {
                result = operand1+operand2;
            }
            else if (operator == 2) {
                result = operand1-operand2;
            }
            else {
                result = operand1*operand2;
            }

            if (result >= 0 && operator == 1) {
                System.out.println(operand1 + " + " + operand2 + " = ?");
            }
            else if (result >= 0 && operator == 2) {
                System.out.println(operand1 + " - " + operand2 + " = ?");
            }
            else if (result >= 0 && operator == 3){
                System.out.println(operand1 + " * " + operand2 + " = ?");
            }
        } while (result < 0);
    }

    public int getResult() {
        return result;
    }
}