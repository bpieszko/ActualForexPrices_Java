import java.io.IOException;

import javax.swing.JLabel;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Prices implements Runnable {
	private String address = "";
	private JLabel pair = null;
	
	Prices(String address, JLabel pair) {
		this.address = address;
		this.pair = pair;
	}
	
	@Override
	public void run() {
		Document document = null;
		while (true) {
			try {
				document = (Document) Jsoup.connect(address).userAgent("Mozilla").get();
			} catch(IOException e) {
				System.err.println("Error: connect.get()");
			}
			if (document != null && pair != null) {
				Elements elements = document.select("span#last_last");
				org.jsoup.nodes.Element val = elements.first();
				
				pair.setText(val.text());
			}
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				e.printStackTrace();
				System.err.println("Error: Thread sleep");
			}
				
		}
	}
}
