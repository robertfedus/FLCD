# Symbol Table Implementation in Java

This project implements a **Symbol Table** using a custom **hash table** in Java. The symbol table is designed to store information about identifiers (variables or constants) used in a mini-language. Each identifier has a type (e.g., `int`, `float`, `string`) and an associated value.

## Features
- **Symbol Management**: Add and retrieve symbols (identifiers) along with their types and values.
- **Custom Hash Table**: Implements a hash table from scratch with separate chaining to handle collisions.

## How It Works
The symbol table uses a hash table to store and look up identifiers efficiently. Each identifier has:
- A **type**: such as `int`, `float`, `string`.
- A **value**: the actual data stored for the identifier.

### Classes Overview

1. **Symbol Class**:
    - Represents a single symbol entry.
    - Contains an `identifier`, `type`, and `value`.

2. **HashTable Class**:
    - Custom hash table implementation.
    - Uses separate chaining (linked lists) for collision handling.
    - Methods:
        - `insert(Symbol symbol)`: Inserts a symbol into the table.
        - `find(String identifier)`: Finds a symbol by its identifier.

3. **SymbolTable Class**:
    - Provides an interface to add and retrieve symbols.
    - Methods:
        - `addSymbol(String identifier, String type, Object value)`: Adds a new symbol.
        - `getSymbol(String identifier)`: Retrieves a symbol by its identifier.

### Usage

You can use the `SymbolTable` to store and retrieve symbols for your mini-language or compiler project.

### Example

```java
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
        System.out.println(symbolTable.getSymbol("x"));  // Output: Symbol{id='x', type='int', value=10}
        System.out.println(symbolTable.getSymbol("y"));  // Output: Symbol{id='y', type='float', value=3.14}
        System.out.println(symbolTable.getSymbol("_counter"));  // Output: Symbol{id='_counter', type='int', value=42}
        System.out.println(symbolTable.getSymbol("name"));  // Output: Symbol{id='name', type='string', value=John Doe}
        System.out.println(symbolTable.getSymbol("nonexistent"));  // Output: null (not found)
    }
}
```
