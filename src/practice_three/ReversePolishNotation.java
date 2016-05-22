package practice_three;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.function.BiFunction;

/**
 * Дано арифметичний вираз у вигляді Польського Інверсного запису.
 * Необхідно обчислити значення виразу і повернути його.
 * Вираз складається лише з цілих чисел і операцій +, -, *, /. Гарантується, що результат також ціне число.
 */
public class ReversePolishNotation {
       public int evaluate(String expression) {
           String cleanExpr = cleanExpr(expression);
           LinkedList<Integer> stack = new LinkedList<Integer>();
           System.out.println("Input\tOperation\tStack after");
           for(String token:cleanExpr.split("\\s")){
               System.out.print(token+"\t");
               Integer tokenNum = null;
               try{
                   tokenNum = Integer.parseInt(token);
               }catch(NumberFormatException e){}
               if(tokenNum != null){
                   System.out.print("Push\t\t");
                   stack.push(Integer.parseInt(token+""));
               }else if(token.equals("*")){
                   System.out.print("Operate\t\t");
                   int secondOperand = stack.pop();
                   int firstOperand = stack.pop();
                   stack.push(firstOperand * secondOperand);
               }else if(token.equals("/")){
                   System.out.print("Operate\t\t");
                   int secondOperand = stack.pop();
                   int firstOperand = stack.pop();
                   stack.push(firstOperand / secondOperand);
               }else if(token.equals("-")){
                   System.out.print("Operate\t\t");
                   int secondOperand = stack.pop();
                   int firstOperand = stack.pop();
                   stack.push(firstOperand - secondOperand);
               }else if(token.equals("+")){
                   System.out.print("Operate\t\t");
                   int secondOperand = stack.pop();
                   int firstOperand = stack.pop();
                   stack.push(firstOperand + secondOperand);
               }else if(token.equals("^")){
                   System.out.print("Operate\t\t");
                   int secondOperand = stack.pop();
                   int firstOperand = stack.pop();
                   stack.push((int) Math.pow(firstOperand, secondOperand));
               }else{//just in case
                   System.out.println("Error");
                   return 0;
               }
               System.out.println(stack);
           }
           System.out.println("Final answer: " + stack.pop());
           return Integer.valueOf(stack.pop());
       }

    private static String cleanExpr(String expr){
        //remove all non-operators, non-whitespace, and non digit chars
        return expr.replaceAll("[^\\^\\*\\+\\-\\d/\\s]", "");
    }
}