import java.awt.EventQueue;
import java.io.IOException;

public class ActualForexPrices {
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Runnable[] runnables = new Runnable[4];
				Thread[] threads = new Thread[4];

				new Window();
				
				runnables[0] = new UsdPln();
				runnables[1] = new EurUsd();
				runnables[2] = new GbpUsd();
				runnables[3] = new UsdJpy();

				for (int i = 0; i < 4; i++) {
					threads[i] = new Thread(runnables[i]);
					threads[i].start();
				}
			}
		});
	}
}
