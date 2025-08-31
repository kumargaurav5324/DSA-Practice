package String;

public class Search {

    public static int searchCharacter(String str,  char ch){

        for(int  i =0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str= "england";
        char ch  = 'z';
        System.out.println(searchCharacter(str,ch));
    }
}
