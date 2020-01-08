package comm.example;

public abstract class Transport {
	private double start;
	private double dest;
	private double eff;
	/**
	 * @return the start
	 */
	public double getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(double start) {
		this.start = start;
	}
	/**
	 * @return the dest
	 */
	public double getDest() {
		return dest;
	}
	/**
	 * @param dest the dest to set
	 */
	public void setDest(double dest) {
		this.dest = dest;
	}
	/**
	 * @return the eff
	 */
	public double getEff() {
		return eff;
	}
	/**
	 * @param eff the eff to set
	 */
	public void setEff(double eff) {
		this.eff = eff;
	}
	@Override
	public String toString() {
		
		return "start:" +getStart()+ "dest:" +getDest()+ "eff:" +getEff();
	}
	public abstract void calculateDistance();
	public abstract void calculateFuelEfficiency();
}

