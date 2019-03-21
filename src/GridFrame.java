import javax.swing.JPanel;

public class GridFrame

{
		public GridFrame()
		{
			setBounds(200, 200, 800, 600);
			GridPanel myPanel = new GridPanel();
			add(myPanel);
			
			setDefaultCloseOperation(this.EXIT_ON_CLOSE);
			setVisible(true);
			
		}
		public static void main(String[] args)
		{
			new GridFrame();
			
		}
}
