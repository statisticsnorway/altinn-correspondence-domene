package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.*;

/**
 * Created by runesr on 28.06.2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "notificationTemplateName",
        "notificationFromAddress",
        "notificationSMS",
        "notificationSubject",
        "notificationText",
        "transportType",
        "receiverAddress",
        "languageCode"
})
@XmlRootElement(name = "Notification")
public class Notification {
    private String notificationTemplateName;
    private String notificationFromAddress;
    private LanguageCode languageCode;
    private String notificationSMS;
    private String notificationSubject;
    private String notificationText;
    private String receiverAddress;
    private String transportType;



    public String getNotificationTemplateName() {return notificationTemplateName;}

    public void setNotificationTemplateName(String notificationTemplateName) {this.notificationTemplateName = notificationTemplateName;}

    public String getNotificationFromAddress() {return notificationFromAddress;}

    public void setNotificationFromAddress(String notificationFromAddress) {this.notificationFromAddress = notificationFromAddress;}

    public LanguageCode getLanguageCode() {return languageCode;}

    public void setLanguageCode(LanguageCode languageCode) {this.languageCode = languageCode;}

    public String getNotificationSMS() {
        return notificationSMS;
    }

    public void setNotificationSMS(String notificationSMS) {
        this.notificationSMS = notificationSMS;
    }

    public String getNotificationSubject() {
        return notificationSubject;
    }

    public void setNotificationSubject(String notificationSubject) {
        this.notificationSubject = notificationSubject;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationTemplateName='" + notificationTemplateName + '\'' +
                ", notificationFromAddress='" + notificationFromAddress + '\'' +
                ", languageCode=" + languageCode +
                ", notificationSMS='" + notificationSMS + '\'' +
                ", notificationSubject='" + notificationSubject + '\'' +
                ", notificationText='" + notificationText + '\'' +
                ", receiverAddress='" + receiverAddress + "\'" +
                ", transportType='" + transportType + '\'' +
                '}';
    }
}
