package MainPackage.JavaBasics.constructor;

public class ConstructorWithMethod { // use MainPackage.JavaBasics.constructor to perform initialization of object
     public void method1(String a, String b){  // method is non-static
        System.out.println(a+ " "+b);
    }
        ConstructorWithMethod(int c, String d){
        System.out.println(c+" "+d);
    }
    public static void main(String[] args){
        ConstructorWithMethod p1 = new ConstructorWithMethod(103,"Pankaj");
         p1.method1("Number","Name");// if method is non-static, we have to create reference object
        new ConstructorWithMethod(101,"Sumit");
        new ConstructorWithMethod(102,"Bhavika");
    }
}
