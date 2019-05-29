import java.util.Arrays;

public class WeatherStation
{

    public   double[] pressures; // not appropriate to have setter and getter
    public static int DEFAULT_MAX_COUNT =5;
    public  int MAX_COUNT;
    public int count;
    public double minpressure;
    public double maxpressure;


    public WeatherStation() // setting some values
    {
        count = 0;
        minpressure=25.69;
        maxpressure=32.01;
    }




    public void addPressure(double pressure) // if the measurements are correct
    {


        if(pressure <minpressure || pressure>maxpressure){
            throw new NumberFormatException();

        }
        if(pressure >minpressure|| pressure<maxpressure){      // if the measurements are correct will save it
            pressures[count] = pressure;
            count++;
        }


    }




    public void setMAX_COUNT( int MAX_COUNT) // saves the number into the max number enterd
    {
        pressures = new double[MAX_COUNT];
        this.MAX_COUNT = MAX_COUNT;
    }



    public int getCount() // getting the values
    {
        return count;
    }


    public int getMAX_COUNT()
    {

        return MAX_COUNT;
    }


    @Override
    public String toString() // outputting the result of the choices/measurements inputted
    {

        return "WeatherStation{"+ " MAX_COUNT=" + MAX_COUNT  +  ", count=" + count + ", pressures=" + Arrays.toString(pressures)  +
                '}';
    }
}
