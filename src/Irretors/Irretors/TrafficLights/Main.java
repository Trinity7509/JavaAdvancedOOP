package Irretors.Irretors.TrafficLights;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        List<Signal> newSignal=new ArrayList<>();
        String[] input =reader.readLine().split("\\s+");
        for (String s : input) {
            Signal signal=new Signal(s);
            newSignal.add(signal);
        }

        int n=Integer.parseInt(reader.readLine());
        StringBuilder sb=new StringBuilder();

while(n-->0)
{
    for (Signal signal : newSignal) {
        signal.changeSignal();
        sb.append(signal).append(" ");
        
    }
    sb.append(System.lineSeparator());
}
        System.out.println(sb);




    }
}
