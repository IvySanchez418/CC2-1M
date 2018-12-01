import java.util.*;
public class calculator 
{
    
public static void main(String[] args) {
        calculator c = new calculator();
        c.repeatCalc();
    }
Scanner input = new Scanner (System.in);
      String prompt = "";
  

public void repeatCalc() {
        if (0<1) {
            calculate();
        }
            else {  
        }
    }
public void calculate() {
        double result=0;
        String problm = "";
        System.out.println("Enter the number and its operation desired");
        
        st = scan.nextLine();
        stNew = st.split("/" +" +" + "-" + "x");
        list = new int[stNew.length];
        for (int i = 0; i < stNew.length; i++){
            list[i] =  Integer.parseInt(stNew[i]);

            
        for (int i=0; i<stNew.length();i++) {
            if (problm.charAt(i)=='/') {
                list = Double.parseDouble(stNew.length() / Double.parseDouble(problm.substring(i+1,stNew.length());
            }
            if  (problm.charAt(i)=='-') {
                list = Double.parseDouble(stNew.length() - Double.parseDouble(problm.substring(i+1,stNew.length());
            }
             if  (problm.charAt(i)=='x') {
                 list = Double.parseDouble(stNew.length() * Double.parseDouble(problm.substring(i+1,stNew.length());
            }

             if  (problm.charAt(i)=='+') {
                  list = Double.parseDouble(stNew.length() + Double.parseDouble(problm.substring(i+1,stNew.length());
            }
        }
        System.out.println("Answer is: " + result);
	System.out.println("Do you want to calculate again?");
        System.out.println("[1] YES \n"
                + "[2] NO");
        prompt = input.nextLine();
        if (prompt.equals("1")) {
            repeatCalc();

        }
        if (prompt.equals("2")) {
            System.out.println("GOODBYE");
            System.exit(0);
        }
    }
}