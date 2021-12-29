package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.composite.DriverComposite;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class Job2dDriverTest {
	private static DriverComposite driver = new DriverComposite(new StubDriver());

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		FiguresJoe.figureScript1(driver.getDriver(0));
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("Driver operateTo action...");
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
		}
	};
}
