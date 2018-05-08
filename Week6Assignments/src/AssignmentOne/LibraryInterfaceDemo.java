package AssignmentOne;

public class LibraryInterfaceDemo {

    interface LibraryUser {
        void registerAccount();
        void requestBook();
    }

    public static void main(String[] args) {
        LibraryInterfaceDemo library = new LibraryInterfaceDemo();

        KidUser jacob = new KidUser(10, "Kids");
        AdultUser dylan = new AdultUser(15, "Kids");

        jacob.registerAccount();
        jacob.requestBook();
        dylan.registerAccount();
        dylan.requestBook();

    }

}
