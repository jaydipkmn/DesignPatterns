package com.myphone;

import com.android.MotoGCharger;

public class AndroidToIphoneChargerAdaptor implements IPhoneCharger {

    MotoGCharger mgcharger = new MotoGCharger();
    @Override
    public void chargeIPhpone() {
        mgcharger.chargeMotoGPhone();
    }

}
