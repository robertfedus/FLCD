// A class representing a single symbol (identifier, type, and value)
public class Symbol {
    String identifier;
    String type;  // E.g., int, float, string
    Object value; // Can hold any type (Integer, String etc.)

    public Symbol(String identifier, String type, Object value) {
        this.identifier = identifier;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Symbol{id='" + identifier + "', type='" + type + "', value=" + value + "}";
    }
}
