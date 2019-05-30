package com.lambton.hardware;

public class Mobile extends Computer {

    private String operatingSystem;
    private boolean canMakeCall;
    private String providerName;

    public Mobile(){

    }

    /**
     *
     * @param operatingSystem
     * @param canMakeCall
     * @param providerName
     */
    public Mobile(String operatingSystem, boolean canMakeCall, String providerName) {
        this.operatingSystem = operatingSystem;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    /**
     *
     * @param id
     * @param manufacturerName
     * @param operatingSystem
     * @param canMakeCall
     * @param providerName
     */
    public Mobile(int id, String manufacturerName, String operatingSystem, boolean canMakeCall, String providerName) {
        super(id, manufacturerName);
        this.operatingSystem = operatingSystem;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

}
