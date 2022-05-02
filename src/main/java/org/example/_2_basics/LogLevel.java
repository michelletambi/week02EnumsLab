package org.example._2_basics;

public enum LogLevel {
    DEBUG ("It's DEBUG!", false),
    INFO ("It's INFO!", false),
    WARNING ("It's WARNING!", true);

    private final String displayName;
    private final boolean sendSMSToAdmin;

    //constructor
    LogLevel(String displayName, boolean sendSMSToAdmin) {
        this.displayName = displayName;
        this.sendSMSToAdmin = sendSMSToAdmin;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public boolean isSendToAdmin() {
        return this.sendSMSToAdmin;
    }

}
