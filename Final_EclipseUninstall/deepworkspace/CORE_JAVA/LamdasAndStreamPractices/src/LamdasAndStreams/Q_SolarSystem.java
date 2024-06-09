package LamdasAndStreams;
import java.util.ArrayList;
import java.util.List;

public class Q_SolarSystem {
	
	public static List<Q_Planet> getPlanets(){
		
		
		List<Q_Planet> plantes = new ArrayList<Q_Planet>();
		
		Q_Planet mercury = new Q_Planet("mecury");
		mercury.setDensity(5.43);
		mercury.setHasRings(false);
		mercury.setNumberOfMonns(0);
		
		Q_Planet venus = new Q_Planet("venus");
		venus.setDensity(5.24);
		venus.setHasRings(false);
		venus.setNumberOfMonns(0);
		
		Q_Planet earth = new Q_Planet("earth");
		earth.setDensity(5.52);
		earth.setHasRings(false);
		earth.setNumberOfMonns(1);
		
		Q_Planet saturn = new Q_Planet("saturn");
		saturn.setDensity(5.52);
		saturn.setHasRings(true);
		saturn.setNumberOfMonns(1);
		
		plantes.add(earth);
		plantes.add(mercury);
		plantes.add(venus);
		plantes.add(saturn);
		
		
		
		return plantes;
	}

}
