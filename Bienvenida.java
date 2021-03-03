import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{

	private JTextField textfield1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JButton boton1;



	public Bienvenida(){

		setLayout(null);

		setTitle("Bienvenido a Mercado Libre.");
		getContentPane().setBackground(new Color(255,255,0));
		setIconImage(new ImageIcon(getClass().getResource("images/logo3.jpg")).getImage());


		ImageIcon imagen = new ImageIcon("images/logo8.jpg");

		label1 = new JLabel(imagen);
		label1.setBounds(25,15,300,100);
		add(label1);


		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Arial", 3, 20));
		label2.setForeground(new Color(106,90,255));
		add(label2);

		
		label3 = new JLabel("Ingrese su nombre");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Arial", 1, 13));
		label3.setForeground(new Color(106,90,255));
		add(label3);


		label4 = new JLabel("Copyright © 1999-2021 MercadoLibre S.R.L.");
		label4.setBounds(30,355,380,30);
		label4.setFont(new Font("Arial", 1, 10));
		label4.setForeground(new Color(106,90,255));
		add(label4);


		label5 = new JLabel("Av. Caseros 3039, Piso 2, CP 1264, Parque Patricios, CABA");
		label5.setBounds(20,375,400,30);
		label5.setFont(new Font("Arial", 1, 10));
		label5.setForeground(new Color(106,90,255));
		add(label5);


		textfield1 = new JTextField();
		textfield1.setBounds(45,240,255,25);
		textfield1.setBackground(new Color(224,224,224));
		textfield1.setFont(new Font("Arial", 1, 12));
		textfield1.setForeground(new Color(0,0,0));
		add(textfield1);


		boton1 = new JButton("Aceptar");
		boton1.setBounds(125,280,100,30);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Arial", 1, 15));
		boton1.setForeground(new Color(104,80,255));
		boton1.addActionListener(this);
		add(boton1);


	}

	public void actionPerformed(ActionEvent e){


	}




	public static void main(String args[]){

		Bienvenida ventanabievenida = new Bienvenida();
		ventanabievenida.setBounds(0,0,370,450);
		ventanabievenida.setVisible(true);
		ventanabievenida.setResizable(false);
		ventanabievenida.setLocationRelativeTo(null);

	}





}