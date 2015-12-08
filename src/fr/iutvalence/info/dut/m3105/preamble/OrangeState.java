package fr.iutvalence.info.dut.m3105.preamble;

public class OrangeState implements TraficSignalStateInterface {

	private static final int DEFAULT_TIME = 2;

	public OrangeState(TraficSignalMachineInterface context) {
		context.setTime(DEFAULT_TIME);
	}

	@Override
	public void timesUp(TraficSignalMachineInterface context) {
		context.setState(new RedState(context));
	}

	@Override
	public void buttonPressed(TraficSignalMachineInterface context) {
		
	}

}