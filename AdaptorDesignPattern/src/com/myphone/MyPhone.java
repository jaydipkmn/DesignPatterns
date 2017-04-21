package com.myphone;

public class MyPhone {

    public static void main(String[] args) {
        IPhoneCharger iphonecharger = new  AndroidToIphoneChargerAdaptor();
        PhoneCharger phonecharger =  new PhoneCharger();
        phonecharger.setIcharge(iphonecharger);
        phonecharger.chargeMyPhone();
        
        
    }

}
