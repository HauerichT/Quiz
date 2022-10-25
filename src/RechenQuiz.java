public class RechenQuiz {

    int operand1;
    int operand2;

    int operandMin = 1;
    int operandMax = 20;
    int operatorNum;
    private String operator;

    int result;

    public void createExercise() {
        operand1 = operandMin + (int)(Math.random() * ((operandMax - operandMin) + operandMin));
        operand2 = operandMin + (int)(Math.random() * ((operandMax - operandMin) + operandMin));
        operatorNum =  1 + (int)(Math.random() * ((3 - 1) + 1));

        switch (operatorNum) {
            case 1:
                operator = "+";
                result = operand1+operand2;
                break;
            case 2:
                operator = "-";
                result = operand1-operand2;
                break;
            case 3:
                operator = "*";
                result = operand1*operand2;
                break;
        }
    }
    public void getExercise() {

        do {
            createExercise();
        } while (result < 0);

        System.out.println(operand1 + operator + operand2);

    }

    public int getResult() {
        return result;
    }
}