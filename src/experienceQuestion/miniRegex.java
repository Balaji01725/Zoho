package experienceQuestion;

public class miniRegex {
    public static void main(String[] args) {
        String text = "abcbcbabb";
        String pattern = "cb*ab+";
        System.out.println(findRegex(text, pattern));

    }
    static String findRegex(String text, String pattern){
        for(int i = 0; i < text.length(); i++){
            int t = i, p = 0;

            while(t < text.length() && p < pattern.length()){

                char pc = pattern.charAt(p);

                if(p + 1 < pattern.length() && pattern.charAt(p+1) == '*' ){
                    while(t < text.length() && text.charAt(t) == pc) t++;
                    p+=2;
                }else if(p + 1 < pattern.length() && pattern.charAt(p+1) == '+'){
                    if(text.charAt(t) != pc) break;
                    while(t < text.length() && text.charAt(t) == pc) t++;
                    p+=2;
                }
                else{
                    if(text.charAt(t) != pc) break;
                    t++;
                    p++;
                }
            }
            if(p == pattern.length()){
                return text.substring(i, t);
            }
        }
        return " No Match";
    }
}
