/**
 * Author: Will Lewis | wlewis16
 * File: Star.java
 * This class will handle the creation of all stars
 */


import java.util.Random;

public class Star {

    enum StarType {O, B, A, F, G, K, M};

    private StarType type;
    private double temp;
    private double mass;
    private double radius;
    private double luminosity;
    private static double SUN_TEMP = 5778;

    /**
     * Create a new star, the type of which is determined using real data
     * (i.e. the chance of creating an O type star is 1 in 3,000,000)
     * Then, given the type of the star, calculate its mass, temperature,
     * radius, and luminosity.
     */
    public Star() {
        Random r = new Random();
        int highRand = 3000001;
        int lowRand = 1;
        int randNum = r.nextInt(highRand - lowRand) + lowRand;
        this.mass = 0;
        if(randNum == 1){
            this.type = StarType.O;
            this.mass = 16.0 + r.nextDouble() * (76.0 - 16.0);
            if(this.mass <= 55.0) {
                this.luminosity = 1.4 * (Math.pow(this.mass, 3.5));
            }else{
                this.luminosity = 32000 * this.mass;
            }
        }else if(1 < randNum && randNum <= 3900){
            this.type = StarType.B;
            this.mass = 2.1 + r.nextDouble() * (16.0 - 2.1);
            this.luminosity = 1.4 * (Math.pow(this.mass, 3.5));
        }else if(3900 < randNum && randNum <= 21900){
            this.type = StarType.A;
            this.mass = 1.4 + r.nextDouble() * (2.1 - 1.4);
            if(this.mass > 2.0){
                this.luminosity = 1.4 * (Math.pow(this.mass, 3.5));
            }else{
               this.luminosity = Math.pow(this.mass, 4.0);
            }
        }else if(21900 < randNum && randNum <= 92190){
            this.type = StarType.F;
            this.mass = 1.04 + r.nextDouble() * (1.4 - 1.04);
            this.luminosity = Math.pow(this.mass, 4.0);
        }else if(92190 < randNum && randNum <= 320190){
            this.type = StarType.G;
            this.mass = 0.8 + r.nextDouble() * (1.04 - 0.8);
            this.luminosity = Math.pow(this.mass, 4.0);
        }else if(320190 < randNum && randNum <= 683190){
            this.type = StarType.K;
            this.mass = 0.45 + r.nextDouble() * (0.8 - 0.45);
            this.luminosity = Math.pow(this.mass, 4.0);
        }else{
            this.type = StarType.M;
            this.mass = 0.08 + r.nextDouble() * (0.45 - 0.08);
            if(this.mass < 0.43){
                this.luminosity = 0.23 * Math.pow(this.mass, 2.3);
            }else{
                this.luminosity = Math.pow(this.mass, 4.0);
            }
        }
        this.temp = (5740 * (Math.pow(this.mass, 0.54))) + 273.15;
        this.radius = ((SUN_TEMP * SUN_TEMP) * Math.sqrt(this.luminosity)) / (this.temp * this.temp);
    }

    /**
     * return the star's type
     * @return StarType
     */
    public StarType getType(){
        return this.type;
    }

    /**
     *
     * @return the star's mass
     */
    public double getMass(){
        return this.mass;
    }

    /**
     *
     * @return the star's luminosity
     */
    public double getLuminosity(){
        return this.luminosity;
    }

    public double getTemperature(){return this.temp;}

    public double getRadius(){return this.radius;}
}
