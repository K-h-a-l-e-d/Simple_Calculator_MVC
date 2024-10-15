import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorController {
    private calculatorView theView;
    private calculatorModel theModel;

    public calculatorController(calculatorView theView, calculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.calculationListener(new calculateListener());
        this.theView.additionButtonListener(new additionListener());
        this.theView.subtractionButtonListener(new subractionListener());
        this.theView.multiplicationButtonListener(new multiplicationListener());
        this.theView.divisionButtonListener(new divisionListener());
    }

    class calculateListener implements ActionListener {
        calculateListener() {
        }

        public void actionPerformed(ActionEvent e) {
            double secondNumber = 0.0;

            try {
                double firstNumber = calculatorController.this.theView.getFirstNumber();
                secondNumber = calculatorController.this.theView.getSecondNumber();
                switch (calculatorController.this.theView.getOp()) {
                    case "+":
                        calculatorController.this.theModel.addTwoNumbers(firstNumber, secondNumber);
                        break;
                    case "-":
                        calculatorController.this.theModel.subtractTwoNumbers(firstNumber, secondNumber);
                        break;
                    case "*":
                        calculatorController.this.theModel.multiplyTwoNumbers(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber == 0.0) {
                            calculatorController.this.theView.displayErrorMessage("Error: Division By Zero ");
                        } else {
                            calculatorController.this.theModel.divideTwoNumbers(firstNumber, secondNumber);
                        }
                }

                calculatorController.this.theView.setCalcSolution(calculatorController.this.theModel.getCalculationValue());
            } catch (NumberFormatException var8) {
                calculatorController.this.theView.displayErrorMessage("You Need to Enter 2 integers");
            }

        }
    }

    class additionListener implements ActionListener {
        additionListener() {
        }

        public void actionPerformed(ActionEvent e) {
            calculatorController.this.theView.setAdditionOpLabel();
        }
    }

    class subractionListener implements ActionListener {
        subractionListener() {
        }

        public void actionPerformed(ActionEvent e) {
            calculatorController.this.theView.setSubtractionOpLabel();
        }
    }

    class multiplicationListener implements ActionListener {
        multiplicationListener() {
        }

        public void actionPerformed(ActionEvent e) {
            calculatorController.this.theView.setMultiplicationOpLabel();
        }
    }

    class divisionListener implements ActionListener {
        divisionListener() {
        }

        public void actionPerformed(ActionEvent e) {
            calculatorController.this.theView.setDivisionOpLabel();
        }
    }
}
