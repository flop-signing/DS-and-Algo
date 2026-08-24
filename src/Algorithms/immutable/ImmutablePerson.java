package Algorithms.immutable;

import java.util.List;

public final class ImmutablePerson {
    static class Address{
        public Address(Address address) {
        }
    }
    // ① class is final

    private final String name;                          // ② primitive/String — safe as-is
    private final List<String> hobbies;                  // ③ mutable collection field
    private final Address address;                       // ④ mutable custom object field

    public ImmutablePerson(String name, List<String> hobbies, Address address) {
        this.name = name;
        this.hobbies = List.copyOf(hobbies);              // ⑤ DEFENSIVE COPY on the way IN
        this.address = new Address(address);              // ⑤ DEFENSIVE COPY (copy constructor) on the way IN
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;                                   // ⑥ safe to return directly — already immutable (List.copyOf)
    }

    public Address getAddress() {
        return new Address(address);                      // ⑦ DEFENSIVE COPY on the way OUT (Address is still mutable)
    }
}

