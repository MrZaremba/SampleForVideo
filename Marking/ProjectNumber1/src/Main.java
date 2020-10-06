public class Main {
    //Code your problem number one here
    static int problemOne(String s){
        int answer = 0;
        for (int i = 0; i < s.length(); i++){ //for loop moves "i" by one to scan for a, e, i, o, or u
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                answer++;
            } //if a, e, i, o, u is one of the characters in the string, answer is added by one for every vowel found
        }
        System.out.println("Number of vowels: " + answer);
        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        int pos = 0;

        for(int i = 0; i < (s.length()-2); i++){ //for loop goes until it hits 2 characters before the end of string s (so no out of bounds error)
            String scan = s.substring(pos, pos+3); //we scan string s in sections of 3 characters at a time starting from index 0-3
            if(scan.equals("bob")){ //if section scanned = bob, answer goes up by one, section scanned moves forward by one letter
                answer++;
                pos++;
            }
            else{ //if section scanned != bob, section scanned moves forward by one letter
                pos++;
            } //finishing either paths we move our section we scan for bob by one letter
        }
        System.out.println("Number of times bob occurs is: " + answer);
        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s){

        StringBuilder newest = new StringBuilder();
        String longest = ("");
        char previous = 0; //is the char behind current char

        for (int i = 0; i < s.length(); i++){ //for loop goes until current hits last letter of given string
            char current = s.charAt(i);
            if (current >= previous){ //testing current character against previous letter
                newest.append(current); //if current char follows alphabetical order, add to built string
                previous = current; //current char becomes previous char (shifts by one)
                if (i == s.length()){ //break out of loop before current goes out of bounds
                    break;
                }
            }
            else{ //when current doesnt follow alphabetical order, newest string stops building, tests against longest string
                if (newest.length() > longest.length()){ //if newest string is longer than longest string it becomes longest string
                    longest = newest.toString();
                }
                newest = new StringBuilder(); //newest string resets, empty for new streak
                i--;
                previous = current; //goes back to rejected current char
            }
        }
        if (newest.length() > longest.length()){
            longest = newest.toString();
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
        return longest;
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
