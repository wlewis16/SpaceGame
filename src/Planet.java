import java.util.Random;

public class Planet {
    enum PlanetType{ROCKY, GASSY, ICY, DWARF}

    private double mass;    // Earth masses, for simplicity
    private double radius;  // In km
    private double eccentricity;
    private double period;
    private double semiMajorAxis;
    private PlanetType type;
    private Star parentStar;

    public Planet(Star parentStar){
        this.parentStar = parentStar;
        Random r = new Random();
        int maxRand = 101;
        int lowRand = 1;
        int randNum = r.nextInt(maxRand - lowRand) + lowRand;
        if(randNum <= 25){
            this.type = PlanetType.ROCKY;
        }else if(randNum > 25 && randNum <= 75){
            this.type = PlanetType.GASSY;
            double jupiterMasses = 1 + r.nextDouble() * (15.0 - 1.0);
            this.mass = 317.8 * jupiterMasses;
            double jupiterRadii = 0.7 + r.nextDouble() * (4.0 - 0.7);
            this.radius = jupiterRadii * 69911.0;
            //double semiMajorAxis = 0.01 + r.nextDouble() * ()
        }else if(randNum > 75 && randNum <= 90){
            this.type = PlanetType.ICY;
        }else{
            this.type = PlanetType.DWARF;
        }
    }
}
