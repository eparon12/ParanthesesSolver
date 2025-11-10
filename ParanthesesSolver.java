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
    public static boolean Solver(String s){
        
        for(int i = 0; i< s.length(); i++){
            boolean starter = false;
            String _letter = s.substring(i, i+1);
            String _letterClose = "";

            if(_letter.equals("{")){
                _letterClose = "}";
                starter = true;
            }
            else if(_letter.equals("[")) {
                _letterClose = "]";
                starter = true;
            }
            else if(_letter.equals("(")){
                _letterClose = ")";
                starter = true;
            }
            int _inbetween = -1;
            if(starter == true){
                System.out.println(_letter);
                for(int j = i; j < s.length(); j++){
                    if(s.substring(j, j+ 1).equals(_letterClose)){
                        _inbetween = j - i;
                        break;
                    }

                }
                if(_inbetween % 2 == 0 || _inbetween == -1){
                    System.out.println(_inbetween);
                    return false;
                }
            }
            
            

            
        }
        return true;
    }
}