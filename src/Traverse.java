import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Traverse {
  public static void main(String[] args) {
    // Create Person objects with empty confidant sets.
    Person alice   = new Person("Alice",   30, new HashSet<>());
    Person bob     = new Person("Bob",     28, new HashSet<>());
    Person charlie = new Person("Charlie", 32, new HashSet<>());
    Person diana   = new Person("Diana",   27, new HashSet<>());
    Person eve     = new Person("Eve",     35, new HashSet<>());
    Person frank   = new Person("Frank",   29, new HashSet<>());
    Person grace   = new Person("Grace",   33, new HashSet<>());
    Person henry   = new Person("Henry",   31, new HashSet<>());
    Person irene   = new Person("Irene",   26, new HashSet<>());
    Person jack    = new Person("Jack",    40, new HashSet<>());

    // Set up confidant relationships.
    // Note: Relationships are directional and a person is not their own confidant.
    alice.getConfidants().addAll(Arrays.asList(bob, charlie, diana, frank));
    bob.getConfidants().addAll(Arrays.asList(alice, eve));
    charlie.getConfidants().addAll(Arrays.asList(bob, frank));
    diana.getConfidants().addAll(Arrays.asList(charlie, grace, eve));
    eve.getConfidants().addAll(Arrays.asList(frank, irene));
    frank.getConfidants().addAll(Arrays.asList(bob, grace));
    grace.getConfidants().add(henry);
    henry.getConfidants().addAll(Arrays.asList(alice, diana));
    irene.getConfidants().addAll(Arrays.asList(jack, diana));
    jack.getConfidants().addAll(Arrays.asList(charlie, bob));


    Map<Integer, Set<Integer>> graph = new HashMap<>();
    graph.put(3, new HashSet<>(Arrays.asList(7, 34)));
    graph.put(7, new HashSet<>(Arrays.asList(12, 45, 34, 56)));
    graph.put(12, new HashSet<>(Arrays.asList(7, 56, 78)));
    graph.put(34, new HashSet<>(Arrays.asList(34, 91)));
    graph.put(56, new HashSet<>(Arrays.asList(78)));
    graph.put(78, new HashSet<>(Arrays.asList(91)));
    graph.put(91, new HashSet<>(Arrays.asList(56)));
    graph.put(45, new HashSet<>(Arrays.asList(23)));
    graph.put(23, new HashSet<>());
    graph.put(67, new HashSet<>(Arrays.asList(91)));
  }
}
