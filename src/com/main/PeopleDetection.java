package com.main;

public class PeopleDetection implements Detection
{
    public void render(Sensor sensor)
    {
        if(sensor instanceof Camera)
        {
            System.out.println("Camera is detecting people");
        }
        else if(sensor instanceof Lidar)
        {
            System.out.println("Lidar is detecting people");
        }
        else if(sensor instanceof Proximity)
        {
            System.out.println("Proximity is detecting people");
        }
        else
        {
            System.out.println("Temperature is detecting people");
        }

    }
}
