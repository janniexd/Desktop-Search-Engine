import java.util.HashSet;
import java.util.Set;

public class PlainTextCollector implements KeywordCollector {
    @Override
    public Set<String> getKeywords(Resource res) {
        if(res == null) throw new NullPointerException();
        Set<String> set = new HashSet<>();
        TextFileIterator it = new TextFileIterator(res);
        while(it.hasNext()){
            set.add(it.next());
        }
        return set;
    }
}
