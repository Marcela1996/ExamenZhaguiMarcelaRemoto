package ec.edu.ups.examen.presentacion;

import java.awt.EventQueue;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JFrame;


import ec.edu.ups.examen.on.GestionPaquetesONRemoto;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaRegistrar {

	private JFrame frame;
	
	
	private GestionPaquetesONRemoto remoto;
	private JTextField textRemitente;
	private JTextField txtReceptor;
	private JTextField txtDireccion;
	private JLabel lblNewLabel_2;

	public void conectar() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:18080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/ExamenAPP/PaqueteON!ec.edu.ups.examen.on.GestionPaquetesONRemoto";  
              
            this.remoto = (GestionPaquetesONRemoto) context.lookup(lookupName);  
     
        } catch (Exception ex) {  
        	System.out.println("errorrrr");
            ex.printStackTrace();  
            throw ex;  
        }  
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrar window = new VentanaRegistrar();
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
	public VentanaRegistrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 668, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 644, 355);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remitente:");
		lblNewLabel.setBounds(32, 54, 77, 13);
		panel.add(lblNewLabel);
		
		textRemitente = new JTextField();
		textRemitente.setBounds(119, 51, 155, 19);
		panel.add(textRemitente);
		textRemitente.setColumns(10);
		
		txtReceptor = new JTextField();
		txtReceptor.setBounds(118, 105, 155, 19);
		panel.add(txtReceptor);
		txtReceptor.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(119, 167, 156, 19);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Receptor");
		lblNewLabel_1.setBounds(32, 108, 77, 13);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setBounds(28, 170, 45, 13);
		panel.add(lblNewLabel_2);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(137, 259, 85, 21);
		panel.add(btnRegistrar);
	}
}
