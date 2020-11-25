package com.main;

import java.util.ArrayList;

public class DataModel
{
    ArrayList<Panel> panels;
    ArrayList<Sensor> sensors;

    public DataModel()
    {
        panels = new ArrayList<Panel>();
        sensors = new ArrayList<Sensor>();
    }

    public void CheckDetections()
    {
        for(Sensor sensor : sensors)
        {
            sensor.Print();
        }
        for(Panel panel : panels)
        {
            panel.CheckDetections();
        }
    }

    public void addSensor(Sensor sensor)
    {
        sensors.add(sensor);
    }

    public void addPanel(Panel panel)
    {
        panels.add(panel);
    }
}
