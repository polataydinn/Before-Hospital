package com.behos;


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
    private JComboBox burunTikanikligiDeger9;
    private JComboBox gozlerdeSulanmaDeger10;
    private JComboBox bogazAgrisiDeger11;
    private JComboBox ishalDeger12;
    private JButton hesaplaBakemButton;
    private JLabel sonucIsimLabel4;
    private JLabel sonucIsimLabel3;
    private JLabel sonucIsimLabel2;
    private JLabel sonucIsimLabel1;
    private JLabel sonucLabel4;
    private JLabel sonucLabel3;
    private JLabel sonucLabel2;
    private JLabel sonucLabel1;
    private JButton hastaneButon;
    private JLabel sonucRapor;
    private JLabel sonucRapor2;
    private JButton sogukAlginligiButton;
    private JButton gripButton;
    private JButton alerjiButton;


    public mainPageForm(String baslik){

        super(baslik);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPagePanel);
        this.pack();
        //kullanıcı profil bilgilerini ekranda gösterme
        kullaniciAdi.setText(CONST.userAdiSoyadi);
        tcLabel.setText(CONST.userTcNo.toString());
        yasLabel.setText(String.valueOf(CONST.userYas));
        kiloLabel.setText(String.valueOf(CONST.userKilo));
        boyLabel.setText(String.valueOf(CONST.userBoy));
        //Vücüt Kitle Endkesini Hesaplama
        float boyFloat = CONST.userBoy/100;
        float vke  = CONST.userKilo/(boyFloat*boyFloat);
        boyKiloEndeksi.setText(String.valueOf(vke));


        // Hastalık Tanıma Butonu
        hesaplaBakemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Korona olma Yüzdesini hesaplama
                diseaseDiagnosis.koronaTaniOrani(atesDeger1.getSelectedIndex(),
                        yorgunlukDeger2.getSelectedIndex(),
                        kuruOksurukDeger3.getSelectedIndex(),
                        solunumDeger4.getSelectedIndex(),
                        oksurukDeger5.getSelectedIndex(),
                        agriDeger6.getSelectedIndex(),
                        hapsirmaDeger7.getSelectedIndex(),
                        burunAkintisiDeger8.getSelectedIndex(),
                        burunTikanikligiDeger9.getSelectedIndex(),
                        gozlerdeSulanmaDeger10.getSelectedIndex(),
                        bogazAgrisiDeger11.getSelectedIndex(),
                        ishalDeger12.getSelectedIndex());

                //Korona Yüzdeliğini ekranda Gösterme
                        CONST.koronaYuzde = CONST.hastalikTaniOran/12;
                        CONST.hastalikTaniOran = 0f;
                        sonucIsimLabel1.setText("Korona :");
                        sonucLabel1.setText(String.valueOf(CONST.koronaYuzde));
                //Yapılan Sonuçlarda Korona mısın değil misin onu buluyor
                        diseaseDiagnosis.hastalikTani(CONST.koronaYuzde);

                diseaseDiagnosis.sogukAlginligiTaniOrani(atesDeger1.getSelectedIndex(),
                        yorgunlukDeger2.getSelectedIndex(),
                        kuruOksurukDeger3.getSelectedIndex(),
                        solunumDeger4.getSelectedIndex(),
                        oksurukDeger5.getSelectedIndex(),
                        agriDeger6.getSelectedIndex(),
                        hapsirmaDeger7.getSelectedIndex(),
                        burunAkintisiDeger8.getSelectedIndex(),
                        burunTikanikligiDeger9.getSelectedIndex(),
                        gozlerdeSulanmaDeger10.getSelectedIndex(),
                        bogazAgrisiDeger11.getSelectedIndex(),
                        ishalDeger12.getSelectedIndex());

                        CONST.sogukAlginligiYuzde = CONST.hastalikTaniOran/12;
                        CONST.hastalikTaniOran = 0f;
                        sonucIsimLabel2.setText("Soğuk Algınlığı :");
                        sonucLabel2.setText(String.valueOf(CONST.sogukAlginligiYuzde));
                        diseaseDiagnosis.hastalikTani(CONST.sogukAlginligiYuzde);


                diseaseDiagnosis.gripTaniOrani(atesDeger1.getSelectedIndex(),
                        yorgunlukDeger2.getSelectedIndex(),
                        kuruOksurukDeger3.getSelectedIndex(),
                        solunumDeger4.getSelectedIndex(),
                        oksurukDeger5.getSelectedIndex(),
                        agriDeger6.getSelectedIndex(),
                        hapsirmaDeger7.getSelectedIndex(),
                        burunAkintisiDeger8.getSelectedIndex(),
                        burunTikanikligiDeger9.getSelectedIndex(),
                        gozlerdeSulanmaDeger10.getSelectedIndex(),
                        bogazAgrisiDeger11.getSelectedIndex(),
                        ishalDeger12.getSelectedIndex());

                        CONST.gripYuzde = CONST.hastalikTaniOran/12;
                        CONST.hastalikTaniOran = 0f;
                        sonucIsimLabel3.setText("Grip :");
                        sonucLabel3.setText(String.valueOf(CONST.gripYuzde));
                        diseaseDiagnosis.hastalikTani(CONST.gripYuzde);


                diseaseDiagnosis.alerjiTaniOrani(atesDeger1.getSelectedIndex(),
                        yorgunlukDeger2.getSelectedIndex(),
                        kuruOksurukDeger3.getSelectedIndex(),
                        solunumDeger4.getSelectedIndex(),
                        oksurukDeger5.getSelectedIndex(),
                        agriDeger6.getSelectedIndex(),
                        hapsirmaDeger7.getSelectedIndex(),
                        burunAkintisiDeger8.getSelectedIndex(),
                        burunTikanikligiDeger9.getSelectedIndex(),
                        gozlerdeSulanmaDeger10.getSelectedIndex(),
                        bogazAgrisiDeger11.getSelectedIndex(),
                        ishalDeger12.getSelectedIndex());

                        CONST.alerjiYuzde = CONST.hastalikTaniOran/12;
                        CONST.hastalikTaniOran = 0f;
                        sonucIsimLabel4.setText("Alerji :");
                        sonucLabel4.setText(String.valueOf(CONST.alerjiYuzde));
                        diseaseDiagnosis.hastalikTani(CONST.alerjiYuzde);


                // Gelen sonuçlara göre hangi hastalığa sahip olma ihtimalin varsa sonuç ekranında ona göre text belirlenecek
                if(CONST.koronaBool){
                    sonucRapor.setText("Sonuçlara göre hastalığınızı Korona gibi görünüyor.");
                    sonucRapor2.setText("Lütfen en yakın hastaneye gidip test yaptırın.");
                    CONST.koronaBool = false;
                }
                if(CONST.sogukAlginligiBool){
                    sonucRapor.setText("Sonuçlara göre hastalığınızı Soğuk Algınlığı gibi görünüyor.");
                    sonucRapor2.setText("Bu durumda Sol tarafta bulunan makaleleri okumanız tavsiye edilir.");
                    CONST.sogukAlginligiBool = false;
                }
                if(CONST.gripBool){
                    sonucRapor.setText("Sonuçlara göre hastalığınızı Grip gibi görünüyor.");
                    sonucRapor2.setText("Bu durumda Sol tarafta bulunan makaleleri okumanız tavsiye edilir.");
                    CONST.gripBool = false;
                }
                if(CONST.alerjiBool){
                    sonucRapor.setText("Sonuçlara göre hastalığınızı Alerji gibi görünüyor.");
                    sonucRapor2.setText("Bu durumda Sol tarafta bulunan makaleleri okumanız tavsiye edilir.");
                    CONST.alerjiBool = false;
                }
            }
        });
        sogukAlginligiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CONST.dosyaAdi = "res\\Soguk Alginligi.txt";
               hastalikDokuman.hastalikFrameCalistir();
            }
        });
        gripButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CONST.dosyaAdi = "res\\grip.txt";
                hastalikDokuman.hastalikFrameCalistir();


            }
        });
        alerjiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            CONST.dosyaAdi = "res\\alerji.txt";
            hastalikDokuman.hastalikFrameCalistir();

            }
        });
    }


    //Frame'i Açmayı register Classında da çağırmak için fonksiyon haline getirildi
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
        // Cinsiyete göre avatar belirleniyor
        if(CONST.userCinsiyet == 0){
            avatar = new JLabel(new ImageIcon("iconFiles/male_avatar.png"));
        }
        if(CONST.userCinsiyet == 1){
            avatar = new JLabel(new ImageIcon("iconFiles/female_avatar.png"));
        }
    }
}
