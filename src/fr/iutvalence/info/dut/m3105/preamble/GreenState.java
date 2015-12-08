package fr.iutvalence.info.dut.m3105.preamble;

public class GreenState implements TraficSignalStateInterface {

	private static final int DEFAULT_TIME = 10;

	public GreenState(TraficSignalMachineInterface context) {
		context.setTime(DEFAULT_TIME);
	}
	
	@Override
	public void timesUp(TraficSignalMachineInterface context) {
		context.setState(new OrangeState(context));
	}

	@Override
	public void buttonPressed(TraficSignalMachineInterface context) {
		if(context.getTime() > 2){
			context.setTime(2);
		}
	}

}
