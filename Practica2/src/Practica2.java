import javax.swing.*;

import java.awt.event.*;

public class Practica2 extends JFrame implements ActionListener{
    
	private JButton boton3,boton4,boton5,boton6,boton7,boton8, ejemplo;
    public Practica2() {
    	setLayout(null);
    	setLocationRelativeTo(null);
        setTitle("Torres de Hanói");
        JTextArea instrucciones = new JTextArea();
        instrucciones.setText("Bienvenido al juego");
        instrucciones.setBounds(10,50,90,30);
        boton3=new JButton("3 discos");
        boton3.setBounds(10,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        boton4=new JButton("4 discos");
        boton4.setBounds(110,100,90,30);
        add(boton4);
        boton4.addActionListener(this);
        boton5=new JButton("5 discos");
        boton5.setBounds(210,100,90,30);
        add(boton5);
        boton5.addActionListener(this);
        boton6=new JButton("6 discos");
        boton6.setBounds(10,140,90,30);
        add(boton6);
        boton6.addActionListener(this);  
        boton7=new JButton("7 discos");
        boton7.setBounds(110,140,90,30);
        add(boton7);
        boton7.addActionListener(this);  
        boton8=new JButton("8 discos");
        boton8.setBounds(210,140,90,30);
        add(boton8);
        boton8.addActionListener(this);
        ejemplo=new JButton("Ejemplo");
        ejemplo.setBounds(10,100,90,30);
        add(ejemplo);
        ejemplo.addActionListener(this);
    }
    
    /*public void torreTres(){
		setTitle("Tres discos");
	}
    
    public void torreCuatro(){
		setTitle("Cuatro discos");
	}
    
    public void torreCinco(){
		setTitle("Cinco discos");
	}
    
    public void torreSeis(){
		setTitle("Seis discos");
	}
    
    public void torreSiete(){
		setTitle("Siete discos");
	}
    
    public void torreOcho(){
		setTitle("Ocho discos");
	}
    
    public void ejemplo(){
		setTitle("Ejemplo");
	}*/
	
	
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton3) {
        	torreTres t3 = new torreTres();
        	dispose();
        }
        if (e.getSource()==boton4) {
        	torreCuatro t4 = new torreCuatro();
        	dispose();
        }
        if (e.getSource()==boton5) {
        	torreCinco t5 = new torreCinco();
        	dispose();
        }  
        if (e.getSource()==boton6) {
        	torreSeis t6 = new torreSeis();
        	dispose();
        } 
        if (e.getSource()==boton7) {
        	torreSiete t7 = new torreSiete();
        	dispose();
        } 
        if (e.getSource()==boton8) {
        	torreOcho t8 = new torreOcho();
        	dispose();
        } 
        if (e.getSource()==ejemplo) {
        	ejemplo eje = new ejemplo();
        	dispose();
        } 
    }
    	
    	
    public static void main(String[] args){
    	
    	/*torreTres t3 = new torreTres();
		t3.setVisible(true);
		
		torreCuatro t4 = new torreCuatro();
		t4.setVisible(true);
		
		torreCinco t5 = new torreCinco();
		t5.setVisible(true);
		
		torreSeis t6 = new torreSeis();
		t6.setVisible(true);
		
		torreSiete t7 = new torreSiete();
		t7.setVisible(true);
		
		torreOcho t8 = new torreOcho();
		t8.setVisible(true);
		
		ejemplo eje = new ejemplo();
		eje.setVisible(true);
		*/
		
		Practica2 juego=new Practica2();
        juego.setBounds(0,0,330,220);
        juego.setVisible(true);
        juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}