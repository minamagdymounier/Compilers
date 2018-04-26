package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Goal implements RootNode{

    private MainClass mainClass;
    private ClassDeclaration classDeclaration;
    
    public Goal() {
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        mainClass = new MainClass();
        classDeclaration = new ClassDeclaration();
        boolean x ;
        if(tokens.size()>=1)
        {
            if(mainClass.print(tokens))
            {
                do
                {   
                    x = classDeclaration.print(tokens);
                    if(!x) return false;
                }while(x);
               
                return true;
            }
        }
        return false;
    }
    
}
