import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double speed=sc.nextDouble();
        speed*=0.277778;//I assumed that I am getting the speed in km/h and converting it to m/s
        double distance=sc.nextDouble();
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        double positiveAcceleration=sc.nextDouble();
        double negativeAcceleration=sc.nextDouble();
        double maxSpeed=sc.nextDouble();
        Car avto=new Car(speed, distance, positiveAcceleration, negativeAcceleration);
        avto.setMaxSpeed(maxSpeed);
        Road xachmeruk=new Road(avto, w ,l);
        if(xachmeruk.stopOrNot()==-1)
            System.out.println("Car will manage to cross the crossroad");
        else if(xachmeruk.stopOrNot()==-2)
            System.out.println("Car will not manage to cross the crossroad, but it will manage to stop");
        else
        {
            System.out.println("Initially car attempted to pass the crossroad but it couldnt manage to do so "+"\n"+"It also didnt manage to stop since the breaking path was too long"+"\n"+"so it shoud have started to" );
            System.out.println("braking "+xachmeruk.stopOrNot()+"ms earlier");
        }
        distance=sc.nextDouble();
        positiveAcceleration=sc.nextDouble();
        negativeAcceleration=sc.nextDouble();
        speed=sc.nextDouble();
        speed*=0.277778;
        Car second=new Car(speed, distance, positiveAcceleration, negativeAcceleration);
        xachmeruk.setTwo(second);
    }
}
