public class IsSubsequence {
  public static boolean isSubsequence(String s, String t) {
    // if s is subsequence of t return true
    // else false
    if (t.contains(s)){
      return true;
    }
    int count = 0;
    int j = 0;
    for (int i=0; i < t.length(); i++){
        if (s.charAt(j) == (t.charAt(i))){
          count++;
          j++;
        }
    }
   return count == s.length();
}

  public static void main(String[] args) {
   String s = "acb";
   String t = "ahbgdc";
   System.out.println(isSubsequence(s,t));
  }
}
