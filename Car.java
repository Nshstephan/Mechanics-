public class Car
{
    private double speed=20;
    private double distance=10;
    private double positiveAcceleration=1;
    private double negativeAcceleration=1;
    private double maxSpeed;
    public Car(double speed, double distance, double positiveAcceleration, double negativeAcceleration)
    {
        this.speed=speed;
        this.distance=distance;
        this.positiveAcceleration=positiveAcceleration;
        this.negativeAcceleration=negativeAcceleration;
    }
    public double getSpeed()
    {
        return speed;
    }
    public void setSpeed(double n)
    {
        speed=n;
    }
    public double getDistance()
    {
        return distance;
    }
    public void setDistance(double n)
    {
        distance=n;
    }
    public double getPositiveAcceleration()
    {
        return positiveAcceleration;
    }
    public void setPositiveAcceleration(double n)
    {
        positiveAcceleration=n;
    }
    public double getNegativeAcceleration()
    {
        return negativeAcceleration;
    }
    public void setNegativeAcceleration(double n)
    {
        negativeAcceleration=n;
    }
    public void setMaxSpeed(double n)
    {
        maxSpeed=n;
    }
    public double getMaxSpeed()
    {
        return maxSpeed;
    }
}
