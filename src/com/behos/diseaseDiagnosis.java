package com.behos;

public class diseaseDiagnosis {

    public static void yokCevap(int deger){
        if(deger == 0){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 100)/2;
        }
        if(deger == 1){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
        if(deger == 2){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
        if(deger == 3){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
        if(deger == 4){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
    }

    public static void nadirenCevap(int deger){
        if(deger == 0){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
        if(deger == 1){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 100)/2;
        }
        if(deger == 2){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
        if(deger == 3){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 25)/2;
        }
        if(deger == 4){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
    }

    public static void bazenCevap(int deger){
        if(deger == 0){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 25)/2;
        }
        if(deger == 1){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
        if(deger == 2){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 100)/2;
        }
        if(deger == 3){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
        if(deger == 4){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 25)/2;
        }
    }

    public static void sikCevap(int deger){
        if(deger == 0){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
        if(deger == 1){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 25)/2;
        }
        if(deger == 2){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
        if(deger == 3){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 100)/2;
        }
        if(deger == 4){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
    }

    public static void siddetliCevap(int deger){
        if(deger == 0){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 0)/2;
        }
        if(deger == 1){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 25)/2;
        }
        if(deger == 2){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 50)/2;
        }
        if(deger == 3){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 75)/2;
        }
        if(deger == 4){
            CONST.koronaTanıOran = (CONST.koronaTanıOran + 100)/2;
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
        sikCevap(deger8);
        yokCevap(deger9);
        yokCevap(deger10);
        sikCevap(deger11);
        sikCevap(deger12);
    }

    public void sogukAlginligiTaniOrani(int deger1,int deger2,int deger3,int deger4,int deger5,int deger6,int deger7,int deger8,int deger9,int deger10,int deger11,int deger12){
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

    public void alerjiTaniOrani(int deger1,int deger2,int deger3,int deger4,int deger5,int deger6,int deger7,int deger8,int deger9,int deger10,int deger11,int deger12){
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
