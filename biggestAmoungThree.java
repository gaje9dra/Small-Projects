 
import java.util.Scanner;
public class biggestAmoungThree{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter first number : ");
int firstNumber =in.nextInt();
System.out.println("Enter second number : ");
int secondNumber =in.nextInt();
System.out.println("Enter third number : ");
int thirdNumber =in.nextInt();

if(secondNumber<firstNumber && firstNumber>thirdNumber){
System.out.println(firstNumber+" is the Biggest number...");
}else if(firstNumber<secondNumber && secondNumber>thirdNumber){
System.out.println(secondNumber+" is the Biggest number...");
}else if(secondNumber<thirdNumber && thirdNumber>firstNumber){
System.out.println(thirdNumber+" is the Biggest number...");
}}}