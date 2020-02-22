package by.pvt;
@FunctionalInterface
public interface RandomIntGenerator {

    //int generate();

    Integer generate(int limit);

    default int getLimit(){
        return 100;
    }

}
