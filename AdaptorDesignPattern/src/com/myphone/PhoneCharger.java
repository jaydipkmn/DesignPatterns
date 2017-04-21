package com.myphone;

public class PhoneCharger {

    private IPhoneCharger icharge;
    
    public IPhoneCharger getIcharge() {
        return icharge;
    }

    public void setIcharge(IPhoneCharger icharge) {
        this.icharge = icharge;
    }

    public void chargeMyPhone()
    {
        icharge.chargeIPhpone();
    }
}
