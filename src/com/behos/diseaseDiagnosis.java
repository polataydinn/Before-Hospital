package com.behos;

public class diseaseDiagnosis {

    public static void yokCevap(int deger){
        if(deger == 0){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 100;
        }
        if(deger == 1){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 0;
        }
        if(deger == 2){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 0;
        }
        if(deger == 3){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 0;
        }
        if(deger == 4){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 0;
        }
    }

    public static void nadirenCevap(int deger){
        if(deger == 0){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 50;
        }
        if(deger == 1){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 100;
        }
        if(deger == 2){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 50;
        }
        if(deger == 3){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 25;
        }
        if(deger == 4){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 0;
        }
    }

    public static void bazenCevap(int deger){
        if(deger == 0){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 25;
        }
        if(deger == 1){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 50;
        }
        if(deger == 2){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 100;
        }
        if(deger == 3){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 50;
        }
        if(deger == 4){
            CONST.hastalikTaniOran = CONST.hastalikTaniOran + 25;
        }
    }

    public static void sikCevap(int deger){
        if(deger == 0){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 0);
        }
        if(deger == 1){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 25);
        }
        if(deger == 2){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 50);
        }
        if(deger == 3){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 100);
        }
        if(deger == 4){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 50);
        }
    }

    public static void siddetliCevap(int deger){
        if(deger == 0){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 0);
        }
        if(deger == 1){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 25);
        }
        if(deger == 2){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 50);
        }
        if(deger == 3){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 75);
        }
        if(deger == 4){
            CONST.hastalikTaniOran = (CONST.hastalikTaniOran + 100);
        }
    }

    public static void koronaTaniOrani(int deger1,int deger2,int deger3,int deger4,int deger5,int deger6,int deger7,int deger8,int deger9,int deger10,int deger11,int deger12){
       // Soruların verilen cevaba göre yüzdelik hesaplanmasının yapılması
        sikCevap(deger1);
        sikCevap(deger2);
        sikCevap(deger3);
        siddetliCevap(deger4);
        sikCevap(deger5);
        bazenCevap(deger6);
        yokCevap(deger7);
        bazenCevap(deger8);
        yokCevap(deger9);
        yokCevap(deger10);
        bazenCevap(deger11);
        bazenCevap(deger12);
    }

    public static void sogukAlginligiTaniOrani(int deger1,int deger2,int deger3,int deger4,int deger5,int deger6,int deger7,int deger8,int deger9,int deger10,int deger11,int deger12){
        nadirenCevap(deger1);
        bazenCevap(deger2);
        yokCevap(deger3);
        yokCevap(deger4);
        yokCevap(deger5);
        nadirenCevap(deger6);
        sikCevap(deger7);
        yokCevap(deger8);
        sikCevap(deger9);
        yokCevap(deger10);
        sikCevap(deger11);
        yokCevap(deger12);
    }

    public static void gripTaniOrani(int deger1, int deger2, int deger3, int deger4, int deger5, int deger6, int deger7, int deger8, int deger9, int deger10, int deger11, int deger12){
        sikCevap(deger1);
        sikCevap(deger2);
        sikCevap(deger3);
        yokCevap(deger4);
        bazenCevap(deger5);
        sikCevap(deger6);
        bazenCevap(deger7);
        bazenCevap(deger8);
        bazenCevap(deger9);
        yokCevap(deger10);
        bazenCevap(deger11);
        nadirenCevap(deger11);
    }

    public static void alerjiTaniOrani(int deger1,int deger2,int deger3,int deger4,int deger5,int deger6,int deger7,int deger8,int deger9,int deger10,int deger11,int deger12){
        yokCevap(deger1);
        bazenCevap(deger2);
        bazenCevap(deger3);
        bazenCevap(deger4);
        bazenCevap(deger5);
        yokCevap(deger6);
        sikCevap(deger7);
        sikCevap(deger8);
        sikCevap(deger9);
        sikCevap(deger10);
        yokCevap(deger11);
        yokCevap(deger12);
    }
}
