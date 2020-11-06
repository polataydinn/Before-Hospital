package com.behos;

import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class mainPageForm extends JFrame{

    private JPanel mainPagePanel;
    private JLabel avatar;

    public mainPageForm(String baslik){
        super(baslik);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPagePanel);
        this.pack();
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
