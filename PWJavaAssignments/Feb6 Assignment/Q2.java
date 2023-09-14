//WAP to reverse a string.
public class Q2 {
    public static void main(String[] args) {
        String inpuString = "PWSKILLS";
        String outpuString = "";
        for(int i=inpuString.length()-1 ; i>=0 ;i--){
            outpuString = outpuString+inpuString.charAt(i);
        }

        System.out.println(outpuString);
    }
}
