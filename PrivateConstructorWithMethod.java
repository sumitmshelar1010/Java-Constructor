package MainPackage.JavaBasics.constructor;

public class PrivateConstructorWithMethod {
     private PrivateConstructorWithMethod(){ // we can't access that MainPackage.JavaBasics.constructor in other class because
         // of private access MainPackage.JavaBasics.operators.modifier
        int a = 500;
        int b=200;
        System.out.println(a);
        System.out.println(b);
    }
   public  void method3(int b){ //We can not access this Not static method outside the class
       System.out.println(b);
   }
   public static void main(String[] args){
       new PrivateConstructorWithMethod();
       PrivateConstructorWithMethod a = new PrivateConstructorWithMethod();
       a.method3(100);


   }
}

