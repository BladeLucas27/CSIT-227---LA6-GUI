package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel lblResult;
    private JPanel pMain;

    SimpleCalculator(){
        btnCompute.addActionListener(e -> {
            String a = tfNumber1.getText();
            int num1 = Integer.valueOf(a);
            String b = tfNumber2.getText();
            int num2 = Integer.valueOf(b);
            int res = 0;

            if(cbOperations.getSelectedIndex()==0){
                res = num1 + num2;
            } else if (cbOperations.getSelectedIndex()==1) {
                res = num1 - num2;
            }else if (cbOperations.getSelectedIndex()==2) {
                res = num1 * num2;
            }else if (cbOperations.getSelectedIndex()==3) {
                res = num1 / num2;
            }
            String result = String.valueOf(res);
            lblResult.setText(result);
        });
    }
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        s.setContentPane(s.pMain);
        s.setSize(600, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Simple Calculator");
    }
}
