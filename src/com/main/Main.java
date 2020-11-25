package com.main;

public class Main {

    public static void main(String[] args)
    {
	    Camera camera = new Camera();
	    Lidar lidar = new Lidar();
        Proximity proximity = new Proximity();
        Temperature temperature = new Temperature();

        camera.setDetection(new PeopleDetection());
        lidar.setDetection(new RoadDetection());
        temperature.setDetection(new SignDetection());

        Panel panel = new Panel();
        DataModel dataModel = new DataModel();
        panel.addSensor(camera);
        panel.addSensor(lidar);
        dataModel.addSensor(proximity);
        dataModel.addSensor(temperature);
        dataModel.addPanel(panel);

        dataModel.CheckDetections();
    }
}
