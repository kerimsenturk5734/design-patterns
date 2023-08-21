package Facade;

import Facade.Compiler.CodeGenerator;
import Facade.Compiler.CompileFailedException;
import Facade.Compiler.Parser;
import Facade.Compiler.Scanner;

public class Run {
    public static void main(String[] args) throws CompileFailedException {
        //If you want you can give as parameter your scanner, parser, generator by using constructor.
        //CompilerFacade compilerFacade = new CompilerFacade(new Scanner(), new Parser(), new CodeGenerator());
        CompilerFacade compilerFacade = new CompilerFacade();

        String myGoCode = """
                var price float32 = 10.5
                \tvar off int = 10

                \tfmt.Printf("Value: %v, Type: %T \\n", price, price)
                \tfmt.Printf("Value: %v, Type: %T \\n", off, off)""";

        //I don't have to know other processes behind of compile func.
        String compiledCode = compilerFacade.compile(myGoCode);

        System.out.println("Compiled Code -->" + compiledCode);
    }
}
