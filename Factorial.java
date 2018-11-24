import java.util.Scanner;
class Factorial {  
 public static void main(String args[]){  
  int i,fact=1; 
 
 System.out.println("Write a number you want to factor");

 int number = new Scanner(System.in).nextInt();

 
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
} 