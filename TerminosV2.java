import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TerminosV2 extends JFrame implements ActionListener, ChangeListener{

	private JLabel label1;
	private JLabel label2;
	private JTextArea textarea1;
	private JScrollPane scrollpane1;
	private JCheckBox checkbox1;
	private JButton boton1;
	private JButton boton2;

	String nombre = "";



	public TerminosV2(){

		setLayout(null);

		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/logo3.jpg")).getImage());
		BienvenidaV2 variableBienvenida = new BienvenidaV2();
		nombre = variableBienvenida.texto;

		label1 = new JLabel ("TERMINOS Y CONDICIONES");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Arial", 1, 14));
		label1.setForeground(new Color(0,0,0));
		add(label1);


		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font ("Arial", 0, 9));
		textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE TOMAS SEZARO." +
                    "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                    "\n            C.  TOMAS SEZARO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE TOMAS SEZARO, NO SE RESPONSABILIZAN DEL USO QUE USTED  " +
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +                    
                    "\n          ESTE PROGRAMA PERTENECE A TOMAS SEZARO Y SU ACCESESO Y UTILIZACION ESTA SUJETA ADEMAS A" +
                    "\n          LOS SIGUIENTES CUMPLIMIENTOS DE TERMINOS COMPLEMENTARIOS QUE SE EXPONEN A CONTINUACION." +
                    "\n\n          1. RESPONSABILIDAD" +
                    "\n          Tomas Sezaro se reserva el derecho de modificar en forma unilateral, sin mediar previo aviso," +
                    "\n          ni comunicacion al USUARIO y/o VISITANTE, estos Terminos y Condiciones, el diseño, la presentación o su configuracion, los servicios ofrecidos, los requisitos de registro" + 
                    "\n          o de utilizacion del software, sin que ello genere derecho a reclamo o indemnización alguna" +
                    "\n          en favor del USUARIO y/o VISITANTE."+
                    "\n\n          2. SITIOS ENLAZADOS" +
                    "\n          A través de la presente pagina se pone a su disposicion dispositivos tecnicos de enlace," +
                    "\n          directorios y herramientas de busqueda que les permiten acceder a paginas web pertenecientes a terceros" +
                    "\n\n          3. POLITICA DE PRIVACIDAD" +
                    "\n          La utilizacion e ingreso al presente software de Tomás Sezaro, sera considerado como aceptacion" +
                    "\n          de los terminos de esta Politica de Privacidad por parte del USUARIO y/o VISITANTE" +
                    "\n\n          4. TERMINACION DEL ACCESO" +
                    "\n          Tomas Sezarp podra, en cualquier momento, terminar o suspender el acceso que el USUARIO y/o VISITANTE" +
                    "\n          tenga a todo o parte de este sitio, sin aviso previo, y sin que ello genere derecho a" +
                    "\n          reclamo o indemnizacion alguna." +
                    "\n\n          5. VIOLACIONES DEL SISTEMA O BASES DE DATOS" +
                    "\n          Es ilicita cualquier accion o uso de dispositivos, software, u otros instrumentos tendientes" +
                    "\n          a interferir tanto en las actividades y operatoria de Tomas Sezaro, asi como en las ofertas," +
                    "\n          descripciones, cuentas o bases de datos de Tomas Sezaro." +
                    "\n\n          6. JURISDICCION" +
                    "\n          Estos Terminos y Condiciones se regiran e interpretaran de acuerdo con las leyes de" +
                    "\n          la Republica Argentina. ");

		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);


		checkbox1 = new JCheckBox("Yo " + nombre + " Acepto");
		checkbox1.setBounds(10,250,300,30);
		checkbox1.addChangeListener(this);
		add(checkbox1);


		boton1 = new JButton ("Continuar");
		boton1.setBounds(10,350,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);


		boton2 = new JButton ("No Acepto");
		boton2.setBounds(120,350,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);


		ImageIcon imagen = new ImageIcon("images/logo4.png");
		label2 = new JLabel(imagen);
		label2.setBounds(315,185,300,300);
		add(label2);

	}


	public void stateChanged(ChangeEvent e){

		if(checkbox1.isSelected() == true){

			boton1.setEnabled(true);
			boton2.setEnabled(false);

		}
		else{

			boton1.setEnabled(false);
			boton2.setEnabled(true);

		}

	}




	public void actionPerformed(ActionEvent e){

		if(e.getSource() == boton1){

			PrincipalV2 ventanaPrincipalV2 = new PrincipalV2();
			ventanaPrincipalV2.setBounds(0,0,640,535);
			ventanaPrincipalV2.setVisible(true);
			ventanaPrincipalV2.setResizable(false);
			ventanaPrincipalV2.setLocationRelativeTo(null);
			this.setVisible(false);

		}
		else 
			if(e.getSource() == boton2){

				BienvenidaV2 ventanabievenidaV2 = new BienvenidaV2();
				ventanabievenidaV2.setBounds(0,0,370,450);
				ventanabievenidaV2.setVisible(true);
				ventanabievenidaV2.setResizable(false);
				ventanabievenidaV2.setLocationRelativeTo(null);
				this.setVisible(false);
		}

	}




	public static void main(String args[]){

		TerminosV2 ventanaterminosV2 = new TerminosV2();
		ventanaterminosV2.setBounds(0,0,610,460);
		ventanaterminosV2.setVisible(true);
		ventanaterminosV2.setResizable(false);
		ventanaterminosV2.setLocationRelativeTo(null);

	}


}