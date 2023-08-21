package Facade;

import Facade.Compiler.CodeGenerator;
import Facade.Compiler.CompileFailedException;
import Facade.Compiler.Parser;
import Facade.Compiler.Scanner;

public class CompilerFacade {
    Scanner scanner;
    Parser parser;
    CodeGenerator generator;

    public CompilerFacade(){
        this.scanner = new Scanner();
        this.parser = new Parser();
        this.generator = new CodeGenerator();
    }
    public CompilerFacade(Scanner scanner, Parser parser, CodeGenerator generator){
        this.scanner = scanner;
        this.parser = parser;
        this.generator = generator;
    }

    String compile(String code) throws CompileFailedException {
        if(scanner.scan(code)){
            String parsedCode = parser.parse(code);
            System.out.println("Parsed Code -->" + parsedCode);

            String generatedCode = generator.generate(parsedCode);
            System.out.println("Generated Code -->" + generatedCode);

            return generatedCode;
        }

        throw new CompileFailedException();
    }
}
