package com.myownphone.shop;

import com.myownphone.Phone;
import com.myownphone.PhoneBuilder;

public class PhoneFactory {

    public static void main(String[] args) {
       
        Phone myPhone = new PhoneBuilder().setBattery(30000).setName("MotoG").setOS("Android").getPhone();
        System.out.println(myPhone);
    }

}
