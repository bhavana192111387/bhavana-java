import java.util.ArrayList;
public class Demo{
   static boolean is_present(String my_str, ArrayList<String> rem){
      for (String str : rem){
         if (str.equals(my_str))
         return true;
      }
      return false;
   }
   static ArrayList<String> distinct_pattern(String str){
      if (str.length() == 0){
         ArrayList<String> base_Val = new ArrayList<>();
         base_Val.add("");
         return base_Val;
      }
      char ch = str.charAt(0);
      String rem_str = str.substring(1);
      ArrayList<String> prev_str = distinct_pattern(rem_str);
      ArrayList<String> rem = new ArrayList<>();
      for (String my_str : prev_str){
         for (int i = 0; i <= my_str.length(); i++){
            String f = my_str.substring(0, i) + ch + my_str.substring(i);
            if (!is_present(f, rem))
            rem.add(f);
         }
      }
      return rem;
   }
   public static void main(String[] args){
      String my_str = "mnqm";
      System.out.println("The distinct permutations of the string are ");
      System.out.println(distinct_pattern(my_str));
   }
}