public class String {
   public static void main(String[] args){
    String mname = "mouse";
    System.out.println(mname.length());
    System.out.println(mname.substring(0, 2)); // mo
    System.out.println(mname.substring(3, 5)); // se
    System.out.println(mname.substring(0, 2) + mname.substring(3, 5)); // mose
   }
}
