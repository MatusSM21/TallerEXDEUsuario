package GUI;

/**
 *
 * @author Cristopher Matus
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class JCalc extends JFrame implements ActionListener {
    private JComboBox<String> operaciones;
    private JTextField operadorField, operandoField, resultadoField;
    private JButton calcularButton;

    public JCalc(Ventana aThis, boolean par) {
        // Configurar la ventana principal
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // Crear componentes
        operaciones = new JComboBox<>(new String[]{"Suma", "Resta", "Multiplicación", "División"});
        operadorField = new JTextField(10);
        operandoField = new JTextField(10);
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);
        calcularButton = new JButton("Realizar Operación");

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.add(new JLabel("Operación:"));
        panel.add(operaciones);
        panel.add(new JLabel("Operador:"));
        panel.add(operadorField);
        panel.add(new JLabel("Operando:"));
        panel.add(operandoField);
        panel.add(calcularButton);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultadoField);

        // Agregar el panel a la ventana
        add(panel);

        // Configurar el ActionListener para el botón
        calcularButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            // Obtener la operación seleccionada
            String operacion = (String) operaciones.getSelectedItem();
            double operador = Double.parseDouble(operadorField.getText());
            double operando = Double.parseDouble(operandoField.getText());
            double resultado = 0.0;

            // Realizar la operación seleccionada
            switch (operacion) {
                case "Suma":
                    resultado = operador + operando;
                    break;
                case "Resta":
                    resultado = operador - operando;
                    break;
                case "Multiplicación":
                    resultado = operador * operando;
                    break;
                case "División":
                    if (operando != 0) {
                        resultado = operador / operando;
                    } else {
                        resultadoField.setText("Error: División por cero");
                        return;
                    }
                    break;
            }

            // Mostrar el resultado
            resultadoField.setText(Double.toString(resultado));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new JCalc((Ventana) this.clone(), true).setVisible(true);
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(JCalc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}

