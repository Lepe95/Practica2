import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class torreTres extends JFrame {
	
	private JLabel texto;
	private JLabel torre1;
	private JLabel torre2;
	private JLabel torre3;
	private JLabel Disco1;
	private JLabel Disco2;
	private JLabel Disco3;

	
	
	public torreTres(){
		super();
		configuracion();
		inciarComponentes();
	}
	
	private void configuracion(){
		this.setTitle("Tres Discos");
		this.setSize(550,500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void inciarComponentes(){
		
		texto = new JLabel();
		texto.setText("Resuelva con 3 discos");
		texto.setBounds(20, 10, 135, 20);
		
		torre1 = new JLabel();
		
		torre1.setBounds(30,50,100,100);
		
		this.add(texto);
		
		
	}
	
	public static void main(String[]args){
		
		torreTres t3 = new torreTres();
		t3.setVisible(true);
		
	}
	
	

}
