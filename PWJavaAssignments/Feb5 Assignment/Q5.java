//WAP to implement anagram checking least inbuilt method being used.
public class Q5 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length()!=s2.length()) {
            System.out.println("not anagram");
        }
        else{
        int countArray[] = new int[256];
        for(int i=0;i<s1.length();i++){
            countArray[s1.charAt(i)]++;
            countArray[s2.charAt(i)]--;
        }
        boolean flag=true;
        for(int i=0;i<countArray.length;i++){
            if (countArray[i]!=0) {
                flag=false;
            }
        }
        if (flag==true) {
            System.out.println("Anagram String");
        } else {
            System.out.println("Not anagram String");
        }
    }
    }
}
