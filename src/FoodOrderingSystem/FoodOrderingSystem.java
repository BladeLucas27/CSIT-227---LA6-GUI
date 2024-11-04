package FoodOrderingSystem;

import SimpleCalculator.SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel pMain;

    FoodOrderingSystem(){
        JRadioButton[] rbDisc = {rbNone, rb5, rb10, rb15};
        JCheckBox[] cbFood = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};


        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0, total = 0;
                double disc;
                String discType = null;

                if(cPizza.isSelected()) sum += 100;
                if(cBurger.isSelected()) sum += 80;
                if(cFries.isSelected()) sum += 65;
                if(cSoftDrinks.isSelected()) sum += 55;
                if(cTea.isSelected()) sum += 50;
                if(cSundae.isSelected()) sum += 40;

                for(JRadioButton rb : rbDisc){
                    if(rb.isSelected()){
                        discType = rb.getText();
                    }
                }
                    if(discType == "None"){
                        disc = 0 * sum;
                    }else if(discType == "5% Off"){
                        disc = 0.05 * sum;
                    }else if(discType == "10% Off"){
                        disc = 0.1 * sum;
                    }else{
                        disc = 0.15 * sum;
                    }
                    total = sum - disc;
                    //String result = String.valueOf(total);
                    String result = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null, "The total price is " + result, "Food Ordering System", JOptionPane.PLAIN_MESSAGE);

                }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem s = new FoodOrderingSystem();
        s.setContentPane(s.pMain);
        s.setSize(600, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Food Ordering System");
    }
}
