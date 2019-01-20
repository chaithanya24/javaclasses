package com.javapros.classfive;

class Ship {
	private static String name = "JAVA-SAMPLE-ROYAL-SHIPS";
	private String captain;
	private int madeInYear;
	private int numberPassengers;
	
	
	public Ship() {
	}

	public Ship(String captain, int madeInYear, int numberPassengers) {
		super();
		this.captain = captain;
		this.madeInYear = madeInYear;
		this.numberPassengers = numberPassengers;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Ship.name = name;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public int getMadeInYear() {
		return madeInYear;
	}

	public void setMadeInYear(int madeInYear) {
		this.madeInYear = madeInYear;
	}

	public int getNumberPassengers() {
		return numberPassengers;
	}

	public void setNumberPassengers(int numberPassengers) {
		this.numberPassengers = numberPassengers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((captain == null) ? 0 : captain.hashCode());
		result = prime * result + madeInYear;
		result = prime * result + numberPassengers;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ship other = (Ship) obj;
		if (captain == null) {
			if (other.captain != null)
				return false;
		} else if (!captain.equals(other.captain))
			return false;
		if (madeInYear != other.madeInYear)
			return false;
		if (numberPassengers != other.numberPassengers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Ship {captain=%s, madeInYear=%s, numberPassengers=%s}", captain, madeInYear,
				numberPassengers);
	}
	
}

class ToStringTest {

	public static void main(String[] args) {
		
		Ship noneShip = new Ship();
		Ship royalShip = new Ship("Mike", 1990, 300);
		Ship carrabianShip = new Ship("Gearge", 2000, 900);
		
		//royalShip.printDetails();
		//carrabianShip.printDetails();
		
		System.out.println(royalShip.toString());
		System.out.println(noneShip.toString());
		
	}

}
