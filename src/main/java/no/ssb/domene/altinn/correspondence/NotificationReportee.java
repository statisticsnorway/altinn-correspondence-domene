package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.*;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;


/**
 * Created by rsa on 01.10.2019.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reportee",
        "receiverAddress",
        "languageCode",
        "serviceCode",
        "serviceEditionCode",
        "notificationSMS",
        "notificationSubject",
        "notificationText"
})

@XmlRootElement(name = "NotificationReportee")
public class NotificationReportee {
    private String reportee;
    private String receiverAddress;
    private LanguageCode languageCode;
    private String serviceCode;
    private String serviceEditionCode;
    private String notificationSMS;
    private String notificationSubject;
    private String notificationText;

    public String getReportee() {
        return reportee;
    }

    public void setReportee(String reportee) {
        this.reportee = reportee;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceEditionCode() {
        return serviceEditionCode;
    }

    public void setServiceEditionCode(String serviceEditionCode) {
        this.serviceEditionCode = serviceEditionCode;
    }


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

    @Override
    public String toString() {
        return "NotificationReportee{" +
                "reportee='" + reportee + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", languageCode=" + languageCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", serviceEdition='" + serviceEditionCode + '\'' +
                ", notificationSMS='" + notificationSMS + '\'' +
                ", notificationSubject='" + notificationSubject + '\'' +
                ", notificationText='" + notificationText + '\'' +
                '}';
    }
}
