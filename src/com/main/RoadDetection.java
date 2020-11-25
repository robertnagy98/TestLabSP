package com.main;

public class RoadDetection implements Detection
{

    public void render(Sensor sensor)
    {
        if(sensor instanceof Camera)
        {
            System.out.println("Camera is detecting road");
        }
        else if(sensor instanceof Lidar)
        {
            System.out.println("Lidar is detecting road");
        }
        else if(sensor instanceof Proximity)
        {
            System.out.println("Proximity is detecting road");
        }
        else
        {
            System.out.println("Temperature is detecting road");
        }
    }

}
