import java.util.Scanner;
public class preparation{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number : ");
int inputNumber= scanner.nextInt();
if(inputNumber<0){
System.out.println(inputNumber+" is a Negative number");
}else{
System.out.println(inputNumber+" is a Positive number");
}}}