public class StaticVSnonStatic {

    static void showMessage() {
        System.out.println("Hello from showMessage()");
    }

    public static void main(String[] args) {
        showMessage(); // direct call, since both are static
    }
}
