import java.util.*;

public class ResourceType {
    String description;
    KeywordCollector collector;

    public ResourceType(String desc, KeywordCollector collector){
        if(desc == null) throw new NullPointerException();
        if(desc.isEmpty()) throw new IllegalArgumentException();
        if(collector == null) throw new NullPointerException();
        this.description = desc;
        this.collector = collector;
    }

    public String getDescription() {
        return description;
    }

    public KeywordCollector getCollector(){
        return collector;
    }
}


