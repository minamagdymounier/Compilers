package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class INTEGER_LITERAL  implements RootNode{

    private String int_literal;
    private EXP_DASH exp_dash;

    public INTEGER_LITERAL() {
        int_literal = "INTEGRAL_LITERAL";
        exp_dash = new EXP_DASH();
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=2){
            if(tokens.peek().getToken().equals(int_literal)){
                System.out.print(tokens.poll().getValue()+" ");
                exp_dash.print(tokens); 
                return true;
            }   
        }
        return false;
    }
    
}