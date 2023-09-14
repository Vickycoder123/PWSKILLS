//WAP to find maximum occuring character in string
public class Q8 {
    public static void main(String[] args) {
        String s="javaprogram";
        int array[] = new int[127];
        for(int i=0;i<s.length();i++)
        {
            array[s.charAt(i)] = array[s.charAt(i)]+1;
        }

        int max = 0;
        char ch = ' ';
       for(int i=0;i<s.length();i++){
            if (max<array[s.charAt(i)]) {
                max = array[s.charAt(i)];
                ch = s.charAt(i);
            }
       }
       System.out.println(ch+" occured "+max+" times");
    }
}
