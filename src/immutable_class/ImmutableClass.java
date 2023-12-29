package immutable_class;

import java.util.Objects;

public final class ImmutableClass {
    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Only provide getters, no setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Override hashCode and equals as needed

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImmutableClass other = (ImmutableClass) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}
