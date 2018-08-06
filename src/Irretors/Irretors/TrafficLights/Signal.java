package Irretors.Irretors.TrafficLights;

public class Signal {

    private Light light;

    public Signal(String light) {
        this.light = Light.valueOf(light);
    }

    public void changeSignal()
    {
        this.light=Light.values()[(this.light.ordinal()+1)%3];
    }

    @Override
    public String toString() {
        return this.light.name();
    }
}
