package com.calculator;

@SuppressWarnings("serial")
public class Calculator implements java.io.Serializable {
	private double operandOne;
	private char operation;					
	private double operandTwo;
	private double result = 0.00;
	public Calculator() {										
		
	}
	
	public void performOperation() {
		
		switch(operation) {
		case '+':{
			result = operandOne + operandTwo;}break;
		case '-':{
			result = operandOne - operandTwo;}break;
		case '*':{
			result = operandOne * operandTwo;}break;
		case '/':{
			result = operandOne / operandTwo;}break;}
	}
	
	public double getResult() {
		return result;
	}
				
	public Double getOperandOne() {
		return operandOne;
	}
	public Character getOperation() {
		return operation;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperation(Character operation) {
		this.operation = operation;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
}