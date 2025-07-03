import java.util.Scanner;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieList {
    private Movie head, tail;

    // Add at beginning
    public void addAtBeginning(Movie newMovie) {
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add at End
    public void addAtEnd(Movie newMovie) {
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }

    }
    public void addAtPosition(Movie newMovie, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(newMovie);
            return;
        }

        Movie current = head;
        for (int i = 1; current != null && i < pos - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            addAtEnd(newMovie);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            current.next.prev = newMovie;
            current.next = newMovie;
        }
    }

    // Remove by title
    public void removeByTitle(String title) {
        if (head == null) return;

        Movie current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Movie removed.");
    }

    // Search by director or rating
    public void search(String key) {
        boolean found = false;
        Movie current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(key) || String.valueOf(current.rating).equals(key)) {
                System.out.println("Found: " + current.title + " | " + current.director + " | " + current.year + " | Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No match found.");
    }

    // Update rating by title
    public void updateRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }



    public void displayForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("---- Movies (Forward) ----");
        Movie current = head;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | Rating: " + current.rating);
            current = current.next;
        }
    }
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("---- Movies (Reverse) ----");
        Movie current = tail;
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.year + " | Rating: " + current.rating);
            current = current.prev;
        }
    }


}
public class movieMangementSysDLL {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Movie Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Title");
            System.out.println("5. Search by Director or Rating");
            System.out.println("6. Update Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    Movie m = new Movie(title, director, year, rating);
                    if (choice == 1) list.addAtBeginning(m);
                    else if (choice == 2) list.addAtEnd(m);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(m, pos);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter Title to Remove: ");
                    String title = sc.nextLine();
                    list.removeByTitle(title);
                    break;
                }
                case 5: {
                    System.out.print("Enter Director Name or Rating to Search: ");
                    String key = sc.nextLine();
                    list.search(key);
                    break;
                }
                case 6: {
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter New Rating: ");
                    double newRating = sc.nextDouble();
                    list.updateRating(title, newRating);
                    break;
                }
                case 7:
                    list.displayForward();
                    break;
                case 8:
                    list.displayReverse();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        sc.close();
    }
}