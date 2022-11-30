public class Simulator {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        ss.addSun(new Sun(null, 10, 5000, "sun", 0, 0));
        Planet p = new Planet(1000, 19.5, 0, 0, 0, 0, "MERCURY");
        p=new Planet(5000, 47.5, 5,6,0,2, "Earth");
    ss.addPlanet(p);
    ss.showPlanets();

    int timePeriod = 100;
    for(int i=0; i<timePeriod; i++){
        ss.movePlanets();
        ss.showPlanets();

        }
    }
}
//daddysun ran