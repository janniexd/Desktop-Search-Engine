import java.util.*;

public class DesktopSearch {
    private Map<String,ResourceType> types = new HashMap<>();
    private Index index = new Index();
    private List<Resource> resources;

    public DesktopSearch(){}

    public void registerType(String extension, ResourceType type){types.put(extension, type);}

    public ResourceType getType(String extension){return types.get(extension);}

    public void unregisterType(String extension){types.remove(extension);}

    public void registerResource(Resource res){
        //if(res == null) throw new NullPointerException();
        index.add(res);

    }

    public List<Resource> processRequest(String request){
//        if(request == null) throw new NullPointerException();
//        if(request.isEmpty()) throw new IllegalArgumentException();
        return index.getResources(request);
    }
}
