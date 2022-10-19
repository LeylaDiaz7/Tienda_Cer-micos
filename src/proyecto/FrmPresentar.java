package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPresentar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPresentar frame = new FrmPresentar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPresentar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 370);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//AQUI
				System.exit(ABORT);
				
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnMatenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMatenimiento);
		
		JMenuItem mntmConsultarC = new JMenuItem("Consultar cerámicos");
		mnMatenimiento.add(mntmConsultarC);
		
		JMenuItem mntmModificarC = new JMenuItem("Modificar cerámicos");
		mnMatenimiento.add(mntmModificarC);
		
		JMenuItem mntmListarC = new JMenuItem("Listar cerámicos");
		mnMatenimiento.add(mntmListarC);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar reportes");
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguración = new JMenu("Configuración");
		menuBar.add(mnConfiguración);
		
		JMenuItem mntmConfiDesc = new JMenuItem("Configurar descuentos");
		mnConfiguración.add(mntmConfiDesc);
		
		JMenuItem mntmConfiObsequios = new JMenuItem("Configurar obsequios");
		mnConfiguración.add(mntmConfiObsequios);
		
		JMenuItem mntmConfiCantOptima = new JMenuItem("Configurar cantidad óptima");
		mnConfiguración.add(mntmConfiCantOptima);
		
		JMenuItem mntmConfiCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mnConfiguración.add(mntmConfiCuotaDiaria);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaTienda = new JMenuItem("Acerca de la tienda");
		mnAyuda.add(mntmAcercaTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
