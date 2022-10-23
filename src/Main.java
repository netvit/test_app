public class Main {

    public static void test(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        System.out.println("goodbye world");
        test();
        test2("crazy");
        test2("hello");
        test2("hello", "crazy");
        
        System.out.println("hello");

        new HelloFrame();
    }

    public static void test2(String sentence_start){
        System.out.println(sentence_start + ".");
    }

    public static void test2(String sentence_start, String sentence_end){
        System.out.println(sentence_start + sentence_end);

    }

}
