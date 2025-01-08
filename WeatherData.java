import java.util.ArrayList;

public class WeatherData
{
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temps){
        temperatures = temps;
    }

    public void cleanData(double lower, double upper){
        for(int i = 0; i < temperatures.size(); i++){
            double temp = temperatures.get(i);
            if(temp < lower || temp > upper) temperatures.remove(i);
            i--;
        }
    }

    public String toString(){
        return temperatures.toString();
    }
  
    public int longestHeatWave(double threshold){
        return 0;
    }
    
}