import java.lang.reflect.Array;
import java.util.Arrays;

class AnagramOrNot {
   public static void main(String[] args) {
      String str = "motu";
      String str2 = "tumo";
      if(str.length()!=str2.length()){
         System.out.println("not anagram");
      }else{
      str.toLowerCase();
      str.toLowerCase();
      char arr[] = str.toCharArray();
      char arr2[] = str2.toCharArray();
      Arrays.sort(arr);
      Arrays.sort(arr2);
      if(Arrays.equals(arr2,arr)==true){
         System.out.println("anagram");
      }else{
         System.out.println("not the anagram");
      }

   }    
   }
}
