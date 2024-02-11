package main.clients;
@FunctionalInterface
public interface Goable {
//    public static final List<Integer> pi = new ArrayList<>();
    void toDo();
    default double getRunSpeed(){
        return 10;
    }
}

