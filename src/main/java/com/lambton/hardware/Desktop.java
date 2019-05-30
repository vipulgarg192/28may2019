package com.lambton.hardware;


public class Desktop extends Computer {

    private int keyboardCompanyName;
    private String screenType;

    public Desktop() {
    }

    /**
     *
     * @param keyboardCompanyName
     * @param screenType
     */
    public Desktop(int keyboardCompanyName, String screenType) {
        this.keyboardCompanyName = keyboardCompanyName;
        this.screenType = screenType;
    }

    /**
     *
     * @param id
     * @param manufacturerName
     * @param keyboardCompanyName
     * @param screenType
     */
    public Desktop(int id, String manufacturerName, int keyboardCompanyName, String screenType) {
        super(id, manufacturerName);
        this.keyboardCompanyName = keyboardCompanyName;
        this.screenType = screenType;
    }

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
