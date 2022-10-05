package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rsa on 04.10.2019.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "notificationType",
        "reporteeNumber",
        "endpointResponses",
        "responseCode",
        "errorMessage"


})
@XmlRootElement(name = "standaloneNotificationResponse")
public class StandaloneNotificationResponse {
    private String notificationType;
    private String reporteeNumber;
    private List<StandaloneNotificationEndpointResponse> endpointResponses = new ArrayList<>();
    private String responseCode;
    private String errorMessage;

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getReporteeNumber() {
        return reporteeNumber;
    }

    public void setReporteeNumber(String reporteeNumber) {
        this.reporteeNumber = reporteeNumber;
    }

    public List<StandaloneNotificationEndpointResponse> getEndpointResponses() {
        return endpointResponses;
    }

    public void setEndpointResponses(List<StandaloneNotificationEndpointResponse> endpointResponses) {
        this.endpointResponses = endpointResponses;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        StringBuffer endpointResponsesString = new StringBuffer();
        endpointResponses.forEach(e -> {
            if (endpointResponsesString.length() > 0) {
                endpointResponsesString.append(",");
            }
            endpointResponsesString.append(e.toString());
        });
        return "StandaloneNotificationResponse {" +
                "notificationType=" + notificationType +
                ", reporteeNumber=" + reporteeNumber +
                ", endpoints: " + endpointResponsesString.toString() +
                ", responseCode=" + responseCode +
                ", errorMessage=" + errorMessage +
                '}';
    }
}


