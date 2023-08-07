import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;

// class Book {
//     public String title;
//     public String author;
//     public double price;
//     public int stock;

//     public Book(String title, String author, double price, int stock) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//         this.stock = stock;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getStock() {
//         return stock;
//     }

//     public void setStock(int stock) {
//         this.stock = stock;
//     }
// }

// class Library {
//     public List<Book> books;

//     public Library() {
//         books = new ArrayList<>();
//         // Add some sample books to the library
//         books.add(new Book("Book 1", "Author 1", 10.0, 5));
//         books.add(new Book("Book 2", "Author 2", 15.0, 3));
//         books.add(new Book("Book 3", "Author 3", 20.0, 7));
//     }

//     public List<Book> getBooks() {
//         return books;
//     }

//     public Book getBookByTitle(String title) {
//         for (Book book : books) {
//             if (book.getTitle().equalsIgnoreCase(title)) {
//                 return book;
//             }
//         }
//         return null;
//     }
// }

// class UserManager {
//     public List<User> users;
//     public Map<String, String> defaultUsers;

//     public UserManager() {
//         users = new ArrayList<>();
//         defaultUsers = new HashMap<>();
//         defaultUsers.put("admin", "admin123");
//         defaultUsers.put("user1", "password1");
//         defaultUsers.put("user2", "password2");
//     }

//     public boolean registerUser(String username, String password) {
//         for (User user : users) {
//             if (user.getUsername().equals(username)) {
//                 return false; // Username already exists
//             }
//         }
//         users.add(new User(username, password));
//         return true;
//     }

//     public boolean loginUser(String username, String password) {
//         if (defaultUsers.containsKey(username)) {
//             String storedPassword = defaultUsers.get(username);
//             if (storedPassword.equals(password)) {
//                 return true; // Login successful
//             }
//         }
//         return false; // Login failed
//     }
// }

// class User {
//     public String username;
//     public String password;
//     public double accountBalance;

//     public User(String username, String password) {
//         this.username = username;
//         this.password = password;
//         this.accountBalance = 1000.0; // Initial account balance of 1000 Rs
//     }

//     public String getUsername() {
//         return username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public double getAccountBalance() {
//         return accountBalance;
//     }

//     public void debitAccount(double amount) {
//         accountBalance -= amount;
//     }
// }

// class LibraryManagementSystem {
//     public static final int ADMIN_ACCESS = 1;
//     public static final int USER_LOGIN = 2;
//     public static final int USER_REGISTRATION = 3;

//     public static void main(String[] args) {
//         Library library = new Library();
//         UserManager userManager = new UserManager();
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("//Run the code in online compiler programiz.com for better output, some features may not work in other IDEs//");
//         System.out.println("Welcome to the Online Book Management System!");
//         System.out.println("//For User Login: Username: user1 Password: password1");
//         int choice = getMainMenuChoice(scanner);

//         if (choice == ADMIN_ACCESS) {
//             // Admin access
//             System.out.println("Admin access selected.");
//             String adminUsername = "admin";
//             String adminPassword = "admin123";
//             String enteredUsername = getUsername(scanner);
//             String enteredPassword = getPassword(scanner);

//             if (adminUsername.equals(enteredUsername) && adminPassword.equals(enteredPassword)) {
//                 System.out.println("Admin login successful!");
//                 // Implement admin functionality here
//             } else {
//                 System.out.println("Admin login failed. Invalid username or password.");
//             }
//         } else if (choice == USER_LOGIN) {
//             // User login
//             System.out.println("User login selected.");
//             String username = getUsername(scanner);
//             String password = getPassword(scanner);

//             if (userManager.loginUser(username, password)) {
//                 User user = new User(username, password);
//                 handleUserActions(user, library, scanner);
//                 System.out.println("Login successful!");
//             } else {
//                 System.out.println("Login failed. Invalid username or password.");
//             }
//         } else if (choice == USER_REGISTRATION) {
//             // User registration
//             System.out.println("User registration selected.");
//             String username = getUsername(scanner);

//             // if (userManager.registerUser(username)) {
//             //     String password = getPassword(scanner);
//             //     if (userManager.validatePassword(username, password)) {
//             //         System.out.println("Registration successful!");
//             //         User user = new User(username, password);
//             //         handleUserActions(user, library, scanner);
//             //     } else {
//             //         System.out.println("Registration failed. Invalid password.");
//             //     }
//             // } else {
//             //     System.out.println("Username already exists. Please try creating a new username.");
//             // }
//         } else {
//             System.out.println("Invalid choice. Exiting the program.");
//         }

//         scanner.close();
//     }

//     public static int getMainMenuChoice(Scanner scanner) {
//         System.out.println("Please select an option:");
//         System.out.println("1. Admin access");
//         System.out.println("2. User login");
//         System.out.println("3. User registration");

//         int choice = scanner.nextInt();
//         scanner.nextLine();
//         return choice;
//     }

//     public static String getUsername(Scanner scanner) {
//         System.out.print("Enter your username: ");
//         return scanner.nextLine();
//     }

//     public static String getPassword(Scanner scanner) {
//         System.out.print("Enter your password: ");
//         return scanner.nextLine();
//     }
    
//     public static void handleUserActions(User user, Library library, Scanner scanner) {
//         boolean exit = false;

//         while (!exit) {
//             System.out.println("Please select an option:");
//             System.out.println("1. Book Catalogue");
//             System.out.println("2. Shopping Cart");
//             System.out.println("3. Inventory Management");
//             System.out.println("4. Order Processing");
//             System.out.println("0. Exit");

//             int choice = scanner.nextInt();
//             scanner.nextLine();

//             switch (choice) {
//                 case 1:
//                     displayBookCatalogue(library);
//                     break;
//                 case 2:
//                     handleShoppingCart(user, library, scanner);
//                     break;
//                 case 3:
//                     handleInventoryManagement(library, scanner);
//                     break;
//                 case 4:
//                     handleOrderProcessing(user, library, scanner);
//                     break;
//                 case 0:
//                     exit = true;
//                     System.out.println("Exiting the program.");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//                     break;
//             }
//         }
//     }

//     public static void displayBookCatalogue(Library library) {
//         List<Book> books = library.getBooks();

//         System.out.println("Book Catalogue:");
//         for (int i = 0; i < books.size(); i++) {
//             Book book = books.get(i);
//             System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
//         }
//     }
//     public static void handleShoppingCart(User user, Library library, Scanner scanner) {
//         List<Book> books = library.getBooks();
//         Map<Book, Integer> cart = new HashMap<>();

//         boolean exit1 = false;
//         while (!exit1) {
//             System.out.println("Shopping Cart:");
//             if (cart.isEmpty()) {
//                 System.out.println("Cart is empty.");
//             } else {
//                 System.out.println("Items in the cart:");
//                 for (Map.Entry<Book, Integer> entry : cart.entrySet()) {
//                     Book book = entry.getKey();
//                     int quantity = entry.getValue();
//                     System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " x " + quantity);
//                 }
//             }

//             System.out.println("\nPlease select an option:");
//             System.out.println("1. Add item to cart");
//             System.out.println("2. Remove item from cart");
//             System.out.println("3. Checkout");
//             System.out.println("0. Back to main menu");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character

//             switch (choice) {
//                 case 1:
//                     displayBookCatalogue(library);
//                     System.out.print("Enter the number corresponding to the book you want to add to the cart: ");
//                     int bookChoice = scanner.nextInt();
//                     scanner.nextLine(); // Consume the newline character

//                     if (bookChoice >= 1 && bookChoice <= books.size()) {
//                         Book selectedBook = books.get(bookChoice - 1);
//                         if (selectedBook.getStock() > 0) {
//                             cart.put(selectedBook, cart.getOrDefault(selectedBook, 0) + 1);
//                             System.out.println("Book added to cart successfully.");
//                         } else {
//                             System.out.println("Book is out of stock. Unable to add to cart.");
//                         }
//                     } else {
//                         System.out.println("Invalid choice. Please try again.");
//                     }
//                     break;
//                 case 2:
//                     if (cart.isEmpty()) {
//                         System.out.println("Cart is empty. Nothing to remove.");
//                     } else {
//                         System.out.print("Enter the number corresponding to the book you want to remove from the cart: ");
//                         int removeChoice = scanner.nextInt();
//                         scanner.nextLine(); // Consume the newline character

//                         if (removeChoice >= 1 && removeChoice <= cart.size()) {
//                             Book selectedBook = new ArrayList<>(cart.keySet()).get(removeChoice - 1);
//                             int quantity = cart.get(selectedBook);
//                             if (quantity > 1) {
//                                 cart.put(selectedBook, quantity - 1);
//                             } else {
//                                 cart.remove(selectedBook);
//                             }
//                             System.out.println("Book removed from cart successfully.");
//                         } else {
//                             System.out.println("Invalid choice. Please try again.");
//                         }
//                     }
//                     break;
//                 case 3:
//                     if (cart.isEmpty()) {
//                         System.out.println("Cart is empty. Unable to checkout.");
//                     } else {
//                         double totalAmount = calculateTotalAmount(cart);
//                         if (totalAmount <= user.getAccountBalance()) {
//                             user.debitAccount(totalAmount);
//                             updateBookStock(cart, library);
//                             cart.clear();
//                             System.out.println("Checkout successful. Total amount debited: Rs " + totalAmount);
//                         } else {
//                             System.out.println("Insufficient account balance. Unable to checkout.");
//                         }
//                     }
//                     break;
//                 case 0:
//                     exit1 = true;
//                     System.out.println("Returning to main menu.");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//                     break;
//             }
//         }
//     }

//     public static double calculateTotalAmount(Map<Book, Integer> cart) {
//         double totalAmount = 0.0;
//         for (Map.Entry<Book, Integer> entry : cart.entrySet()) {
//             Book book = entry.getKey();
//             int quantity = entry.getValue();
//             totalAmount += book.getPrice() * quantity;
//         }
//         return totalAmount;
//     }

//     public static void updateBookStock(Map<Book, Integer> cart, Library library) {
//         for (Map.Entry<Book, Integer> entry : cart.entrySet()) {
//             Book book = entry.getKey();
//             int quantity = entry.getValue();
//             int currentStock = book.getStock();
//             book.setStock(currentStock - quantity);
//         }
//     }

//     public static void handleInventoryManagement(Library library, Scanner scanner) {
//         List<Book> books = library.getBooks();

//         boolean exit = false;
//         while (!exit) {
//             System.out.println("Inventory Management:");
//             System.out.println("Books in inventory:");

//             for (int i = 0; i < books.size(); i++) {
//                 Book book = books.get(i);
//                 System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor() + " - Stock: " + book.getStock());
//             }

//             System.out.println("\nPlease select an option:");
//             System.out.println("1. Add stock");
//             System.out.println("2. Remove stock");
//             System.out.println("0. Back to main menu");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter the number corresponding to the book you want to add stock to: ");
//                     int addStockChoice = scanner.nextInt();
//                     scanner.nextLine(); // Consume the newline character

//                     if (addStockChoice >= 1 && addStockChoice <= books.size()) {
//                         Book selectedBook = books.get(addStockChoice - 1);
//                         System.out.print("Enter the quantity to add: ");
//                         int quantity = scanner.nextInt();
//                         scanner.nextLine(); // Consume the newline character

//                         int currentStock = selectedBook.getStock();
//                         selectedBook.setStock(currentStock + quantity);
//                         System.out.println("Stock added successfully.");
//                     } else {
//                         System.out.println("Invalid choice. Please try again.");
//                     }
//                     break;
//                 case 2:
//                     System.out.print("Enter the number corresponding to the book you want to remove stock from: ");
//                     int removeStockChoice = scanner.nextInt();
//                     scanner.nextLine(); // Consume the newline character

//                     if (removeStockChoice >= 1 && removeStockChoice <= books.size()) {
//                         Book selectedBook = books.get(removeStockChoice - 1);
//                         System.out.print("Enter the quantity to remove: ");
//                         int quantity = scanner.nextInt();
//                         scanner.nextLine(); // Consume the newline character

//                         int currentStock = selectedBook.getStock();
//                         if (quantity > currentStock) {
//                             System.out.println("Invalid quantity. Not enough stock available.");
//                         } else {
//                             selectedBook.setStock(currentStock - quantity);
//                             System.out.println("Stock removed successfully.");
//                         }
//                     } else {
//                         System.out.println("Invalid choice. Please try again.");
//                     }
//                     break;
//                 case 0:
//                     exit = true;
//                     System.out.println("Returning to main menu.");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//                     break;
//             }
//         }
//     }

//     public static void handleOrderProcessing(User user, Library library, Scanner scanner) {
//         List<Book> books = library.getBooks();
//         Map<Book, Integer> cart = new HashMap<>();
//         System.out.println("Order Processing:");
//         System.out.println("Books in inventory:");

//         for (int i = 0; i < books.size(); i++) {
//             Book book = books.get(i);
//             System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor() + " - Stock: " + book.getStock());
//         }

//         System.out.println("\nPlease select an option:");
//         System.out.println("1. Process order");
//         System.out.println("0. Back to main menu");

//         int choice = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         switch (choice) {
//             case 1:
//                 System.out.print("Enter the number corresponding to the book you want to process an order for: ");
//                 int processOrderChoice = scanner.nextInt();
//                 scanner.nextLine(); // Consume the newline character

//                 if (processOrderChoice >= 1 && processOrderChoice <= books.size()) {
//                     Book selectedBook = books.get(processOrderChoice - 1);
//                     System.out.print("Enter the quantity to order: ");
//                     int quantity = scanner.nextInt();
//                     scanner.nextLine(); // Consume the newline character

//                     int currentStock = selectedBook.getStock();
//                     if (quantity > currentStock) {
//                         System.out.println("Invalid quantity. Not enough stock available.");
//                     } else {
//                         selectedBook.setStock(currentStock - quantity);
//                         double orderAmount = selectedBook.getPrice() * quantity;
//                         user.debitAccount(orderAmount);
//                         System.out.println("Order processed successfully. Amount debited: Rs " + orderAmount);
//                     }
//                 } else {
//                     System.out.println("Invalid choice. Please try again.");
//                 }
//                 break;
//             case 0:
//                 // exit = true;
//                 System.out.println("Returning to main menu.");
//                 break;
//             default:
//                 System.out.println("Invalid choice. Please try again.");
//                 break;
//         }
//     }
// }