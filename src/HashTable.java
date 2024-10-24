import java.util.LinkedList;

// A custom hash table class to store symbols
public class HashTable {
    private static final int SIZE = 100;
    private LinkedList<Symbol>[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function: generates an index based on the identifier's hash code
    private int hash(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // Insert a symbol into the hash table
    public void insert(Symbol symbol) {
        int index = hash(symbol.identifier);
        table[index].add(symbol);
    }

    // Find a symbol by its identifier
    public Symbol find(String identifier) {
        int index = hash(identifier);
        for (Symbol symbol : table[index]) {
            if (symbol.identifier.equals(identifier)) {
                return symbol;
            }
        }
        return null; // Not found
    }
}
