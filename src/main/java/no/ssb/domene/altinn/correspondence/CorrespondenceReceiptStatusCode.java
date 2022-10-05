package no.ssb.domene.altinn.correspondence;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by runesr on 12.08.2016.
 */
@XmlType(name = "CorrespondenceReceiptStatusCode")
@XmlEnum
public enum CorrespondenceReceiptStatusCode {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    OK("OK"),
    @XmlEnumValue("UnexpectedError")
    UNEXPECTED_ERROR("UnexpectedError"),
    @XmlEnumValue("ValidationFailed")
    VALIDATION_FAILED("ValidationFailed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved");

    CorrespondenceReceiptStatusCode(String value) {
    }
}
