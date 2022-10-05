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
@XmlType(name = "", propOrder = {"standaloneNotificationResponses"})

@XmlRootElement(name = "standaloneNotificationResponseList")
public class StandaloneNotificationResponseList {
    private List<StandaloneNotificationResponse> standaloneNotificationResponses = new ArrayList<>();

    public List<StandaloneNotificationResponse> getStandaloneNotificationResponses() {
        return standaloneNotificationResponses;
    }

    public void setStandaloneNotificationResponses(List<StandaloneNotificationResponse> standaloneNotificationResponses) {
        this.standaloneNotificationResponses = standaloneNotificationResponses;
    }

    public void addStandaloneNotificationResponse(StandaloneNotificationResponse standaloneNotificationResponses) {
        this.standaloneNotificationResponses.add(standaloneNotificationResponses);
    }

    public void addAllStandaloneNotificationResponse(StandaloneNotificationResponseList standaloneNotificationResponseList) {
        this.standaloneNotificationResponses.addAll(standaloneNotificationResponseList.getStandaloneNotificationResponses());
    }

    @Override
    public String toString() {
        return "StandaloneNotificationResponseList{" +
                "standaloneNotificationResponses=" + (standaloneNotificationResponses != null ? standaloneNotificationResponses.size() : "null") +
                '}';
    }
}


