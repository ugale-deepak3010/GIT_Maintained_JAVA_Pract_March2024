package LamdasAndStreams;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Q_zPlanetUtilsTest {

	private List<Q_Planet> planets = Q_SolarSystem.getPlanets();
	private Q_PlanetUtils planetUtils = new Q_PlanetUtils();
	
	
	@Test
	public void testGetPlaneBeginWithM() {
		
		
		
	 	List<Q_Planet> myPlanets = planetUtils.getPlaneWithRings(planets);
		
		/*
		 * for (Q_Planet q_Planet : myPlanets) { System.out.println(q_Planet.getName());
		 * }
		 */
	 	
		//System.out.println(myPlanets);
		
	 	List<Q_Planet> myStrArr = planets.stream().collect(Collectors.toList());
	 			//.forEach(item -> item.getName());
	 	
		
	}
	
	/*
	 * @Test public void testGetPlaneWithRings() {
	 * 
	 * assertEquals(0, 0); }
	 * 
	 * @Test public void testGetPlanetWithMoons() {
	 * 
	 * assertEquals(0, 0); }
	 */
	
}
