import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        double[] temps = {99.1, 142, 85, 86.1, 84.6, 94.3, 124.9, 98, 101, 102.5};
        ArrayList<Double> t = new ArrayList<Double>();
        for(double n : temps) t.add(n);

        //testing
        WeatherData w = new WeatherData(t);
        w.cleanData(85.0, 120.0);
        System.out.println(w);
        t.add(1, 121.0);
        System.out.println(w);
        t.add(1, 84.0);
        System.out.println(w);
        w.cleanData(85.0, 120.0);
        System.out.println(w);

        double[] newTemps = {100.5, 98.5, 102, 103.9, }
        }
}