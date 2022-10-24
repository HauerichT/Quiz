public class RechenQuiz {

    int operand1;
    int operand2;

    int operandMin = 1;
    int operandMax = 20;
    int operator;

    int result;

    public void createExercise() {
        operand1 = operandMin + (int)(Math.random() * ((operandMax - operandMin) + operandMin));
        operand2 = operandMin + (int)(Math.random() * ((operandMax - operandMin) + operandMin));
        operator =  1 + (int)(Math.random() * ((3 - 1) + 1));

        switch (operator) {
            case 1:
                result = operand1+operand2;
                break;
            case 2:
                result = operand1-operand2;
                break;
            case 3:
                result = operand1*operand2;
                break;
        }
    }
    public void getExercise() {

        do {
            createExercise();

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