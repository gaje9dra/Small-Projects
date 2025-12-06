import java.util.*;
public class calculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int input=sc.nextInt();
int input2=sc.nextInt();

System.out.println("1 for add");
System.out.println("2 for sub");
System.out.println("3 for multi");
System.out.println("4 for divide");
System.out.println("5 for Reminder");
System.out.println("Choose a operation (1/2/3/4/5) :");
int choose =sc.nextInt();
if(choose ==1){
System.out.println(input+input2);
}else if(choose ==2){
System.out.println(input-input2);
}else if(choose ==3){
System.out.println(input*input2);
}else if(choose ==4){
System.out.println(input/input2);
}else if(choose ==5){
System.out.println(input%input2);
}else{
System.out.println("Invalid Response");
}}}