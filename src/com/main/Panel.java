package com.main;

import java.util.ArrayList;

public class Panel
{
    ArrayList<Sensor> sensors;

    public Panel()
    {
        sensors = new ArrayList<Sensor>();
    }

    public void CheckDetections()
    {
        for (Sensor sensor : sensors)
        {
            sensor.Print();
        }
    }

    public void addSensor(Sensor sensor)
    {
        sensors.add(sensor);
    }
}
