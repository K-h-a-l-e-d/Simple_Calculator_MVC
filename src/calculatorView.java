//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel opLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("=");
    private JTextField calcSolution = new JTextField(10);
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");

    calculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(3);
        this.setSize(600, 200);
        calcPanel.add(this.firstNumber);
        calcPanel.add(this.opLabel);
        calcPanel.add(this.secondNumber);
        calcPanel.add(this.calculateButton);
        calcPanel.add(this.calcSolution);
        calcPanel.add(this.addButton);
        calcPanel.add(this.subtractButton);
        calcPanel.add(this.multiplyButton);
        calcPanel.add(this.divideButton);
        this.add(calcPanel);
    }

    public double getFirstNumber() {
        return (double)Integer.parseInt(this.firstNumber.getText());
    }

    public double getSecondNumber() {
        return (double)Integer.parseInt(this.secondNumber.getText());
    }

    public String getOp() {
        return this.opLabel.getText();
    }

    public double getCalcSolution() {
        return (double)Integer.parseInt(this.calcSolution.getText());
    }

    public void setCalcSolution(double solution) {
        this.calcSolution.setText(Double.toString(solution));
    }

    void calculationListener(ActionListener ListenForCalcButton) {
        this.calculateButton.addActionListener(ListenForCalcButton);
    }

    void additionButtonListener(ActionListener ListenForCalcButton) {
        this.addButton.addActionListener(ListenForCalcButton);
    }

    void subtractionButtonListener(ActionListener ListenForCalcButton) {
        this.subtractButton.addActionListener(ListenForCalcButton);
    }

    void multiplicationButtonListener(ActionListener ListenForCalcButton) {
        this.multiplyButton.addActionListener(ListenForCalcButton);
    }

    void divisionButtonListener(ActionListener ListenForCalcButton) {
        this.divideButton.addActionListener(ListenForCalcButton);
    }

    void setAdditionOpLabel() {
        this.opLabel.setText("+");
    }

    void setSubtractionOpLabel() {
        this.opLabel.setText("-");
    }

    void setMultiplicationOpLabel() {
        this.opLabel.setText("*");
    }

    void setDivisionOpLabel() {
        this.opLabel.setText("/");
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
