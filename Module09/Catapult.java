package Module09;

/**
 * Project title: 09.04 Challenge Program
 *
 * Purpose of Project: Calculates the trajectory of a projectile based on launch angles and launch velocities.
 *
 * @version 2/16/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood OOP more.
 *
 * (-) Need more practice with OOP.
 * ***************************
 *
 * In the future: Practice.
 */

public class Catapult {

    private double velocity, degrees, distance;

    public Catapult(double v, double deg) {
        velocity = v;
        degrees = deg;
    }

    public double getVelocity(){
        return velocity;
    }

    public double getDegrees(){
        return degrees;
    }

    public double getDistance(){
        return distance;
    }

    public void calcDistance(){
        distance = (Math.pow(velocity, 2) * Math.sin( 2 * Math.toRadians(degrees)) / 9.8);
    }

}
