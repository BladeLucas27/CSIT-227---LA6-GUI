package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LeapYearChecker extends JFrame{
    private JTextField yearTextField;
    private JButton checkYearButton;
    private JPanel pMain;
    LeapYearChecker(){
        yearTextField.setName("yearTextField");
        checkYearButton.setName("checkYearButton");

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text = yearTextField.getText();
                boolean leapYear;
                int year = Integer.valueOf(text);
                if(year % 4 == 0) {
                    if(year % 100 == 0) {
                        if(year % 400 == 0) {
                            leapYear = true;
                        }
                        else{
                            leapYear = false;
                        }
                    }
                    else{
                        leapYear = true;
                    }
                }
                else{
                    leapYear = false;
                }

                if(leapYear == true){
                    JOptionPane.showMessageDialog(null, "Leap year", "Message", JOptionPane.PLAIN_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not a leap year", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker s = new LeapYearChecker();
        s.setContentPane(s.pMain);
        s.setSize(400, 200);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Leap Year Checker");
    }
}
