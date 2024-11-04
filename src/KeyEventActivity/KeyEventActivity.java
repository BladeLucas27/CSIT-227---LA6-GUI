package KeyEventActivity;

import MostFrequentCharacter.MostFrequentCharacter;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.security.Key;

public class KeyEventActivity extends JFrame{
    private JTextArea editableTextArea;
    private JTextArea nonEditableTextArea;
    private JPanel pMain;

    KeyEventActivity(){
        editableTextArea.setName("editableTextArea");
        nonEditableTextArea.setName("nonEditableTextArea");

        editableTextArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = editableTextArea.getText();
                char curr;
                String newText = "";
                StringBuilder stringBuilder = new StringBuilder(newText);
                for(int i=0; i<text.length(); i++)
                {
                    curr = text.charAt(i);
                    if(Character.compare(curr, 'a')==0 || Character.compare(curr, 'e')==0 || Character.compare(curr, 'i')==0 || Character.compare(curr, 'o')==0 || Character.compare(curr, 'u')==0 )
                    {
                        curr = Character.toUpperCase(curr);
                    }
                    stringBuilder.insert(i, curr);
                }
                //String result = String.valueOf(newText);
                String result = stringBuilder.toString();
                nonEditableTextArea.setText(result);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = editableTextArea.getText();
                StringBuilder stringBuilder = new StringBuilder(text);
                char curr;
                String newText = "";
                for(int i=0; i<text.length(); i++)
                {
                    curr = text.charAt(i);
                    if(Character.compare(curr, 'a')==0 || Character.compare(curr, 'e')==0 || Character.compare(curr, 'i')==0 || Character.compare(curr, 'o')==0 || Character.compare(curr, 'u')==0 )
                    {
                        curr = Character.toUpperCase(curr);
                    }
                    stringBuilder.insert(i, curr);
                }
                //String result = String.valueOf(newText);
                String result = stringBuilder.toString();
                nonEditableTextArea.setText(result);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String text = editableTextArea.getText();
                StringBuilder stringBuilder = new StringBuilder(text);
                char curr;
                String newText = "";
                for(int i=0; i<text.length(); i++)
                {
                    curr = text.charAt(i);
                    if(Character.compare(curr, 'a')==0 || Character.compare(curr, 'e')==0 || Character.compare(curr, 'i')==0 || Character.compare(curr, 'o')==0 || Character.compare(curr, 'u')==0 )
                    {
                        curr = Character.toUpperCase(curr);
                    }
                    stringBuilder.insert(i, curr);
                }
                //String result = String.valueOf(newText);
                String result = stringBuilder.toString();
                nonEditableTextArea.setText(result);
            }
        });
    }
    public static void main(String[] args) {
        KeyEventActivity s = new KeyEventActivity();
        s.setContentPane(s.pMain);
        s.setSize(600, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Key Event Class");
    }
}
