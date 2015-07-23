
package DistanceTraveled;

public class DistanceFunctions {
    
    private int trainSpeed;
    private double trainTime;
    
    public void setTrainSpeed(int trainSpd)
    {
        trainSpeed = trainSpd;
    }
    
    public void setTrainTime(double trainTme)
    {
        trainTime = trainTme;
    }
    
    // The getters
    public int getTrainSpeed()
    {
        return trainSpeed;
    }
    
    public double getTrainTime()
    {
        return trainTime;
    }
    
    /* a method that will return the
    distance the train has traveled
    */
    public double getDistance()
    {
        // ratio is Distance = Speed * Time
        return trainSpeed * trainTime;
    }
    
}
