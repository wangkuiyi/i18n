import java.lang.*;

public class UnicodeBlockExample {
   public static void main(String[] args) {
     System.out.println(Character.UnicodeBlock.of('\u20ac'));
     System.out.println(Character.UnicodeBlock.of('-'));
     System.out.println(Character.UnicodeBlock.of('='));
     System.out.println(Character.UnicodeBlock.of('Z'));
   }
}