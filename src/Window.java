import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JLabel usd_pln, eur_usd, gbp_usd, usd_jpy;
	public Window() {
		super("Actual Forex Prices - Java");
		
		setSize(500, 200);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dimension.width / 2 - 250, dimension.height / 2 - 100);
		setLayout(new GridBagLayout());
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setAlignmentX(CENTER_ALIGNMENT);
		mainPanel.setAlignmentY(CENTER_ALIGNMENT);
		
		usd_pln = new JLabel("1", SwingConstants.CENTER);
		eur_usd = new JLabel("2", SwingConstants.CENTER);
		gbp_usd = new JLabel("3", SwingConstants.CENTER);
		usd_jpy = new JLabel("4", SwingConstants.CENTER);
	
		mainPanel.add(usd_pln);
		mainPanel.add(eur_usd);
		mainPanel.add(gbp_usd);
		mainPanel.add(usd_jpy);
		
		add(mainPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
