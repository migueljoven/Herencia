package teoria;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class InterfazGrafica {

	private JFrame frame;
	//
	private List<Motocicleta> listaMotocicleta = new ArrayList<Motocicleta>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazGrafica() {
		//(Lectura de la lista antes del initialize)
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Aplication Window
		//layout de tipo GridLayout
		frame.getContentPane().setLayout(new GridLayout(4, 2));
		
		//añadir Etiqueta(Jlabel) y campo de texto(JTextField)
		JLabel etiquetaPropietario = new JLabel("Propietario: ");
		frame.getContentPane().add(etiquetaPropietario);
		JTextField campoPropietario = new JTextField(10);
		frame.getContentPane().add(campoPropietario);
		
		JLabel etiquetaPasajeros = new JLabel("Nº Pasajeros: ");
		frame.getContentPane().add(etiquetaPasajeros);
		JTextField campoPasajeros = new JTextField(10);
		frame.getContentPane().add(campoPasajeros);
		
		JLabel etiquetaCilindrada = new JLabel("Cilindrada: ");
		frame.getContentPane().add(etiquetaCilindrada);
		JTextField campoCilindrada = new JTextField(10);
		frame.getContentPane().add(campoCilindrada);
		
		//Boton crear Motocicleta
		JButton botonCrear = new JButton("Crear Motocicleta");
		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String propietario = campoPropietario.getText();
				int numeroPasajeros = Integer.parseInt(campoPasajeros.getText());
				int cilindrada = Integer.parseInt(campoCilindrada.getText());
				Motocicleta moto = new Motocicleta(propietario, numeroPasajeros, cilindrada);
				System.out.println(moto);
				//listaMotocicleta.add(new Motocicleta(propietario, numeroPasajeros, cilindrada));
				listaMotocicleta.add(moto);
				//
				//listaMotocicleta.setText("");
			}
		});
		frame.getContentPane().add(botonCrear);
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//imprimir lista por pantalla
				System.out.println(listaMotocicleta);
				
				//guardar listaMotocicleta antes de salir
				Auxiliar.guardarDatos(listaMotocicleta);
				
				//salir
				System.exit(0);
			}
		});
		frame.getContentPane().add(botonSalir);
	
		//
		frame.pack();
		
	}

}
