package com.myphone;

import com.android.MotoGCharger;

public class AndroidToIphoneChargerAdaptorInheritance extends MotoGCharger implements IPhoneCharger {

    @Override
    public void chargeIPhpone() {
        chargeMotoGPhone();
    }

}
