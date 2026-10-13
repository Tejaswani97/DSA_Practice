import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("",0,0,n,result);
        return result;
    }
    private void generate(String curr,int open,int close,int n, List<String>result){
        if(curr.length()==2*n){
            result.add(curr);
            return;
        }
        if(open<n){
            generate(curr+"(",open+1,close,n,result);
        }
        if(close<open){
            generate(curr+")",open,close+1,n,result);
        }
    }
}
