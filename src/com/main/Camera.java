package com.main;

public class Camera implements Sensor
{
    private Detection detection;
    public Camera()
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
            System.out.println("Camera detection state unknown");
        }
        else
        {
            detection.render(this);
        }
    }
}
