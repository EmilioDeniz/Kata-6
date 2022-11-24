package kata;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Phonetic {
    public String text;
    public String audio;
    public String sourceUrl;
    public License license;

    @Override
    public String toString() {
        return "Phonetic: " + "text=" + text + ", audio=" + audio + ", sourceUrl=" + sourceUrl + ", license=" + license;
    }
    
    
    public static class License {
        public String name;
        public String url;

        @Override
        public String toString() {
            return "License: " + "name=" + name + ", url=" + url;
        }
        
        
    }

}
