package fr.iutvalence.info.dut.m3105.preamble;

public class TraficMachine extends Thread implements TraficSignalMachineInterface {

	private TraficSignalStateInterface state;
	private int remainingTime;
	
	public TraficMachine(){
		super();
		setState(new GreenState(this));
	}

	@Override
	public void setState(TraficSignalStateInterface state) {
		this.state = state;
	}

	@Override
	public int getTime() {
		return this.remainingTime;
	}

	@Override
	public void setTime(int time) {
		this.remainingTime = time;
	}

	@Override
	public void pressButton() {
		this.state.buttonPressed(this);
	}
	
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.decrementTime();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}
	
	@Override
	public void decrementTime() {
		this.remainingTime -= 1;
		
	}

}
