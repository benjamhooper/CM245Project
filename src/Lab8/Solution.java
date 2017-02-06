/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

import javafx.application.Application;
import javafx.stage.Stage;

public class Solution extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public class Kettle {

    private double diameter; //in inches
    private double height; //in inches
    private static final double CM_PER_INCH = 2.54;

    public double getLiters() {
        return .001 * getVolume();
    }

    public double getGallons() {
        return 0.00026417205235815 * getVolume();
    }

    public double getQuarts() {
        return getGallons() * 4;
    }

    public double getHeightInCm() {
        return getHeight() * Kettle.CM_PER_INCH;
    }

    public double getDiameterInCm() {
        return getDiameter() * Kettle.CM_PER_INCH;
    }

    public double getVolume() {
        return Math.PI * Math.pow(this.getDiameterInCm() / 2, 2)
                * this.getHeightInCm();
    }

    public double getHeightPerGallon() {
        final double CUBIC_CM_PER_GAL = 3785.41;
        double r = this.getDiameterInCm() / 2;
        double heightInCm = CUBIC_CM_PER_GAL / (Math.PI * r * r);
        return heightInCm / Kettle.CM_PER_INCH;
    }

    /**
     * @return the diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(double diameter) {
        if (diameter < 0) {
            throw new IllegalArgumentException("Diameter must be non-negative.");
        }
        this.diameter = diameter;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be non-negative.");
        }
        this.height = height;
    }
}
}