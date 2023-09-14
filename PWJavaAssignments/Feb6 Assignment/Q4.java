//WAP to sort string alphabetically.
public class Q4 {
  public static void main(String[] args) {
    String s = "gfedcba";
    char c[] = s.toCharArray();
    for(int i=0 ; i<c.length-1;i++)
    {
      for(int j=i+1 ; j<c.length;j++){
        char temp =' ';
          if (c[i]>c[j]) {
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
          }
      }
    }

    System.out.println(new String(c));
  }  
}
