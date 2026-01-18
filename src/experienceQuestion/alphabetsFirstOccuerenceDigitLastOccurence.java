package experienceQuestion;

public class alphabetsFirstOccuerenceDigitLastOccurence {
    public static void main(String[] args) {
        String s = "a1b2c34c3b2cb3a1d";
        reArrangeAlphabets(s);
    }
    static void reArrangeAlphabets(String s){
        char[] str = s.toCharArray();

        int[] lastDigitIndex = new int[10];

        for(int i = 0; i < 10; i++) lastDigitIndex[i] = -1;

        for(int i = 0; i < str.length; i++){
            if(str[i] >= '0' && str[i] <= '9'){
                lastDigitIndex[str[i] - '0'] =  i;
            }
        }
        boolean[] alphaSeen = new boolean[26];
        int write = 0;

        for(int i = 0; i < str.length; i++){
            char c = str[i];

            if(c >= 'a' && c <= 'z'){
                if(!alphaSeen[c - 'a']){
                    alphaSeen[c - 'a'] = true;
                    str[write++] = c;
                }
            }
            else if(c >= '0' && c <= '9'){
                if(lastDigitIndex[c - '0'] == i){
                    str[write++] = c;
                }
            }
        }
        for(int i = 0; i < write; i++){
            System.out.print(str[i]+" ");
        }
    }
}
