public class main {

    public static void main(String[] args) {
        System.out.println("Generating stars...");
        Star star;
        int numberO = 0;
        int numberB = 0;
        int numberA = 0;
        int numberF = 0;
        int numberG = 0;
        int numberK = 0;
        int numberM = 0;
        for(int i = 0; i < 3000000; i++){
            star = new Star();
            if(star.getType() == Star.StarType.O){
                numberO++;
                System.out.println("Mass: " + star.getMass());
                System.out.println("Luminosity: " + star.getLuminosity());
            }else if(star.getType() == Star.StarType.B){
                numberB++;
            }else if(star.getType() == Star.StarType.A){
                numberA++;
            }else if(star.getType() == Star.StarType.F){
                numberF++;
            }else if(star.getType() == Star.StarType.G){
                numberG++;
            }else if(star.getType() == Star.StarType.K){
                numberK++;
            }else if(star.getType() == Star.StarType.M){
                numberM++;
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
