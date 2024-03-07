package com.javaAlgorithmPractices.vQueueAndStack;


//Java code​​​​​​‌​‌​‌​‌‌‌​‌‌‌​‌‌‌​​‌‌​‌‌​ below
//Write your answer here, and then test your code.
//Your job is to implement the evaluateRPN() method.

import java.util.Stack;

public class Answer {

 // Change these boolean values to control whether you see 
 // the expected result and/or hints.
 static boolean showExpectedResult = true;
 static boolean showHints = true;

 private static boolean isNumber(String token) {
     try {
         Double.parseDouble(token);
         return true;
     } catch (NumberFormatException e) {
         return false;
     }
 }

 private static boolean isOperator(String token) {
     return "+-*/".contains(token);
 }

 private static double performOperation(String operator, double operand1, double operand2) {
     switch (operator) {
         case "+":
             return operand1 + operand2;
         case "-":
             return operand1 - operand2;
         case "*":
             return operand1 * operand2;
         case "/":
             return operand1 / operand2;
         default:
             throw new IllegalArgumentException("Invalid operator: " + operator);
     }
 }

 // Return the result of the Reverse Polish notation expression
 static double evaluateRPN(String expression) {

     if(expression.length() == 0){
         return 0;
     }
     
     Stack<String> stack = new Stack<String>();

     String[] tokens =  expression.split("");

     for(int i=0; i<tokens.length; i++){
         if(isNumber(tokens[i])){
             stack.push(tokens[i]);
         }else if(isOperator(tokens[i])){
             double operand1 = Double.parseDouble(stack.pop());
             double operand2 = Double.parseDouble(stack.pop());
             double result = performOperation(tokens[i],operand1, operand2);
             stack.push(String.valueOf(result));
         }
     }

     double output = Double.parseDouble(stack.peek());
     
     return output;
 }

}
