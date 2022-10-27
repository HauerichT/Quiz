public class RechenQuiz {

    // Variablen zur Speicherung der Operanden
    int operand1;
    int operand2;

    // Variablen zur Speicherung des Wertebereichs der Operanden
    int operandMin = 1;
    int operandMax = 20;

    // Variable zur Speicherung des Operator-Indizes
    int operatorNum;

    // Variable zur Speicherung des Operators als Zeichen
    String operator;

    // Variable zur Speicherung des Ergebnisses
    int result;

    // Getter-Methode zur Generierung einer zufälligen Rechenaufgabe
    public void getExercise() {
        do {
            // generiert zufällige Zahl für Operanden zwischen [1,20]
            operand1 = operandMin + (int)(Math.random() * ((operandMax - operandMin) + operandMin));
            operand2 = operandMin + (int)(Math.random() * ((operandMax - operandMin) + operandMin));

            // generiert zufällige Zahl für die Zuweisung eines Operators
            operatorNum =  1 + (int)(Math.random() * ((3 - 1) + 1));

            // berechnet die Zufallsaufgabe und weist Operator zu
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

        // Zufallsaufgabe wird so lange neu erstellt, bis Ergebnis größer oder gleich 0 ist
        } while (result < 0);

        // printet die generierte Rechenaufgabe
        System.out.println(operand1 + " " + operator + " " + operand2 + " = ?");
    }

    // Getter-Methode zur Rückgabe des Ergebnisses der zufälligen Rechenaufgabe
    public int getResult() {
        return result;
    }
}