import java.util.List;

public class Main {


    public static void main(String[] args) {
        DesktopSearch ds = new DesktopSearch();
        Index i = new Index();
        PlainTextCollector c1 = new PlainTextCollector();
        DefaultCollector d = new DefaultCollector();
        ResourceType rt = new ResourceType("", c1);
        Resource res = new Resource("hahaha", "", rt);
        ds.registerResource(res);
//        ds.registerType("rt", rt);


    }
}
