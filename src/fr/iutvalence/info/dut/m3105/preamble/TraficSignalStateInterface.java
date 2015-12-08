package fr.iutvalence.info.dut.m3105.preamble;

public interface TraficSignalStateInterface {
	public void timesUp(TraficSignalMachineInterface context);
	
	public void buttonPressed(TraficSignalMachineInterface context);
}
