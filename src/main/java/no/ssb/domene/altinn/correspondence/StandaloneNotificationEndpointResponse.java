package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by rsa on 04.10.2019.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "receiverAddress",
        "transportType",
        "retrieveFromProfile"
})
@XmlRootElement(name = "standaloneNotificationEndpointResponse")
public class StandaloneNotificationEndpointResponse {
    private String name;
    private String receiverAddress;
    private String transportType;
    private String retrieveFromProfile;

    public StandaloneNotificationEndpointResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getRetrieveFromProfile() {
        return retrieveFromProfile;
    }

    public void setRetrieveFromProfile(String retrieveFromProfile) {
        this.retrieveFromProfile = retrieveFromProfile;
    }


    @Override
    public String toString() {
        return "StandaloneNotificationEndpointResponse {" +
                "name='" + name + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", transportType='" + transportType + '\'' +
                ", retrieveFromProfile='" + retrieveFromProfile + '\'' +
                '}';
    }
}


