package com.behos;

import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;

public class mainPageForm extends JFrame{

    private JPanel mainPagePanel;
    private JLabel avatar;
    private JLabel kullaniciAdi;
    private JLabel tcLabel;
    private JLabel yasLabel;
    private JLabel kiloLabel;
    private JLabel boyLabel;
    private JLabel boyKiloEndeksi;
    private JButton genelButton;
    private JButton kafaButton;
    private JButton gövdeButton;

    public mainPageForm(String baslik){
        super(baslik);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPagePanel);
        this.pack();
        kullaniciAdi.setText(CONST.userAdıSoyadı);
        tcLabel.setText(CONST.userTcNo.toString());
        yasLabel.setText(String.valueOf(CONST.userYas));
        kiloLabel.setText(String.valueOf(CONST.userKilo));
        boyLabel.setText(String.valueOf(CONST.userBoy));
        float boyFloat = CONST.userBoy/100;
        float vke  = CONST.userKilo/(boyFloat*boyFloat);
        boyKiloEndeksi.setText(String.valueOf(vke));
    }


    public static void frameCalistir(){
        JFrame mainFrame = new mainPageForm("Hastane Öncesi Tanı Modülü");
        mainFrame.setVisible(true);

    }

    public static void main(String[] args){
        frameCalistir();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        if(CONST.userCinsiyet == 0){
            avatar = new JLabel(new ImageIcon("iconFiles/male_avatar.png"));
        }
        if(CONST.userCinsiyet == 1){
            avatar = new JLabel(new ImageIcon("iconFiles/female_avatar.png"));
        }
    }
}
