package com.main;

public class SignDetection implements Detection
{
    public void render(Sensor sensor)
    {
        if(sensor instanceof Camera)
        {
            System.out.println("Camera is detecting signs");
        }
        else if(sensor instanceof Lidar)
        {
            System.out.println("Lidar is detecting signs");
        }
        else if(sensor instanceof Proximity)
        {
            System.out.println("Proximity is detecting signs");
        }
        else
        {
            System.out.println("Temperature is detecting signs");
        }
    }
}
