package com.axis.springbootdemo.entityy;


public class Cricketer {
	private int cricketerId;
	private String name;
	private int runsScored;
	private int balls;
	private int fours;
	private int sixes;
	private double strikeRate;
	
	public Cricketer(int cricketerId, String name, int runsScored, int balls, int fours, int sixes, double strikeRate) {
		super();
		this.cricketerId = cricketerId;
		this.name = name;
		this.runsScored = runsScored;
		this.balls = balls;
		this.fours = fours;
		this.sixes = sixes;
		this.strikeRate = strikeRate;
	}
	public int getCricketerId() {
		return cricketerId;
	}
	public void setCricketerId(int cricketerId) {
		this.cricketerId = cricketerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public double getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	@Override
	public String toString() {
		return "Cricketer [cricketerId=" + cricketerId + ", name=" + name + ", runsScored=" + runsScored + ", balls="
				+ balls + ", fours=" + fours + ", sixes=" + sixes + ", strikeRate=" + strikeRate + "]";
	}
	
	

}
