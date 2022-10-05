package no.ssb.domene.altinn.correspondence;

import no.ssb.domene.altinn.correspondence.util.LocalDateTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;


/**
 * Created by rsa on 01.10.2019.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "fromAddress",
        "notificationType",
        "sendDateTime",
        "transportType"
})

@XmlRootElement(name = "CommonNotification")
public class CommonNotification {
    private String fromAddress;
    private String notificationType;

    @XmlElement
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime sendDateTime;
    private String transportType;

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }


    public LocalDateTime getSendDateTime() {
        return sendDateTime;
    }

    public void setSendDateTime(LocalDateTime sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "CommonNotification{" +
                "notificationType='" + notificationType + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", sendDateTime=" + sendDateTime +
                ", transportType='" + transportType + '\'' +
                '}';
    }
}

