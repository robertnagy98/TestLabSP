package com.main;

public class Proximity implements Sensor
{
    Detection detection;

    public Proximity()
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
            System.out.println("Proximity detection state unknown");
        }
        else
        {
            detection.render(this);
        }
    }
}
