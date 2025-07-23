import java.util.*;

public class VoteingSystem {
    private HashMap<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> voteHistory = new LinkedHashMap<>();

    // Cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteHistory.put(candidate, voteMap.get(candidate)); // update order
    }

    // Display votes using TreeMap (sorted by candidate name)
    public void displaySortedResults() {
        System.out.println("=== Sorted Results (TreeMap) ===");
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    // Display votes in insertion order (LinkedHashMap)
    public void displayVoteHistory() {
        System.out.println("=== Vote Order (LinkedHashMap) ===");
        for (Map.Entry<String, Integer> entry : voteHistory.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    // Display actual vote counts (HashMap - no order guaranteed)
    public void displayRawVotes() {
        System.out.println("=== Raw Vote Data (HashMap) ===");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }
}
class VotingMain {
    public static void main(String[] args) {
        VoteingSystem system = new VoteingSystem();

        // Simulating votes
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        // Display outputs
        system.displayRawVotes();
        system.displaySortedResults();
        system.displayVoteHistory();
    }
}
