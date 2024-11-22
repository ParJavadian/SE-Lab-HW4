package com.example.calculator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorStepDefs {
    private double operand1;
    private double operand2;
    private double result;
    private Exception exception;

    @Given("the first operand is {double}")
    public void theFirstOperandIs(double operand1) {
        this.operand1 = operand1;
    }

    @And("the second operand is {double}")
    public void theSecondOperandIs(double operand2) {
        this.operand2 = operand2;
    }

    @When("the operation is {string}")
    public void theOperationIs(String operator) {
        Calculator calculator = new Calculator();
        try {
            switch (operator) {
                case "+":
                    result = calculator.add(operand1, operand2);
                    break;
                case "-":
                    result = calculator.subtract(operand1, operand2);
                    break;
                case "*":
                    result = calculator.multiply(operand1, operand2);
                    break;
                case "/":
                    result = calculator.divide(operand1, operand2);
                    break;
            }
            exception = null;
        } catch (ArithmeticException e) {
            exception = e;
        }
    }
}
