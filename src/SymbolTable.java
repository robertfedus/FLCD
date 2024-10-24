import java.util.LinkedList;

public class SymbolTable {
    private HashTable hashTable;

    public SymbolTable() {
        this.hashTable = new HashTable();
    }

    public void addSymbol(String identifier, String type, Object value) {
        Symbol symbol = new Symbol(identifier, type, value);
        hashTable.insert(symbol);
    }

    public Symbol getSymbol(String identifier) {
        return hashTable.find(identifier);
    }
}
