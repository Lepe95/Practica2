import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ejemplo extends JFrame {
	
	private JLabel texto;
	private JLabel torre1;
	private JLabel torre2;
	private JLabel torre3;
	private JLabel Disco1;
	private JLabel Disco2;
	private JLabel Disco3;
	private JLabel Disco4;
	private JLabel Disco5;

	
	public ejemplo(){
		super();
		configuracion();
		inciarComponentes();
	}
	
	private void configuracion(){
		this.setTitle("Ejemplo");
		this.setSize(550,500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void inciarComponentes(){
		
		texto = new JLabel();
		texto.setText("Ejemplo");
		texto.setBounds(20, 10, 135, 20);
		
		this.add(texto);
		
		
	}
	
	public static void main(String[]args){
		
		ejemplo eje = new ejemplo();
		eje.setVisible(true);
		
	}
	
	

}
