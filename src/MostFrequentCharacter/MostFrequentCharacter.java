package MostFrequentCharacter;

import ItemListener.ItemListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostFrequentCharacter extends JFrame{
    private JTextArea textArea;
    private JLabel frequentCharLabel;
    private JPanel pMain;

    MostFrequentCharacter(){
        textArea.setName("textArea");
        frequentCharLabel.setName("frequentCharLabel");

        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = textArea.getText();
                char curr, currI, currJ;
                char freq = ' ';
                int ctr = 0, tempCtr = 0;
                for(int i=0; i<text.length(); i++)
                {
                    tempCtr = 0;
                    curr = text.charAt(i);
                    if(Character.compare(curr, ' ')==0)
                    {
                        continue;
                    }
                    currI = Character.toLowerCase(curr);
                    for(int j=i; j<text.length(); j++){
                        currJ = text.charAt(j);
                        if(Character.compare(currI, currJ)==0){
                            tempCtr++;
                        }
                    }
                    if(tempCtr > ctr)
                    {
                        ctr = tempCtr;
                        freq = currI;
                    }
                }
                String result = String.valueOf(freq);
                frequentCharLabel.setText(result);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = textArea.getText();
                char curr, currI, currJ;
                char freq = ' ';
                int ctr = 0, tempCtr = 0;
                for(int i=0; i<text.length(); i++)
                {
                    tempCtr = 0;
                    curr = text.charAt(i);
                    if(Character.compare(curr, ' ')==0)
                    {
                        continue;
                    }
                    currI = Character.toLowerCase(curr);
                    for(int j=i; j<text.length(); j++){
                        currJ = text.charAt(j);
                        if(Character.compare(currI, currJ)==0){
                            tempCtr++;
                        }
                    }
                    if(tempCtr > ctr)
                    {
                        ctr = tempCtr;
                        freq = currI;
                    }
                }
                String result = String.valueOf(freq);
                frequentCharLabel.setText(result);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String text = textArea.getText();
                char curr, currI, currJ;
                char freq = ' ';
                int ctr = 0, tempCtr = 0;
                for(int i=0; i<text.length(); i++)
                {
                    tempCtr = 0;
                    curr = text.charAt(i);
                    if(Character.compare(curr, ' ')==0)
                    {
                        continue;
                    }
                    currI = Character.toLowerCase(curr);
                    for(int j=i; j<text.length(); j++){
                        currJ = text.charAt(j);
                        if(Character.compare(currI, currJ)==0){
                            tempCtr++;
                        }
                    }
                    if(tempCtr > ctr)
                    {
                        ctr = tempCtr;
                        freq = currI;
                    }
                }
                String result = String.valueOf(freq);
                frequentCharLabel.setText(result);
            }
        });

    }
    public static void main(String[] args) {
        MostFrequentCharacter s = new MostFrequentCharacter();
        s.setContentPane(s.pMain);
        s.setSize(600, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Most Frequent Char");
    }
}
