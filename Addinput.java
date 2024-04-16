import java.util.Scanner;
class Addinput{
public static void main (String [] args){
Scanner object = new Scanner(System.in);
int num1 = object.nextInt();
int num2 = object.nextInt();
int num3 = object.nextInt();
int res = num1+num2+num3;
System.out.print("result is"+res);
}
}