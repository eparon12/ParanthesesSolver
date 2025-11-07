public class ParanthesesSolver{
    public static void main(String args[]){

    }
    public static boolean Solver(String s){
        boolean isValid = false;
        int curlyAmountOpen = 0;
        int squareAmountOpen = 0;
        int normalAmountOpen = 0;
        int curlyAmountClose = 0;
        int squareAmountClose = 0;
        int normalAmountClose = 0;
        for(int i = 0; i < s.length(); i++){
            String _letter = s.substring(i, i+1);
            if(_letter == "["){
                squareAmountOpen++;
            } 
            else if(_letter == "]" ){
                squareAmountClose++;
            }
            else if(_letter == "("){
                normalAmountOpen++;
            } 
            else if(_letter == ")" ){
                normalAmountClose++;
            }
            else if(_letter == "{"){
                curlyAmountOpen++;
            }
            else if(_letter == "}" ){
                curlyAmountClose++;
            }
            
        }
        if(curlyAmountClose != curlyAmountOpen || normalAmountClose != normalAmountOpen || squareAmountClose != squareAmountOpen){
            return isValid;
        }
        for(int i = 0; i< s.length; i++){
            String _letter = s.substring(i, i+1);
            if "{[(".contains(_letter)
        }
        return isValid;
    }
}