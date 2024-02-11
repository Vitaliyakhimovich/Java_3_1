package main.clients;
@FunctionalInterface
public interface Swimable {
    void toSwim() ;
    default double getSwimSpeed(){
        return 20;
    }

}
