package LamdasAndStreams;

public class Q_Planet {

	private String name;
	private double density;
	private boolean hasRings;
	private int numberOfMonns;
	
	
	
	
	public Q_Planet(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}
	
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}
	public boolean isHasRings() {
		return hasRings;
	}
	public void setHasRings(boolean hasRings) {
		this.hasRings = hasRings;
	}
	public int getNumberOfMonns() {
		return numberOfMonns;
	}
	public void setNumberOfMonns(int numberOfMonns) {
		this.numberOfMonns = numberOfMonns;
	}
	
	

}
