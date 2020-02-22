package by.pvt.secure;

public final class Singleton {

    static {
        System.setSecurityManager(new SecurityManager()){

        }
    }

    private static volatile Singleton singleton;

    private  Singleton(){

    }

    public static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
