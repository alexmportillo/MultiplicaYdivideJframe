import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiDivide {

	private JFrame frame;
	private JLabel resultado;
	private JTextField numero1;
	private JTextField numero2;
	private JButton btnDividir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiDivide window = new MultiDivide();
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
	public MultiDivide() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		numero1 = new JTextField();
		numero1.setBounds(68, 39, 86, 20);
		frame.getContentPane().add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setBounds(186, 39, 86, 20);
		frame.getContentPane().add(numero2);
		numero2.setColumns(10);
		
		JLabel Label = new JLabel("New label");
		Label.setBounds(156, 124, 46, 14);
		frame.getContentPane().add(Label);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				float numeroUno=0f;
				float numeroDos=0f;
				
				numeroUno= Float.parseFloat(numero1.getText());
				numeroDos= Float.parseFloat(numero2.getText());
				
				float result = numeroUno*numeroDos;
				Label.setText(String.valueOf(result));
			}
		});
		btnMultiplicar.setBounds(68, 70, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float numeroUno=0f;
				float numeroDos=0f;
				
				numeroUno=Float.parseFloat(numero1.getText());
				numeroDos= Float.parseFloat(numero2.getText());
				
				float result = numeroUno/numeroDos;
				Label.setText(String.valueOf(result));
				
			}
		});
		btnDividir.setBounds(183, 70, 89, 23);
		frame.getContentPane().add(btnDividir);
	}
}
