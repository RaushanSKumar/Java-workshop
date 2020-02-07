public class stringbbdemo {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Hello");
        buffer.append("java");
        System.out.println(buffer);


        StringBuilder builder=new StringBuilder("Hello");
        builder.append("java");
        System.out.println(builder);

    }
}
