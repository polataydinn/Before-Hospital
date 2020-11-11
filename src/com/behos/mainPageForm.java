package com.behos;


import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class mainPageForm extends JFrame{

    private JPanel mainPagePanel;
    private JLabel avatar;
    private JLabel kullaniciAdi;
    private JLabel tcLabel;
    private JLabel yasLabel;
    private JLabel kiloLabel;
    private JLabel boyLabel;
    private JLabel boyKiloEndeksi;
    private JPanel soruPanel;
    private JComboBox atesDeger1;
    private JComboBox yorgunlukDeger2;
    private JComboBox kuruOksurukDeger3;
    private JComboBox solunumDeger4;
    private JComboBox oksurukDeger5;
    private JComboBox agriDeger6;
    private JComboBox hapsirmaDeger7;
    private JComboBox burunAkintisiDeger8;
    private JComboBox burunTikanikliğiDeger9;
    private JComboBox gozlerdeSulanmaDeger10;
    private JComboBox bogazAgrisiDeger11;
    private JComboBox ishalDeger12;
    private JButton hesaplaBakemButton;


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

        hesaplaBakemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diseaseDiagnosis.koronaTaniOrani(atesDeger1.getSelectedIndex(),
                        yorgunlukDeger2.getSelectedIndex(),
                        kuruOksurukDeger3.getSelectedIndex(),
                        solunumDeger4.getSelectedIndex(),
                        oksurukDeger5.getSelectedIndex(),
                        agriDeger6.getSelectedIndex(),
                        hapsirmaDeger7.getSelectedIndex(),
                        burunAkintisiDeger8.getSelectedIndex(),
                        burunTikanikliğiDeger9.getSelectedIndex(),
                        gozlerdeSulanmaDeger10.getSelectedIndex(),
                        bogazAgrisiDeger11.getSelectedIndex(),
                        ishalDeger12.getSelectedIndex());

                JOptionPane.showMessageDialog(null,"oran : "+CONST.koronaTanıOran);
            }
        });
    }


    public static void frameCalistir(){
        JFrame mainFrame = new mainPageForm("Hastane Öncesi Tanı Modülü");
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setVisible(true);
       // mainFrame.setUndecorated(true);

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
