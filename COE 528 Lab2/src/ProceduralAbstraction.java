import java.util.*;

public class ProceduralAbstraction 
{
    //Requires: None 
    //Modifies: None 
    //Effects: Returns the smallest positive integer n for which n!  
    //(i.e. 1*2*3*...*n) is greater than or equal to x, for positive  
    //integer x. Otherwise returns 1.
    public static int reverseFactorial(int x)
    {
        int number = x;
        int divide = 2;
        int n = 0;
        int remainder = 1;
            
            if((number % divide) == 0)
            {
                while(number > 0)
                {
                    number = (number / divide);
                    divide++;
                    n++;
                }
                
                if(n < 0)
                {
                    return 1;
                }
                else
                {
                    return (divide - 1);
                }
            }
            else
            {
                while(number > 0)
                {
                    remainder = (number % divide);
                    number = ((number - remainder) / divide);
                    divide++;
                }
                if(n < 0)
                {
                    return 1;
                }
                else
                {
                    return (divide - 1);
                }
            }  
    }
    //Requires: None 
    //Modifies: None 
    //Effects: If the matrix arr satisfies Nice property, prints the sum and  
    //returns true. Otherwise returns false.
    public static boolean isMatricNice(int[][] arr)
    {
        int[][] matrix = arr;
        int RowSum = 0;
        int ColSum = 0;
        int PrimaryDiagSum = 0;
        int SecondaryDiagSum = 0;
        
            System.out.println("The inputted array:");
            for(int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[i].length; j++)
                {
                    System.out.print(matrix[i][j] + "\t");
                }
                    System.out.println();
            }
            
            //Primary Diagnal Sum
            for(int i = 0; i < matrix.length; i++)
            {
                PrimaryDiagSum += matrix[i][i];
            }
            
            //Secondary Diagnal Sum
            for(int i = 0; i < matrix.length; i++)
            {
                SecondaryDiagSum += matrix[i][matrix.length - 1 - i];
            }
            
            //Check to see if the sum of both diagnals are the same or not
            if(SecondaryDiagSum != PrimaryDiagSum)
                return false;
            
            //Sum of rows
            for(int i = 0; i < matrix.length; i++)
            {
                RowSum = 0;
                for(int j = 0; j < matrix[i].length; j++)
                {
                    RowSum += matrix[i][j];
                }
                    if(RowSum != PrimaryDiagSum)
                        return false;
            }
            
            //Sum of columns
            for(int i = 0; i < matrix.length; i++)
            {
                ColSum = 0;
                for(int j = 0; j < matrix[i].length; j++)
                {
                    ColSum += matrix[j][i];
                }
                    if(ColSum != PrimaryDiagSum)
                        return false;
            }
            
        System.out.println("\nSum of each row: "+ PrimaryDiagSum);
        return true;    
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int factorial = 0;
        int xval = 0;
        int dimension;
        boolean isMatrixNice = false;
        
            //ReverseFactorial test
            System.out.println("Input a number!");
            xval = scan.nextInt();
            
                factorial = ProceduralAbstraction.reverseFactorial(xval);
                System.out.println("\nThe smallest positive interger of n in which"
                        + " n! is greater than or equal to " + xval + " is " 
                        +factorial+".");
            
            //isMatrixNice test
            System.out.println("\nEnter the dimension of the array (Ex: 2 = 2x2)");
            dimension = scan.nextInt();
            
            int[][] array = new int[dimension][dimension];

                System.out.println("\nTime to initialize the Matrix!");
                for(int i = 0; i < dimension; i++)
                {
                    for(int j = 0; j < dimension; j++)
                    {
                        System.out.println("Enter ID: ["+ i + "][" + j +"]");
                        array[i][j] = scan.nextInt();
                    }
                }
                System.out.println("\n");
                isMatrixNice = ProceduralAbstraction.isMatricNice(array);  
                
                if(isMatrixNice == true)
                {
                    System.out.println("Matrix is nice!");
                }
                else
                {
                    System.out.println("Matrix is not nice!");
                }
                
    }
    
}