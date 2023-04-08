package MainPackage.JavaBasics.constructor;

public class PrivateConstructor { //IF WE USE PRIVATE CONSTRUCTOR THEN NO NEED TO CREATE AN OBJECT

    private PrivateConstructor(int a){
        System.out.println(a);
    }
    public static void main(String[] args){
        new PrivateConstructor(50);
        new PrivateConstructor(100);
        new PrivateConstructor(150);
    }
}

