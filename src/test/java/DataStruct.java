import java.util.HashSet;

public class DataStruct {
    public void main(String[] args) {
        System.out.println("hello");
    }
}

class HashSetTest {
    void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("G");
        sites.add("o");
        sites.remove("o");
        System.out.println(sites);
    }
}