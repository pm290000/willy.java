package com.ict.edu7;

public class Terran extends Unit {
	String name;
	int energy;
	boolean fly;
	
	public Terran() {}
	
	
	
	public Terran(String name, int energy, boolean fly) {
		
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}



	@Override
	public void deEnergy() {
		energy = energy - 5;
	}
	
	
}
