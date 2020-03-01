public class Road
{
    private Car one;
    private Car two=null;
    private double width=5;
    private double light=2;
    public Road(Car one, double width, double light)
    {
        this.one=one;
        this.width=width;
        this.light=light;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(int n)
    {
        width=n;
    }
    public double getLight()
    {
        return light;
    }
    public void setLight(int n)
    {
        light=n;
    }
    public double stopOrNot()
    {
        double sum1=one.getSpeed()*this.light+0.5*one.getPositiveAcceleration()*this.light*this.light;
        double sum2=one.getSpeed()*this.light+0.5*one.getNegativeAcceleration()*this.light*this.light;
        if(sum1>=this.width+one.getDistance()) {
            return -1;
        }
        else if(sum2<=one.getDistance())
        {
            return -2;
        }
        else
        {
            return sum2-one.getDistance();
        }
    }
    public double stopOrNotAdvanced()//this method also checks maxspeed
    {
        double sum1=one.getSpeed()*this.light+0.5*one.getPositiveAcceleration()*this.light*this.light;
        double sum2=one.getSpeed()*this.light+0.5*one.getNegativeAcceleration()*this.light*this.light;
        if(sum1>=this.width+one.getDistance()&&sum1/light<=one.getMaxSpeed())//here we also check if the maximum speed is not violated
        {
            return -1;
        }
        else if(sum2<=one.getDistance())
        {
            return -2;
        }
        else
        {
            return sum2-one.getDistance();
        }
    }
    public void setTwo(Car two)
    {
        this.two=two;
    }


}
