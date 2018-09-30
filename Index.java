import java.util.*;

public class Index{
    private Map<String, List<Resource>> index;

    public Index(){
        index = new HashMap<String, List<Resource>>();
    }

    public void add(Resource res){
        Set<String> set = new HashSet<>();
        KeywordCollector collector = res.getType().getCollector();
        set = collector.getKeywords(res);
        System.out.println("index initialized");

        for (String keyword : set) {
            if(index.containsKey(keyword)){
                if(index.get(keyword).contains(res)){
                    return;
                }
                List<Resource> temp = index.get(keyword);
                temp.add(res);
                index.put(keyword, temp);
            }else{
                List<Resource> temp = new ArrayList<Resource>();
                temp.add(res);
                index.put(keyword, temp);
            }
        }
    }

    public List<Resource> getResources(String keyword){
        if(keyword == null) throw new NullPointerException();
        if(!index.containsKey(keyword)) return new ArrayList<Resource>();
        return index.get(keyword);
    }

}
