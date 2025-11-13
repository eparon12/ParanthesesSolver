/*
 * Author: Amir
 * Date created: 12/11/25
 * this class checks if the given string of parenthesis is valid, means all brackets close and in order and that code contains just brackets
 * An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */

public class ParanthesesSolver{
    public static void main(String args[]){
        System.out.println(Solver("(){}[]")); //true
        System.out.println(Solver("(]")); //false
        System.out.println(Solver("([{({})}])")); //true
        System.out.println(Solver("(([]){})")); //true
        System.out.println(Solver("{}[())()(]")); //false
        System.out.println(Solver("(){}{")); //false
        System.out.println(Solver("([)]")); //false
        System.out.println(Solver("([{}([)])]")); //false
        
    }

    /*
     * sorry for using your "beta" my initial idea was something to do with checking if the number between brackets is even, but that proved to be wrong fast so i tweaked it and i created some weird code which i couldnt understand anymore myself, i will plan better next time :/
     * precondition: s exists
     * postcondition: will return true or falsed based on if the string is valid or not (valid definition is on top)
     */
    public static boolean Solver(String s){
        int lastOpenerIndex = 0;
        String lastOpener;
        String closer = "";
        while(lastOpenerIndex > -1 && s.length() != 0){
            lastOpenerIndex = -1;
            for(int i = 0; i < s.length(); i++){
                
                String _letter = s.substring(i, i + 1);
                if(_letter.equals("{")){
                    lastOpenerIndex = i;
                    lastOpener = _letter;
                    closer = "}";
                }
                else if(_letter.equals("[")){
                    lastOpenerIndex = i;
                    lastOpener = _letter;
                    closer = "]";
                }
                else if(_letter.equals("(")){
                    lastOpenerIndex = i;
                    lastOpener = _letter;
                    closer = ")";
                }


            }
            
            if(lastOpenerIndex + 1 < s.length() && s.substring(lastOpenerIndex + 1, lastOpenerIndex + 2).equals(closer)){
                
                s = s.substring(0, lastOpenerIndex) + s.substring(lastOpenerIndex + 2, s.length());
            }
            else{
                return false;
                
            }
            
            

        }
        if(s.length() > 0){
            return false;
        }
        
        return true;
    }

}