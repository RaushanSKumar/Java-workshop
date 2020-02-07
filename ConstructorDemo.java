public class ConstructorDemo {

    ConstructorDemo(){
            System.out.println("default Constructor");


    }

    ConstructorDemo(int a){
        System.out.println("Constructor" +a);
    }

    public static void main(String args[])
    {
ConstructorDemo cd= new ConstructorDemo();
        ConstructorDemo cd1= new ConstructorDemo(10);
    }
    }