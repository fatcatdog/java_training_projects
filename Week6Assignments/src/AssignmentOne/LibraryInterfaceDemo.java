/*
@author = Jacob Duchen
*/

package AssignmentOne;

public class LibraryInterfaceDemo {
//setting interface methods that are made in each child class
    interface LibraryUser {
        void registerAccount();
        void requestBook();
    }

    public static void main(String[] args) {
        //creating a library
        LibraryInterfaceDemo library = new LibraryInterfaceDemo();
        //creating new users
        KidUser jacob = new KidUser(10, "Kids");
        AdultUser dylan = new AdultUser(15, "Kids");
        //testing out our users
        jacob.registerAccount();
        jacob.requestBook();
        dylan.registerAccount();
        dylan.requestBook();

    }

}
