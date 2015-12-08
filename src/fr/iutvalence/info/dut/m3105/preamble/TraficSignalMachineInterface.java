package fr.iutvalence.info.dut.m3105.preamble;

public interface TraficSignalMachineInterface {
	
	public void start();
	
	public void setState(TraficSignalStateInterface state);

	public int getTime();

	public void setTime(int time);
	
	public void pressButton();
	
	public void decrementTime();
	
}
