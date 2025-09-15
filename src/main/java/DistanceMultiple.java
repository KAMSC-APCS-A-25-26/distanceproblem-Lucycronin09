// NAME : Lucy Cronin
// GROUP : APCS-A
// LAST MODIFIED : September 10th, 2025
// PROBLEM ID : Lewis 2.8 Distance Program
// PROBLEM DESCRIPTION : Write a program that prompts
// : the user for two (x.y)
// : coordinates. Return the
// : distance between the two points.
// SOURCES I USED : APCS Textbook and Mr.H
// PEOPLE I HELPED : Lizzie Bippley
// PEOPLE WHO HELPED ME : Lizzie Bippley and Keegan Cronin

// import scanner
import java.util.Scanner;
public class DistanceMultiple
{
    public static void main(String[] args)
    {
// create scanner object and read in variables
        Scanner sc = new Scanner(System.in);

// signature block
        System.out.print("Lucy Cronin\nAPCS-A\nLewis 2.8 Distance Program\n\n\n");

// read in the number of runs
        System.out.print("Number of Runs: ");
        int numRuns = sc.nextInt();
        System.out.print("\n\n");

// repeat the run the amount of times provided by the user
        for(int j = 0;j < numRuns;j++)
        {

// delimit unwanted items
            sc.useDelimiter("[(),\\s]+");

// read in two coordinate points
            System.out.print("Type 2 Coordinate points: ");
            double numx1 = sc.nextDouble();
            double numy1 = sc.nextDouble();
            double numx2 = sc.nextDouble();
            double numy2 = sc.nextDouble();
            System.out.println();
            System.out.print("Distance between points: ");
            System.out.print(Math.sqrt(Math.pow((numx2-numx1), 2) + Math.pow((numy2-numy1), 2)));
            System.out.println(" units");
            System.out.println();
            System.out.println();
            System.out.println();

// find the sum and return it
        }
    }
}
/*
Lucy Cronin
APCS-A
Lewis 2.8 Distance Program
Number of Runs: 3
Type 2 Coordinate points: (2,3) (7,3)

Distance between points: 5.0 units

Type 2 Coordinate points: (4,5) (8,8)
Distance between points: 5.0 units

Type 2 Coordinate points: (-1,-2) (0,7)
Distance between points: 9.055385138137417 units

*/