public class calculatorModel{

    private double calculationValue;

    public void addTwoNumbers ( double firstNumber, double secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public void subtractTwoNumbers(double firstNumber, double secondNumber){
        calculationValue = firstNumber - secondNumber;
    }

    public void multiplyTwoNumbers ( double firstNumber, double secondNumber){
        calculationValue = firstNumber * secondNumber;
    }

    public void divideTwoNumbers ( double firstNumber, double secondNumber){
        calculationValue = firstNumber / secondNumber;
    }

    public void setAdditionOpLabel(){

    }

    public double getCalculationValue(){
        return calculationValue;
    }
}