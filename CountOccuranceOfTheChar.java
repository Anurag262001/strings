import java.lang.reflect.Array;
import java.util.Arrays;

class CountOccuranceOfTheChar {
   public static void main(String[] args) {
      String str = "motuuuuuuujiuuuu";
      int count =0;
      for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='u'){
            count=count+1;
         }
      }
      System.out.println(count);
         
   }
}
