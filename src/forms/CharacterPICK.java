package forms;

import anim.anim;
import entity.Entity;
import main.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CharacterPICK extends GameWindowForm implements Forms{
    private JLabel lblNAME;
    private JTextField tfNAME;
    private JLabel lblGENDER;
    private JRadioButton rbMALE;
    private JRadioButton rbFEMALE;
    private JButton bSUBMIT;
    private JLabel lblSELECT;
    private JLabel lblRACE;
    private JRadioButton rbHUMAN;
    private JRadioButton rbCOMPY;
    private JRadioButton rbCOELE;
    private JRadioButton rbPTERO;
    private JLabel imgRACE;
    public JPanel charPanel;
    private JLabel lblCPHRASE;
    private JLabel lblFNAME;
//    private JButton bBACK;
    private ButtonGroup bgRACE;
    private ButtonGroup bgGENDER;
    private MainMenu mainMenu;

    private Entity p1;

    public CharacterPICK(){
        this.mainMenu = mainMenu;
        Forms.customizeButton(rbHUMAN, 12);
        Forms.customizeButton(rbCOMPY, 12);
        Forms.customizeButton(rbCOELE, 12);
        Forms.customizeButton(rbPTERO, 12);
        Forms.customizeButton(rbMALE, 12);
        Forms.customizeButton(rbFEMALE, 12);
        Forms.customizeButton(bSUBMIT, 12);
//        Forms.customizeButton(bBACK, 12);
        Forms.customizeButton(lblNAME, 12);
        Forms.customizeButton(lblGENDER, 12);
        Forms.customizeButton(lblRACE, 12);
        Forms.customizeButton(lblSELECT, 20);
        Forms.customizeButton(tfNAME, 12);
        Forms.customizeButton(lblFNAME, 12);
        Forms.customizeButton(lblCPHRASE, 12);

        setContentPane(charPanel);

//        rbMALE.isSelected();
//        rbHUMAN.isSelected();


        tfNAME.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                String name = tfNAME.getText();

                tfNAME.setToolTipText("15 character/letter limit");
                if (name.length() > 15) {
                    name = name.substring(0, 15);
                    tfNAME.setText(name);
                }

                if (name.trim().isEmpty()){
                    lblFNAME.setText("");
                }
                else{
                    lblFNAME.setText(name + ":");
                }
            }
        });

        rbHUMAN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage("./img/human.png");
                String name = tfNAME.getText();
                p1 = new Entity.Human(name, rbMALE.isSelected() ? "Male" : "Female", "Human");
                lblCPHRASE.setText(p1.toString());
                charPanel.revalidate();
                charPanel.repaint();
            }
        });

        rbCOMPY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage("./img/compy.png");
                String name = tfNAME.getText();
                p1 = new Entity.Compy(name, rbMALE.isSelected() ? "Male" : "Female", "Compy");
                lblCPHRASE.setText(p1.toString());
                charPanel.revalidate();
                charPanel.repaint();
            }
        });

        rbCOELE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage("./img/coele.png");
                String name = tfNAME.getText();
                p1 = new Entity.Coelacanth(name, rbMALE.isSelected() ? "Male" : "Female", "Coelecanth");
                lblCPHRASE.setText(p1.toString());
                charPanel.revalidate();
                charPanel.repaint();
            }
        });

        rbPTERO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage("./img/ptero.png");
                String name = tfNAME.getText();
                p1 = new Entity.Pterosaur(name, rbMALE.isSelected() ? "Male" : "Female", "Pterosaur");
                lblCPHRASE.setText(p1.toString());
                charPanel.revalidate();
                charPanel.repaint();
            }
        });

        bSUBMIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = tfNAME.getText(); // Get text from the text field
                    if (name != null && !name.trim().isEmpty() && bgGENDER.getSelection() != null && bgRACE.getSelection() != null) { // Check if the name is not null and not empty
                        new anim();
                        dispose();
                    } else {
                        throw new Exception("Enter the fields properly, dude."); // Throw an exception if the name is invalid
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage()); // Print error message to console
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // Show an error dialog
                }
            }
        });
    }

    private void updateImage(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        imgRACE.setIcon(icon);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        imgRACE = new JLabel(new ImageIcon("./img/def.png"));
    }
}
