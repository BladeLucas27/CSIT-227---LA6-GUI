package ItemListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemListener extends JFrame{
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JPanel pMain;
    private JLabel languageLabel;
    private JLabel proficiencyLevel;

    ItemListener(){
        /*
        JCheckBox[] cbLanguages = {cCheckBox,cppCheckBox,cSharpCheckBox,javaCheckBox,pythonCheckBox};
        cCheckBox.setName("cCheckBox");
        cppCheckBox.setName("cppCheckBox");
        cSharpCheckBox.setName("cSharpCheckBox");
        javaCheckBox.setName("javaCheckBox");
        pythonCheckBox.setName("pythonCheckBox");
        String languages = null;
        cCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lang;
                if(cCheckBox.isSelected()){
                    lang = "C, ";
                }
                //languages = languages + lang;
            }
        });
         */
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox self = (JCheckBox) e.getSource();
                String[] languageText = languageLabel.getText().split(": ");
                if (languageText.length == 1) {
                    languageLabel.setText(": " + self.getText());
                    return;
                }

                languageText = languageText[1].split(", ");
                if (self.isSelected()) {
                    languageLabel.setText(languageLabel.getText() + ", " + self.getText());
                } else {
                    String[] newLanguage = new String[languageText.length - 1];
                    int idx = 0;

                    for (String s : languageText) {
                        if (!s.equals(self.getText())) newLanguage[idx++] = s;
                    }

                    languageLabel.setText(": " + String.join(", ", newLanguage));
                }
            }
        };
        cCheckBox.addActionListener(listener);
        cppCheckBox.addActionListener(listener);
        cSharpCheckBox.addActionListener(listener);
        javaCheckBox.addActionListener(listener);
        pythonCheckBox.addActionListener(listener);

        proficiencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(proficiencyComboBox.getSelectedIndex()==0){
                    proficiencyLevel.setText(": Low");
                } else if (proficiencyComboBox.getSelectedIndex()==1) {
                    proficiencyLevel.setText(": Medium");
                }else if (proficiencyComboBox.getSelectedIndex()==2) {
                    proficiencyLevel.setText(": High");
                }
            }
        });
    }
    public static void main(String[] args) {
        ItemListener s = new ItemListener();
        s.setContentPane(s.pMain);
        s.setSize(600, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Item Listener");
    }
}
