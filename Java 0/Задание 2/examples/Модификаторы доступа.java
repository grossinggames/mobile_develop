public int i;
private double j, k;
private int createMethod(int a) {...};
public class Cat{}


public class SomeSensor
{
    private int sensorData;

    public SomeSensor()
    {
        sensorData = 0;
    }

    private void calibrate(int iSeed)
    {
        // код для калибровки
    }

    protected void seedCalibration(int iSeed)
    {
        calibrate(iSeed);
    }

    public int getSensorData()
    {
        // Check sensor here

        return sensorData;
    }
}