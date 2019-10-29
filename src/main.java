/**
 * Author: Will Lewis | wlewis16
 * File: main.java
 */

public class main {

    public static void main(String[] args) {
        System.out.println("Generating stars...\n");
        Star star;
        int numberO = 0;
        int numberB = 0;
        int numberA = 0;
        int numberF = 0;
        int numberG = 0;
        int numberK = 0;
        int numberM = 0;

        boolean printedO = false;
        boolean printedB = false;
        boolean printedA = false;
        boolean printedF = false;
        boolean printedG = false;
        boolean printedK = false;
        boolean printedM = false;

        for(int i = 0; i < 3000000; i++){
            star = new Star();
            if(star.getType() == Star.StarType.O){
                numberO++;
                if(!printedO) {
                    System.out.println("O TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedO = true;
                }
            }else if(star.getType() == Star.StarType.B){
                numberB++;
                if(!printedB) {
                    System.out.println("B TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedB = true;
                }
            }else if(star.getType() == Star.StarType.A){
                numberA++;
                if(!printedA) {
                    System.out.println("A TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedA = true;
                }
            }else if(star.getType() == Star.StarType.F){
                numberF++;
                if(!printedF) {
                    System.out.println("F TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedF = true;
                }
            }else if(star.getType() == Star.StarType.G){
                numberG++;
                if(!printedG) {
                    System.out.println("G TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedG = true;
                }
            }else if(star.getType() == Star.StarType.K){
                numberK++;
                if(!printedK) {
                    System.out.println("K TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedK = true;
                }
            }else if(star.getType() == Star.StarType.M){
                numberM++;
                if(!printedM) {
                    System.out.println("M TYPE: ");
                    System.out.println("Mass (solar masses): " + star.getMass());
                    System.out.println("Luminosity (solar luminosities): " + star.getLuminosity());
                    System.out.println("Temperature (kelvin): " + star.getTemperature());
                    System.out.println("Radius (solar radii): " + star.getRadius());
                    System.out.println();
                    printedM = true;
                }
            }
        }
        System.out.println("Number of O type stars: " + numberO);
        System.out.println("Number of B type stars: " + numberB);
        System.out.println("Number of A type stars: " + numberA);
        System.out.println("Number of F type stars: " + numberF);
        System.out.println("Number of G type stars: " + numberG);
        System.out.println("Number of K type stars: " + numberK);
        System.out.println("Number of M type stars: " + numberM);

        double totalStars = numberO +  numberB + numberA + numberF + numberG + numberK + numberM;
        System.out.println("Total Stars: " + totalStars);

        double percO = (numberO / totalStars) * 100;
        double percB = (numberB / totalStars) * 100;
        double percA = (numberA / totalStars) * 100;
        double percF = (numberF / totalStars) * 100;
        double percG = (numberG / totalStars) * 100;
        double percK = (numberK / totalStars) * 100;
        double percM = (numberM / totalStars) * 100;
        System.out.println("Percentage of O type stars: " + percO);
        System.out.println("Percentage of B type stars: " + percB);
        System.out.println("Percentage of A type stars: " + percA);
        System.out.println("Percentage of F type stars: " + percF);
        System.out.println("Percentage of G type stars: " + percG);
        System.out.println("Percentage of K type stars: " + percK);
        System.out.println("Percentage of M type stars: " + percM);
    }

}
