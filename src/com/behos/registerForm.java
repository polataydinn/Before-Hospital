package com.behos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    private JTextField tcGiris;
    private JButton girişButton;
    public static Connection baglan;
    public ResultSet results;


    //Sql Bağlantısını Açmak için gerekli fonksiyon
    public static void baglantiAc(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/kullanici_bilgileri";
        String kullaniciAdi = "root";
        String sifre = "";
        baglan = DriverManager.getConnection(url,kullaniciAdi,sifre);
      //  JOptionPane.showMessageDialog(null,"Baglantı Başarılı");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Bağlantı Başarısız!");
        }
    }
    //Sql bağlantısını kapatmak için gerekli fonksiyon
    public static void baglantiKapat(){
        try{
            baglan.close();
           // JOptionPane.showMessageDialog(null,"Bağlantı Başarıyla Kapatıldı");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Bağlantı Kapatılamadı!");
        }
    }

    //Database'e Kayıt eklemek için yapılan fonksiyon
    public void ekle(){
        String ad_soyad = adSoyad.getText() ;
        Long tc = Long.parseLong(tcNo.getText());
        int cinsiyet = cinsiyetComboBox.getSelectedIndex();
        int  yas = Integer.parseInt((String) yasComboBox.getItemAt(yasComboBox.getSelectedIndex()));
        int  kilo = Integer.parseInt((String) kiloComboBox.getItemAt(kiloComboBox.getSelectedIndex()));
        int  boy = Integer.parseInt((String) boyComboBox.getItemAt(boyComboBox.getSelectedIndex()));

        String ekle_sorgusu = "insert into bilgiler (ad_soyad,tc_no,cinsiyet,yas,kilo,boy) " +
                "values ('"+ad_soyad+"','"+tc+"','"+cinsiyet+"','"+yas+"','"+kilo+"','"+boy+"')";

        try{
            Statement calistir = baglan.createStatement();
            calistir.execute(ekle_sorgusu);
            JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Eklendi :)");

        }
        catch (SQLException e){
        JOptionPane.showMessageDialog(null,"Hata Oluştu!  " + e);
        }
    }

    // Uygulamaya TC ile Giriş yapabilmek için yapılan fonksiyon
    public void bul(){
        Long tcLogin = Long.parseLong(tcGiris.getText());
        String bul_komutu = "select* from bilgiler where tc_no="+tcLogin;
        try{
            Statement statement = baglan.createStatement();
            results = statement.executeQuery(bul_komutu);
            results.next();
            JOptionPane.showMessageDialog(null,"Giriş Başarılı.. Hoşgeldin " + results.getString("ad_soyad"));
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Hatalı Tc Kimlik Numarası");
        }
    }


    //Class'ın constructor'ı
    public registerForm(String baslik){
        super(baslik);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(registerPanel);
        this.pack();
        kayıtOlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baglantiAc();
                ekle();
                baglantiKapat();
            }
        });
        girişButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baglantiAc();
                bul();
                baglantiKapat();
            }
        });
    }
    //Main fonksiyon
    public static void main(String[] args){
        JFrame frame = new registerForm("Giriş Ekranı");
        frame.setVisible(true);
      }


     //Custom Create Modun fonksiyonu
    private void createUIComponents() {
        // TODO: place custom component creation code here
        registerPicLabel = new JLabel(new ImageIcon("iconFiles/group.png"));
    }
}
