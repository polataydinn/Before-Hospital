/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behos;

import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author aydin
 */
public class CONST {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://134.209.237.235:3306/kullanici_bilgileri?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "P@ssW0rd";
    public static String dosyaKonumu;
    public static ResultSet results;
    public static String userAdiSoyadi = "";
    public static Long userTcNo;
    public static int userCinsiyet;
    public static int userYas;
    public static int userKilo;
    public static float userBoy;
    public static String userSifre = "";
    public static String guncelSifre="";
    public static String guncelKullanici="";
    public static float hastalikTaniOran = 0f;
    public static float koronaYuzde = 0f;
    public static float sogukAlginligiYuzde = 0f;
    public static float gripYuzde = 0f;
    public static float alerjiYuzde = 0f;
    public static boolean koronaBool = false;
    public static boolean sogukAlginligiBool = false;
    public static boolean gripBool = false;
    public static boolean alerjiBool = false;
    

    public CONST(){
        
    }
}