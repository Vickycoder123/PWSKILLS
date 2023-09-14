////WAP to implement panagram checking least inbuilt method being used.
public class Q6 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over a lazy dog";
        s=s.replace(" ", "");
        s=s.toLowerCase();
        int array[] = new int[26];
        for(int i=0;i<s.length();i++){
            int k = s.charAt(i)-97;
            array[k]=1;
        }
        boolean flag = true;
        for (int i : array) {
            if (i!=1)
                flag=false;
        }

        if (flag) {
            System.out.println("Panagram String");
        } else {
            System.out.println("Not panagram string");
        }

    }
}
