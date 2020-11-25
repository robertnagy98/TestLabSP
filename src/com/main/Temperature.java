package com.main;

public class Temperature implements Sensor
{

    public Detection detection;

    public Temperature()
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
            System.out.println("Temperature detection state unknown");
        }
        else
        {
            detection.render(this);
        }
    }
}
