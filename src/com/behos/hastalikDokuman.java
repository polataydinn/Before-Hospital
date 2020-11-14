package com.behos;

import javax.swing.*;
import java.io.*;


public class hastalikDokuman extends JFrame {
    private JPanel sogukAlginligiPanel;
    private JButton button1;
    private JScrollPane scrollPane;
    private JTextArea metinBolgesi;

    public hastalikDokuman(String baslik){
        super(baslik);
        this.setContentPane(sogukAlginligiPanel);
        this.pack();

        pdfReader(CONST.dosyaAdi);
    }

    public void pdfReader(String dosyaKonumu){
        String dosyaAdi = dosyaKonumu;

        try{
            FileReader okuyucu = new FileReader(dosyaAdi);
            BufferedReader br = new BufferedReader(okuyucu);
            metinBolgesi.read(br,null);
            br.close();
            metinBolgesi.requestFocus();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void hastalikFrameCalistir(){
        JFrame sogukAlginligiFrame = new hastalikDokuman("Hastalık Döküman");
        sogukAlginligiFrame.setVisible(true);
    }

    public static void main(String[] args){

        hastalikFrameCalistir();

    }
}
