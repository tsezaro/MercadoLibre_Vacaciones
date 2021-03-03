import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrincipalV2 extends JFrame implements ActionListener{

	private JMenuBar menubar;
	private JMenu menuOpciones;
	private JMenu menuCalcular;
	private JMenu menuAcercaDe;
	private JMenu menuColorFondo;
	private JMenuItem miCalculo;
	private JMenuItem miAzul;
	private JMenuItem miNegro;
	private JMenuItem miAmarillo;
	private JMenuItem miElCreador;
	private JMenuItem miSalir;
	private JMenuItem miNuevo;
	private JLabel labelLogo;
	private JLabel labelBienvenido;
	private JLabel labelTitle;
	private JLabel labelNombre;
	private JLabel labelApellido;
	private JLabel labelDepartamento;
	private JLabel labelAntiguedad;
	private JLabel labelResultado;
	private JLabel labelFooter;
	private JTextField txtNombreTrabajador;
	private JTextField txtAPellidoTrabajador;
	private JComboBox comboBoxDepartamento;
	private JComboBox comboBoxAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;

	String nombree ="";



	public PrincipalV2(){

		setLayout(null);

		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,255,0));
		setIconImage(new ImageIcon(getClass().getResource("images/logo3.jpg")).getImage());

		BienvenidaV2 variableBienvenidaa = new BienvenidaV2();
		nombree = variableBienvenidaa.texto;

		menubar = new JMenuBar();
		menubar.setBackground(new Color(255,255,0));
		setJMenuBar(menubar);

		menuOpciones = new JMenu ("Opciones");
		menuOpciones.setBackground(new Color(255,255,0));
		menuOpciones.setFont(new Font("Arial", 1, 14));
		menuOpciones.setForeground(new Color(106,90,255));
		menubar.add(menuOpciones);


		menuCalcular = new JMenu ("Calcular");
		menuCalcular.setBackground(new Color(255,255,0));
		menuCalcular.setFont(new Font("Arial", 1, 14));
		menuCalcular.setForeground(new Color(106,90,255));
		menubar.add(menuCalcular);


		menuAcercaDe = new JMenu ("Autor del Programa");
		menuAcercaDe.setBackground(new Color(255,255,0));
		menuAcercaDe.setFont(new Font("Arial", 1, 14));
		menuAcercaDe.setForeground(new Color(106,90,255));
		menubar.add(menuAcercaDe);




		menuColorFondo = new JMenu ("Color de fondo");
		menuColorFondo.setFont(new Font("Arial", 1, 14));
		menuColorFondo.setForeground(new Color(106,90,255));
		menuOpciones.add(menuColorFondo);


		

		miAzul = new JMenuItem("Azul");
		miAzul.setFont(new Font("Arial", 1, 14));
		miAzul.setForeground(new Color(106,90,255));
		menuColorFondo.add(miAzul);
		miAzul.addActionListener(this);


		miAmarillo = new JMenuItem("Amarillo");
		miAmarillo.setFont(new Font("Arial", 1, 14));
		miAmarillo.setForeground(new Color(106,90,255));
		menuColorFondo.add(miAmarillo);
		miAmarillo.addActionListener(this);


		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font("Arial", 1, 14));
		miNegro.setForeground(new Color(106,90,255));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);




		miNuevo = new JMenuItem("Resetear");
		miNuevo.setFont(new Font("Arial", 1, 14));
		miNuevo.setForeground(new Color(106,90,255));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);


		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Arial", 1, 14));
		miSalir.setForeground(new Color(106,90,255));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);




		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Arial", 1, 14));
		miCalculo.setForeground(new Color(106,90,255));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);


		miElCreador = new JMenuItem("Tomas Sezaro");
		miElCreador.setFont(new Font("Arial", 1, 14));
		miElCreador.setForeground(new Color(106,90,255));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);






		ImageIcon imagen = new ImageIcon("images/logo9.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,15,250,100);
		add(labelLogo);


		labelBienvenido = new JLabel ("Bienvenido " + nombree );
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Arial", 1, 32));
		labelBienvenido.setForeground(new Color(106,90,255));
		add(labelBienvenido);


		labelTitle = new JLabel ("Datos del trabajador para el calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Arial", 0, 24));
		labelTitle.setForeground(new Color(106,90,255));
		add(labelTitle);


		labelNombre = new JLabel ("Nombre completo");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Arial", 1, 12));
		labelNombre.setForeground(new Color(106,90,255));
		add(labelNombre);


		labelApellido = new JLabel ("Apellidos");
		labelApellido.setBounds(25,248,180,25);
		labelApellido.setFont(new Font("Arial", 1, 12));
		labelApellido.setForeground(new Color(106,90,255));
		add(labelApellido);


		labelDepartamento = new JLabel ("Selecciona el Sector");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Arial", 1, 12));
		labelDepartamento.setForeground(new Color(106,90,255));
		add(labelDepartamento);


		labelAntiguedad = new JLabel ("Selecciona la Antiguedad");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Arial", 1, 12));
		labelAntiguedad.setForeground(new Color(106,90,255));
		add(labelAntiguedad);


		labelResultado = new JLabel ("Resultado del Calculo: ");
		labelResultado.setBounds(25,308,180,25);
		labelResultado.setFont(new Font("Arial", 1, 12));
		labelResultado.setForeground(new Color(106,90,255));
		add(labelResultado);


		labelFooter = new JLabel ("Copyright © 1999-2021 MercadoLibre S.R.L. | Todos los derechos reservados");
		labelFooter.setBounds(94,445,500,30);
		labelFooter.setFont(new Font("Arial", 1, 12));
		labelFooter.setForeground(new Color(106,90,255));
		add(labelFooter);




		txtNombreTrabajador = new JTextField();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setBackground(new Color(224,224,224));
		txtNombreTrabajador.setFont(new Font("Arial", 1, 14));
		txtNombreTrabajador.setForeground(new Color(106,90,255));
		add(txtNombreTrabajador);


		txtAPellidoTrabajador = new JTextField();
		txtAPellidoTrabajador.setBounds(25,273,150,25);
		txtAPellidoTrabajador.setBackground(new Color(224,224,224));
		txtAPellidoTrabajador.setFont(new Font("Arial", 1, 14));
		txtAPellidoTrabajador.setForeground(new Color(106,90,255));
		add(txtAPellidoTrabajador);






		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,224));
		textarea1.setFont(new Font("Arial", 1, 11));
		textarea1.setForeground(new Color(106,90,255));
		textarea1.setText("\n                        Aca aparece el resultado del calculo de las vacaciones");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(25,334,575,90);
		add(scrollpane1);





		comboBoxDepartamento = new JComboBox();
		comboBoxDepartamento.setBounds(220,213,315,25);
		comboBoxDepartamento.setBackground(new Color(224,224,224));
		comboBoxDepartamento.setFont(new Font("Arial", 1, 14));
		comboBoxDepartamento.setForeground(new Color(106,90,255));
		add(comboBoxDepartamento);
		comboBoxDepartamento.addItem("");
		comboBoxDepartamento.addItem("Atencion al Cliente");
		comboBoxDepartamento.addItem("Programadores de Software");
		comboBoxDepartamento.addItem("Departamento de Recursos Humanos");
		comboBoxDepartamento.addItem("Departamento de Marketing");
		comboBoxDepartamento.addItem("Departamento de Control de Gestion");
		comboBoxDepartamento.addItem("Departamento de Logistica");
		comboBoxDepartamento.addItem("Comite de Direccion");


		comboBoxAntiguedad = new JComboBox();
		comboBoxAntiguedad.setBounds(220,273,315,25);
		comboBoxAntiguedad.setBackground(new Color(224,224,224));
		comboBoxAntiguedad.setFont(new Font("Arial", 1, 14));
		comboBoxAntiguedad.setForeground(new Color(106,90,255));
		add(comboBoxAntiguedad);
		comboBoxAntiguedad.addItem("");
		comboBoxAntiguedad.addItem("Menor a 5 periodos anuales de servicio  ");
		comboBoxAntiguedad.addItem("Entre 5 a 10 periodos anuales de servicio  ");
		comboBoxAntiguedad.addItem("Entre 10 a 20 periodos anuales de servicio  ");
		comboBoxAntiguedad.addItem("Mayor a 20 periodos anuales de servicio  ");

	
	}



	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == miCalculo){

			String nombreTrabajador = txtNombreTrabajador.getText();
			String apellidoTrabajador = txtAPellidoTrabajador.getText();
			String departamento = comboBoxDepartamento.getSelectedItem().toString();
			String antiguedad = comboBoxAntiguedad.getSelectedItem().toString();

			if(nombreTrabajador.equals("") || apellidoTrabajador.equals("") || departamento.equals("") || antiguedad.equals("")){

				JOptionPane.showMessageDialog(null,"Debe llenar todos los campos.");

			}
			else{



				if(departamento.equals("Atencion al Cliente")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 7 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 14 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 25 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 36 dias de Vacaciones con goce de sueldo.");
					}

				
				}





				if(departamento.equals("Programadores de Software")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 10 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 20 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 28 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 38 dias de Vacaciones con goce de sueldo.");
					}

				
				}





				if(departamento.equals("Departamento de Recursos Humanos")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 10 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 20 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 30 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 40 dias de Vacaciones con goce de sueldo.");
					}

				
				}




				if(departamento.equals("Departamento de Marketing")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 8 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 16 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 24 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 35 dias de Vacaciones con goce de sueldo.");
					}

				
				}




				if(departamento.equals("Departamento de Control de Gestion")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 9 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 18 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 27 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 37 dias de Vacaciones con goce de sueldo.");
					}

				
				}




				if(departamento.equals("Departamento de Logistica")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 7 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 14 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 24 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 35 dias de Vacaciones con goce de sueldo.");
					}

				
				}




				if(departamento.equals("Comite de Direccion")){
					
					if(antiguedad.equals("Menor a 5 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 12 dias de Vacaciones con goce de sueldo.");
					}
				
				
				
					if(antiguedad.equals("Entre 5 a 10 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 24 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Entre 10 a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 36 dias de Vacaciones con goce de sueldo.");
					}
				


				
					if(antiguedad.equals("Mayor a 20 periodos anuales de servicio  ")){
						textarea1.setText("\n               El trabajador " + nombreTrabajador + " " + apellidoTrabajador + 
										  "\n               perteneciente al sector " + departamento + " con una antiguedad equivalente a " + antiguedad +
										  "\n               le corresponde 50 dias de Vacaciones con goce de sueldo.");
					}

				}

			}

		}


		if(e.getSource() == miAzul){
			
			getContentPane().setBackground(new Color(0,0,250));

		}

		if(e.getSource() == miAmarillo){
			
			getContentPane().setBackground(new Color(255,255,0));

		}

		if(e.getSource() == miNegro){
			
			getContentPane().setBackground(new Color(0,0,0));

		}

		if(e.getSource() == miNuevo){

			txtNombreTrabajador.setText("");
			txtAPellidoTrabajador.setText("");
			comboBoxDepartamento.setSelectedIndex(0);
			comboBoxAntiguedad.setSelectedIndex(0);
			textarea1.setText("\n                           Aca aparece el resultado del calculo de las vacaciones ");
			
		}

		if(e.getSource() == miSalir){
			
			BienvenidaV2 ventanabievenidaV2 = new BienvenidaV2();
			ventanabievenidaV2.setBounds(0,0,370,450);
			ventanabievenidaV2.setVisible(true);
			ventanabievenidaV2.setResizable(false);
			ventanabievenidaV2.setLocationRelativeTo(null);
			this.setVisible(false);

		}

		if(e.getSource() == miElCreador){
			
			JOptionPane.showMessageDialog(null, "Soy Tomas Sezaro, un programador Argentino. \n");

		}


	}



	public static void main(String args[]){

		PrincipalV2 ventanaPrincipalV2 = new PrincipalV2();
		ventanaPrincipalV2.setBounds(0,0,640,535);
		ventanaPrincipalV2.setVisible(true);
		ventanaPrincipalV2.setResizable(false);
		ventanaPrincipalV2.setLocationRelativeTo(null);

	}


}