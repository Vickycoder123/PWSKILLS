//WAP to count vowels, consonants and special characters in string;
public class Q4 {
    public static void main(String[] args) {
        String inpuString = "java@pwskill";
        int vowelCnt = 0, consonantCnt=0, specialCnt=0;
        char ch[] = inpuString.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>=97 && ch[i]<=122) {
                if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
                    vowelCnt++;
                }else{
                    consonantCnt++;
                }
            }else{
                specialCnt++;
            }
        }
        System.out.println("vowel count "+vowelCnt);
        System.out.println("consonant count "+consonantCnt);
        System.out.println("special char count "+specialCnt);
    }
}