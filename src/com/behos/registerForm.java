package com.behos;

import javax.swing.*;

public class registerForm extends JFrame{
    private JPanel registerPanel;
    private JLabel registerPicLabel;
    private JTextField adSoyad;
    private JComboBox cinsiyetComboBox;
    private JComboBox yasComboBox;
    private JComboBox kiloComboBox;
    private JComboBox boyComboBox;
    private JButton kayıtOlButton;
    private JTextField tcNo;
    private JTextField textField1;
    private JButton girişButton;

    public registerForm(String baslik){
        super(baslik);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(registerPanel);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new registerForm("Giriş Ekranı");
        frame.setVisible(true);
      }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        registerPicLabel = new JLabel(new ImageIcon("iconFiles/group.png"));
    }
}
