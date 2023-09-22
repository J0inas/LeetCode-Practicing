public class IsSubsequence {
  public static boolean isSubsequence(String s, String t) {
    // if s is subsequence of t return true
    // else false
    if (t.contains(s)){
      return true;
    }
    int count = 0;
    for (int i=0; i < s.length(); i++){
      for (int j=0; j < t.length(); j++){
        if (s.charAt(i) == (t.charAt(j))){
          count++;
          continue;
        }
      }
    }
    if (count == s.length()){
      return true;
    }
    else return false;
  }

  public static void main(String[] args) {
   String s = "abc";
   String t = "ahbgdc";
   System.out.println(isSubsequence(s,t));
  }
}
