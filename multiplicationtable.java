import java.util.Scanner;

public class multiplicationtable {
    
public static void main (String []args){
	Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension:"); 
        String num1 = input.next();
      
	String[] parts = num1.split("x");
	String part1 = parts[0]; 
	String part2 = parts[1];

	int rw= Integer.parseInt(part1);
        int col=Integer.parseInt(part2); 
        
	int r[] = new int[rw];       
	int c[] = new int[col];
        int[][] data = new int[rw][col];
        data = timesTable(rw, col);
        for (int row = 0; row < data.length ; row++)
    {
        for (int column = 0; column < data[row].length; column++)
        {
            System.out.printf("%2d ",data[row][column]);
        }
        System.out.println();
    }
}
public static int[][] timesTable(int r, int c)
{
    int [][] yes = new int[r][c];
    for (int row = 0; row < yes.length ; row++)
    {
        for (int column = 0; column < yes[row].length; column++)
        {
            yes[row][column] = (row+1)*(column+1);
        }

    }
    return yes;
}
}
