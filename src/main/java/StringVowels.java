public class StringVowels {

    public int findVowelsInString(String input){
        int vowels = 0;
        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if((ch == 'a' ) || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')){
                ++vowels;
            }
        }
        return vowels;
    }
}
