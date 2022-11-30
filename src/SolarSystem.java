import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
public class SolarSystem {
    private Sun daddysun;
    private ArrayList<Planet> planets;

    public SolarSystem(){
    planets = new ArrayList<>();
    }

    public void addPlanet(Planet p){
        planets.add(p);

    }
    public void showPlanets(){
        for (Planet p: this.planets){
            System.out.println(p);
        }

    }

    public void addSun(Sun sun){
        this.daddysun = sun;


    }
    public void movePlanets(){
        double G = 0.1;
        double dt = 0.001;
        for (Planet p: this.planets){
            System.out.println(p.toString());
            p.moveTo(p.getPosX()+ dt * p.getVelX(),
                    p.getPosY() + dt * p.getVelY());
            double rx= this.daddysun.getPosX() - p.getPosX();
            double ry = this.daddysun.getPosY()- p.getPosY();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.daddysun.getMass() * rx / Math.pow(r,3);
            double accY = G * this.daddysun.getMass() * ry / Math.pow(r,3);

            p.setVelX(p.getVelX()+ dt * accX);
            p.setVelY(p.getVelX()+ dt * accY);
        }

    }


}