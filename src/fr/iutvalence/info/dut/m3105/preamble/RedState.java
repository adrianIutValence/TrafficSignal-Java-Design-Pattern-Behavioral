package fr.iutvalence.info.dut.m3105.preamble;

public class RedState implements TraficSignalStateInterface {

	private static final int DEFAULT_TIME = 10;

	public RedState(TraficSignalMachineInterface context) {
		context.setTime(DEFAULT_TIME);
	}

	@Override
	public void timesUp(TraficSignalMachineInterface context) {
		context.setState(new GreenState(context));
	}

	@Override
	public void buttonPressed(TraficSignalMachineInterface context) {

	}

}
