package com.main;

public class Lidar implements Sensor
{

    private Detection detection;

    public Lidar()
    {

    }

    public void setDetection(Detection detection)
    {
        this.detection = detection;
    }

    public Detection getDetection()
    {
        return detection;
    }

    public void Print()
    {
        if(detection == null)
        {
            System.out.println("Lidar detection state unknown");
        }
        else
        {
            detection.render(this);
        }
    }
}
