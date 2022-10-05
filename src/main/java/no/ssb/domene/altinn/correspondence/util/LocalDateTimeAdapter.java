package no.ssb.domene.altinn.correspondence.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Override
    public LocalDateTime unmarshal(String dateString) throws Exception {
//        return LocalDateTime.parse(dateString, dtf);
        return LocalDateTime.parse(dateString);
    }
    @Override
    public String marshal(LocalDateTime localDateTime) throws Exception {
//        return localDateTime.format(dtf);
        return localDateTime.toString();
    }
}

