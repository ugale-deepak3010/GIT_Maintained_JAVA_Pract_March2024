package LamdasAndStreams;

import java.util.List;
import java.util.stream.Stream;

public class Q_PlanetUtils {

	public List<Q_Planet> getPlaneBeginWithM(List<Q_Planet> planeList) {

		planeList.stream()
		.map(planet->planet.getName().toUpperCase())
		.filter(planetName -> planetName.startsWith("M"));
		
		
		
		return null;
	}

	public List<Q_Planet> getPlaneWithRings(List<Q_Planet> planetList) {
		
		Stream<Q_Planet> returningList = planetList.stream()
		.filter(item->item.isHasRings());
		
		List<Q_Planet> listPlanet = returningList.toList();
		
		return listPlanet;
	}

	public List<Q_Planet> getPlanetWithMoons(List<Q_Planet> planetList) {
		
		return null;
	}

}
