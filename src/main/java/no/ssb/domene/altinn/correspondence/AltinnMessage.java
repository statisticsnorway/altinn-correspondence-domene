package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.*;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;


/**
 * Created by runesr on 28.06.2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reportee",
        "messageReference",
        "messageHeader",
        "messageSummary",
        "attachments",
        "notifications",
        "languageCode",
        "sdpOption"
})
@XmlRootElement(name = "AltinnMessage")
public class AltinnMessage {
    private String reportee;
    private String messageReference;
    private String messageHeader;
    private String messageSummary;
    @XmlElementWrapper
    @XmlElement(name = "attachment")
    private List<Attachment> attachments = newArrayList();
    @XmlElementWrapper
    @XmlElement(name = "notification")
    private List<Notification> notifications = newArrayList();
    private LanguageCode languageCode;
    private String sdpOption; //null, CopyAltinn eller ForwardOnly


    public String getReportee() {return reportee;}

    public void setReportee(String reportee) {this.reportee = reportee;}

    public String getMessageReference() {return messageReference;}

    public void setMessageReference(String messageReference) {this.messageReference = messageReference;}

    public String getMessageHeader() {return messageHeader;}

    public void setMessageHeader(String messageHeader) {this.messageHeader = messageHeader;}

    public String getMessageSummary() {return messageSummary;}

    public void setMessageSummary(String messageSummary) {this.messageSummary = messageSummary;}

    public List<Attachment> getAttachments() {return attachments;}

    public void setAttachments(List<Attachment> attachments) {this.attachments = attachments;}

    public void addAttachment(Attachment attachment) {this.getAttachments().add(attachment);}

    public List<Notification> getNotifications() {return notifications;}

    public void setNotifications(List<Notification> notifications) {this.notifications = notifications;}

    public void addNotification(Notification notification) {this.notifications.add(notification);}

    public LanguageCode getLanguageCode() {return languageCode;}

    public void setLanguageCode(LanguageCode languageCode) {this.languageCode = languageCode;}

    public String getSdpOption() { return sdpOption; }

    public void setSdpOption(String sdpOption) { this.sdpOption = sdpOption; }

    public boolean isReporteePerson() {
        return reportee.length() == 11;
    }


    @Override
    public String toString() {
        return "AltinnMessage{" +
                "reportee='" + reportee + '\'' +
                ", messageReference='" + messageReference + '\'' +
                ", messageHeader='" + messageHeader + '\'' +
                ", messageSummary='" + messageSummary + '\'' +
                ", attachments=" + (attachments != null ? attachments.size() : "0") +
                ", notifications=" + (notifications != null ? "["+notifications.toString()+"]" : "") +
                ", languageCode=" + (languageCode != null ? languageCode.value() : "null") +
                ", sdpOption='" + sdpOption + '\'' +
                '}';
    }
}
