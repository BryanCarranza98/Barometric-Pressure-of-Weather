/* This program will let the user input the max number of biometric pressure, they will have
 the choice to input a pressure or quit the program. If they decide to input the program will
 correct if input wrong pressure measure or another value. If they decide to quit, the program
 will output measurement they typed */




import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {

        WeatherStation station=new WeatherStation();
        Scanner cin = new Scanner(System.in);

        int choice =0;
        double pressure=0.0;
        int numberEnt;

        System.out.print("Enter the max number of biometric pressure you will type:  ");
        numberEnt= (int) KeyboardUtils.getValidInteger();               // inputting the max number desired
        station.setMAX_COUNT(numberEnt);

        for (int i=0; i<numberEnt; i++) // the max number of tries
        {

            System.out.print("Enter the barometric pressure: [upt to " +
                    station.getMAX_COUNT() + "] (1) Add (2) Quit: ");       // choice they desire add or quit the program
            choice = cin.nextInt();


            while(true)  // repeating loop
            {

                if (choice == 1) // if input is 1
                {

                    try
                    {
                        System.out.print("Enter the biometric pressure value: ");  // entering the pressure value
                        pressure = cin.nextDouble();
                        station.addPressure(pressure);
                        break;
                    }

                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input. Please try again... "); // if its letters instead of a number it will catch
                        cin.next();
                        continue;                   //bring it back to reenter the measurement
                    }

                    catch (NumberFormatException e) // if it doesnt have the right measurements will catch it
                    {
                        System.out.println("Invalid Barometric pressure");
                        continue;                   //bring it back to reenter the measurement

                    }

                }

                while (choice != 2 && station.getCount() < station.getMAX_COUNT() ) // if quit the pogram will show the measurements/choices
                {
                    System.out.println(station.toString());

                }
                break;

            }

        }

        for (int i=0; i<numberEnt; i++) // if reaches the all max number will out the measurements
        {
            System.out.println(station.toString());
            break;
        }

    }

}
