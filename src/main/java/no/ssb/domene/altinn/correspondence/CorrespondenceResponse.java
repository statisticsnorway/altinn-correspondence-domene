package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by runesr on 11.08.2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "receiptStatusCode",
        "receiptStatusText",
})
@XmlRootElement(name = "correspondenceResponse")
public class CorrespondenceResponse {
    private CorrespondenceReceiptStatusCode receiptStatusCode;
    private String receiptStatusText;

    public CorrespondenceReceiptStatusCode getReceiptStatusCode() {
        return receiptStatusCode;
    }

    public void setReceiptStatusCode(CorrespondenceReceiptStatusCode receiptStatusCode) {
        this.receiptStatusCode = receiptStatusCode;
    }

    public String getReceiptStatusText() {
        return receiptStatusText;
    }

    public void setReceiptStatusText(String receiptStatusText) {
        this.receiptStatusText = receiptStatusText;
    }
}
