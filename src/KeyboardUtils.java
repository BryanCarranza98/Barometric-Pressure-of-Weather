import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardUtils
{

    public static int getValidInteger()
    {

        int numberEnt =0;
        Scanner cin = new Scanner(System.in);
        boolean errorOccurred = false;

        do {

            try
            {
                errorOccurred=false; // seeing if the value is a number
                numberEnt = cin.nextInt();

            }
            catch(InputMismatchException imex) // catching if its NOT a number
            {
                cin.next();
                errorOccurred=true;
                System.out.println(  "Invalid Input. Please try again..."  ); // outputting the message
                System.out.print("Enter the max number of biometric pressure you will type:  ");
            }

        } while (errorOccurred);

        return numberEnt;








    }



}


