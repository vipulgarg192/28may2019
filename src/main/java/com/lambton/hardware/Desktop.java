package com.lambton.hardware;

public class Desktop extends Computer {

    private int keyboardCompanyName;
    private String screenType;

    public int getKeyboardCompanyName() {
        return keyboardCompanyName;
    }

    public void setKeyboardCompanyName(int keyboardCompanyName) {
        this.keyboardCompanyName = keyboardCompanyName;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

}
