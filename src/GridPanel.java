import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class GridPanel extends JPanel
{

	
	public GridPanel()
	{
		
			setLayout(new GridBagLayout());
			
			GridBagConstraints gbc = new GridBagConstraints();
			
			JLabel myLabel = new JLabel("This is cool");
			gbc.gridx = 0;
			gbc.gridy = 0;
			add(myLabel,gbc);
			
	}
}