package com.anthony;

public class Main {

    public static void main(String[] args) {
        ITelephone antsPhone;
        antsPhone = new DeskPhone(123456789);

        antsPhone.powerOn();
        antsPhone.callPhone(123456789);
        antsPhone.answer();

        antsPhone = new MobilePhone(3534534);
        antsPhone.powerOn();
        antsPhone.callPhone(3534534);
        antsPhone.answer();
    }
}
