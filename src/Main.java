public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Hello world!");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
