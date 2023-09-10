import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator implements ActionListener {

    JTextField firstNumberField;
    JTextField secondNumberField;
    JTextField resultField;
    JButton addButton;
    JButton subtractButton;
    JButton multiplyButton;
    JButton divideButton;

    SimpleCalculator() {
        JFrame frame = new JFrame("Simple Calculator");
        JLabel heading = new JLabel("Simple Calculator");
        JLabel firstNumber = new JLabel("First Number");
        JLabel secondNumber = new JLabel("Second Number");
        JLabel result = new JLabel("Result");
        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        resultField = new JTextField();
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        heading.setBounds(50, 50, 500, 30);
        firstNumber.setBounds(50, 100, 500, 30);
        secondNumber.setBounds(50, 150, 500, 30);
        result.setBounds(50, 200, 500, 30);
        firstNumberField.setBounds(200, 100, 500, 30);
        secondNumberField.setBounds(200, 150, 500, 30);
        resultField.setBounds(200, 200, 500, 30);
        addButton.setBounds(50, 250, 95, 30);
        subtractButton.setBounds(150, 250, 95, 30);
        multiplyButton.setBounds(250, 250, 95, 30);
        divideButton.setBounds(350, 250, 95, 30);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        resultField.setEditable(false);

        frame.add(heading);
        frame.add(firstNumber);
        frame.add(secondNumber);
        frame.add(result);
        frame.add(firstNumberField);
        frame.add(secondNumberField);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);

        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String firstNumber = firstNumberField.getText();
        String secondNumber = secondNumberField.getText();
        int result = 0;
        
        String buttonOperation = ((JButton) e.getSource()).getText();

        if (buttonOperation == "Add") {
            result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        }
        else if (buttonOperation == "Subtract") {
            result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
        }
        else if (buttonOperation == "Multiply") {
            result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
        }
        else if (buttonOperation == "Divide") {
            result = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
        }
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
