package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.*;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;


/**
 * Created by rsa on 01.10.2019.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "commonNotification",
        "reportees"
})

@XmlRootElement(name = "AltinnNotification")
public class AltinnNotification {
    private CommonNotification commonNotification;
    @XmlElementWrapper
    @XmlElement(name = "reportees")
    private List<NotificationReportee> reportees = newArrayList();

    public CommonNotification getCommonNotification() {
        return commonNotification;
    }

    public void setCommonNotification(CommonNotification commonNotification) {
        this.commonNotification = commonNotification;
    }

    public List<NotificationReportee> getReportees() {
        return reportees;
    }

    public void setReportees(List<NotificationReportee> reportees) {
        this.reportees = reportees;
    }

    @Override
    public String toString() {
        return "AltinnNotification{" +
                "commonNotification=" + (commonNotification != null ? commonNotification.toString() : null) +
                ", reportees=" + (reportees != null ? reportees.size() : null) +
                '}';
    }
}

