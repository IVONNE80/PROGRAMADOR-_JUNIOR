package calculator;

import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PoliceListen implements ComputerListener {
    JTextArea jTextArea;
    JTextField jTextField;
    JButton jButton[] = new JButton[20];
    double answer = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        Operation(e);

    }

    /**
     * @param e
     */
    void Operation(ActionEvent e) {
		if (e.getActionCommand().equals("C")) {// deja el cuadro de entrada en blanco
			jTextField.setText(null);
		}

		if (jTextField.getText().length() == 0) {// Asegúrate de que el primer dígito sea un número
			if (e.getActionCommand().matches("[\\d]")) {
				jTextField.setText(e.getActionCommand());
			}
		} else if (jTextField.getText().length() == 1 // En el caso de que el primer dígito sea cero, el segundo que no sea un dígito excluye el caso de que comience con 001
				&& ((jTextField.getText().charAt(0) + "").equals("0")) && e.getActionCommand().matches("[\\d]")) {

		} else if (jTextField.getText().length() == 1 // En el caso de que el primer dígito sea cero, el segundo que no sea un dígito excluye el caso de que comience con 001
				&& !(jTextField.getText().charAt(0) + "").equals("0")) {
			if (!e.getActionCommand().equals("=")) {
				jTextField.setText(jTextField.getText() + e.getActionCommand());
			}
		} else {
			// Asegúrese de que si ingresa "0" desde el tercer dígito, juzgue si los dos primeros dígitos son signos y si el primer dígito es "0". Excluir (+ - * / 00)
			if (e.getActionCommand().matches("[\\d]")) {
				String string2 = jTextField.getText().charAt(jTextField.getText().length() - 2) + "";
				String string1 = jTextField.getText().charAt(jTextField.getText().length() - 1) + "";
				if ((string2.equals("+") || string2.equals("/") || string2.equals("*") || string2.equals("-"))
						&& string1.equals("0")) {
				} else {
					jTextField.setText(jTextField.getText() + e.getActionCommand());
				}

			}
			// Utilice el bit de signo como punto de división para asegurarse de que el "número" de entrada sea legal
			if (e.getActionCommand().equals(".")) {
				int count = 0;
				for (int i = 0; i < jTextField.getText().length(); i++) {
					String string = jTextField.getText().charAt(i) + "";
					if (string.equals(".")) {
						count = 1;
					}
					if (string.equals("+") || string.equals("/") || string.equals("*") || string.equals("-")) {
						count = 0;
					}
				}
				if (count == 0) {
					jTextField.setText(jTextField.getText() + e.getActionCommand());
				}
			}

			if (e.getActionCommand().equals("+") || e.getActionCommand().equals("/") || e.getActionCommand().equals("*")
					|| e.getActionCommand().equals("-")) {
				String string = String.valueOf(jTextField.getText().charAt(jTextField.getText().length() - 1));
				if (string.matches("[\\d]")) {
					jTextField.setText(jTextField.getText() + e.getActionCommand());
				}
			}

			if (e.getActionCommand().equals("=")) {
				String lastFlagString = jTextField.getText().charAt(jTextField.getText().length() - 1) + "";
				if (lastFlagString.matches("[\\d]")) {
					calculate();
				} else {
					jTextField.setText("Entrada ilegal, que termina con un símbolo");
				}

			}

		}
		if (e.getActionCommand().equals("+/-")) {
			jTextArea.append("+/-  :" + answer + "=" + -answer + "\n");

		}

		if (e.getActionCommand().equals("1/X")) {
			if (answer != 0) {
				jTextArea.append("1/X" + answer + "=" + 1 / answer + "\n");
			} else {
				jTextArea.append("División por cero \ n");
			}

		}
		if (e.getActionCommand().equals("Sqrt")) {

			jTextArea.append("Sqrt:" + answer + "=" + Math.sqrt(answer) + "\n");
		}

	}

    void calculate() {
        LinkedList<Double> operater_Number = new LinkedList<Double>();
        LinkedList<String> operater_Flag = new LinkedList<String>();
        StringTokenizer fenxi_Number = new StringTokenizer(jTextField.getText(), "+-*/");
        StringTokenizer fenxi_Flag = new StringTokenizer(jTextField.getText(), "0123456789.");

        int count_Number = fenxi_Number.countTokens();

        for (int i = 0; i < count_Number; i++) {
            operater_Number.add(Double.parseDouble(fenxi_Number.nextToken()));

        }
        int count_Flag = fenxi_Flag.countTokens();
        for (int i = 0; i < count_Flag; i++) {
            operater_Flag.add(fenxi_Flag.nextToken());
        }

        while (operater_Flag.size() != 0 && operater_Number.size() > 1) {
            for (int i = 0; i < operater_Flag.size(); i++) {
                boolean exit = false;
                if (operater_Flag.get(i).equals("*")) {

                    operater_Number.set(i, operater_Number.get(i) * operater_Number.get(i + 1));
                    exit = true;

                }
                if (operater_Flag.get(i).equals("/")) {
                    operater_Number.set(i, (operater_Number.get(i) / operater_Number.get(i + 1) * 1.0));
                    exit = true;
                }
                if (exit == true) {
                    operater_Flag.remove(i);
                    operater_Number.remove(i + 1);
                    i = i - 1;

                }

            }

            for (int i = 0; i < operater_Flag.size(); i++) {
                boolean exit = false;
                if (operater_Flag.get(i).equals("+")) {
                    operater_Number.set(i, operater_Number.get(i) + operater_Number.get(i + 1));
                    exit = true;
                }
                if (operater_Flag.get(i).equals("-")) {
                    operater_Number.set(i, operater_Number.get(i) - operater_Number.get(i + 1));
                    exit = true;
                }
                if (exit == true) {
                    operater_Flag.remove(i);
                    operater_Number.remove(i + 1);
                    i = i - 1;
                }

            }
        }
        this.answer = operater_Number.get(0);
        jTextArea.append(jTextField.getText() + "=" + operater_Number.get(0) + "\n");
        jTextField.setText(null);
        operater_Flag.clear();
        operater_Number.clear();
    }

    @Override
    public void setJTextArea(JTextArea jTextArea) {
        // TODO Auto-generated method stub
        this.jTextArea = jTextArea;

    }

    @Override
    public void setJTextField(JTextField jTextField) {
        // TODO Auto-generated method stub
        this.jTextField = jTextField;
    }

    @Override
    public void setJBTextbotton(JButton jButton[]) {
        // TODO Auto-generated method stub
        this.jButton = jButton;

    }

}