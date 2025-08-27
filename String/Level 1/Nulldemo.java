public class Nulldemo {
    static void genEx(){
        String text=null;
        System.out.println(text.length());
    }
    static void handleEx(){
        String text=null;
        try{
            System.out.println(text.length());
        }catch(NullPointerException e){
            System.out.println("Handled: "+e);
        }
    }
    public static void main(String[] args){
        genEx();
        handleEx();
    }
}
