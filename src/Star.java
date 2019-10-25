/**
 * Author: Will Lewis | wlewis16
 * File: Star.java
 * This class will handle the creation of all stars
 */


import java.util.Random;

public class Star {

    enum StarType {O, B, A, F, G, K, M};

    private StarType type;
    private int temp;
    private double mass;
    private double radius;
    private double luminosity;

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
        if(randNum == 1){
            this.type = StarType.O;
            this.mass = r.nextInt(76 - 16) + 16;
            if(this.mass <= 55) {
                this.luminosity = 1.4 * (Math.pow(this.mass, 3.5));
            }else{
                this.luminosity = 32000 * this.mass;
            }
        }else if(1 < randNum && randNum <= 3900){
            this.type = StarType.B;
        }else if(3900 < randNum && randNum <= 21900){
            this.type = StarType.A;
        }else if(21900 < randNum && randNum <= 92190){
            this.type = StarType.F;
        }else if(92190 < randNum && randNum <= 320190){
            this.type = StarType.G;
        }else if(320190 < randNum && randNum <= 683190){
            this.type = StarType.K;
        }else{
            this.type = StarType.M;
        }
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
}
