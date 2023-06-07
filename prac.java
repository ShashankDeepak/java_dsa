public class prac {

  public static void main(String[] args) {
    String s1 = "A man, a plan, a canal: Panama";

    StringBuffer b = new StringBuffer(s1);

    for (int i = 0; i < b.length(); i++) {
      if (!Character.isLetterOrDigit(b.toString().charAt(i))) {
        b.deleteCharAt(i);
      }
    }
    System.out.println(b.toString().toLowerCase().replaceAll(" ", ""));
    System.out.println(
      b.reverse().toString().toLowerCase().replaceAll(" ", "")
    );
  }
}
