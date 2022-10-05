package no.ssb.domene.altinn.correspondence;

/**
 * Created by runesr on 06.07.2016.
 */
public enum LanguageCode {
    NORSK("1044"),
    NYNORSK("2068"),
    ENGELSK("1033");

    private String value;

    LanguageCode(String value) {this.value = value;}

    public String value() {
        return value;
    }
}
