public class Main {
    public static void main(String[] args) {
        // Create a symbol table
        SymbolTable symbolTable = new SymbolTable();

        // Add some symbols
        symbolTable.addSymbol("x", "int", 10);
        symbolTable.addSymbol("y", "float", 3.14);
        symbolTable.addSymbol("_counter", "int", 42);
        symbolTable.addSymbol("name", "string", "John Doe");

        // Retrieve and print the symbols
        System.out.println(symbolTable.getSymbol("x"));
        System.out.println(symbolTable.getSymbol("y"));
        System.out.println(symbolTable.getSymbol("_counter"));
        System.out.println(symbolTable.getSymbol("name"));
        System.out.println(symbolTable.getSymbol("nonexistent"));
    }
}