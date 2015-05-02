import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class torreCinco extends JFrame {
	
	private JLabel texto;
	private JLabel torre1;
	private JLabel torre2;
	private JLabel torre3;
	private JLabel Disco1;
	private JLabel Disco2;
	private JLabel Disco3;
	private JLabel Disco4;
	private JLabel Disco5;

	
	public torreCinco(){
		super();
		configuracion();
		inciarComponentes();
	}
	
	private void configuracion(){
		this.setTitle("Cinco Discos");
		this.setSize(550,500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void inciarComponentes(){
		
		texto = new JLabel();
		texto.setText("Resuelva con 5 discos");
		texto.setBounds(20, 10, 135, 20);
		
		this.add(texto);
		
		
	}
	
	public static void main(String[]args){
		
		torreCinco t5 = new torreCinco();
		t5.setVisible(true);
		
	}
	
	

}
