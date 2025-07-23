import java.time.LocalDate;
import java.util.Objects;
import java.util.*;

public class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String name, LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyholderName = name;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premium;
    }

    // Getters
    public String getPolicyNumber() { return policyNumber; }
    public String getCoverageType() { return coverageType; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName + " | " + coverageType + " | Expires: " + expiryDate;
    }
}



 class PolicyManager {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    // Add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Get all unique policies
    public void displayAllPolicies() {
        System.out.println("=== All Unique Policies (HashSet) ===");
        for (Policy p : hashSet) System.out.println(p);
    }

    // Get policies expiring in next 30 days
    public void displayExpiringSoon() {
        System.out.println("=== Policies Expiring Soon (within 30 days) ===");
        LocalDate now = LocalDate.now();
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isBefore(now) && p.getExpiryDate().isBefore(now.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    // Get policies with a specific coverage type
    public void displayByCoverage(String type) {
        System.out.println("=== Policies with Coverage: " + type + " ===");
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Check for duplicates based on policy number
    public void displayDuplicates(List<Policy> allPolicies) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy p : allPolicies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        System.out.println("=== Duplicate Policies ===");
        for (Policy p : allPolicies) {
            if (duplicates.contains(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
    }
}



class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        List<Policy> allPolicies = Arrays.asList(
                new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000),
                new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 3000),
                new Policy("P103", "Charlie", LocalDate.now().plusDays(20), "Home", 4500),
                new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000), // duplicate
                new Policy("P104", "David", LocalDate.now().plusDays(5), "Auto", 2500)
        );

        for (Policy p : allPolicies) {
            manager.addPolicy(p);
        }

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverage("Auto");
        manager.displayDuplicates(allPolicies);
    }
}



class PerformanceTest {
    public static void comparePerformance() {
        int N = 100000;
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        long start, end;

        // HashSet
        start = System.nanoTime();
        for (int i = 0; i < N; i++)
            hashSet.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Health", 1000));
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        // LinkedHashSet
        start = System.nanoTime();
        for (int i = 0; i < N; i++)
            linkedHashSet.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Auto", 1000));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        // TreeSet
        start = System.nanoTime();
        for (int i = 0; i < N; i++)
            treeSet.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Home", 1000));
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");
    }
}
