/*
@author = Jacob Duchen
*/

package AssignmentOne;
//bringing in interface frmo library face demo
public class AdultUser implements LibraryInterfaceDemo.LibraryUser {
//declaring variables
    int age;
    String bookType;
//creating adult user constructor
    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
//method to register user
    public void registerAccount(){
        if (this.age < 12) {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        } else {
            System.out.println("You have successfully registered under an Adult Account");
        }
    }
//method to request book
    public void requestBook(){
        if (this.bookType == "Fiction") {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
