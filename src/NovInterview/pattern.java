    package NovInterview;

    import java.util.ArrayList;
    import java.util.List;

    public class pattern {
        public static void main(String[] args) {
            String s = "EXAMPLE";
            s = reverse(s);
            patterns(s);
        }
        //Reverse
        static String reverse(String s){
            char[] str = s.toCharArray();
            int left = 0;
            int right = s.length()-1;
            while(left <= right){
                if(left % 2 != 0 && right % 2 != 0){
                    char temp = str[left];
                    str[left] = str[right];
                    str[right] = temp;
                    left++;
                    right--;
                }else{
                    left++;
                    right--;
                }
            }
            return String.valueOf(str);
        }
        //Logic
        static void patterns(String s){
            int left = 0;
            int right = s.length()-1;
            int mid = (left + right)/2;

            char[][] matrix = new char[mid+1][s.length()];
            for(int i = mid ; i >= 0; i--){
                if(left <= right){
                    matrix[i][left] = s.charAt(left++);
                    matrix[i][right] = s.charAt(right--);
                }
            }
            List<Character> list = new ArrayList<>();
            for(char c : s.toCharArray()){
                list.add(c);
            }
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(list.contains(matrix[i][j])){
                        System.out.print(matrix[i][j]+" ");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
