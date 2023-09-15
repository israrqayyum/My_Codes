import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

abstract class Item {
    private String title;
    private int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public abstract void displayInfo();
}

class Book extends Item {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Author: " + author);
    }
}

class Magazine extends Item {
    private String publisher;

    public Magazine(String title, int year, String publisher) {
        super(title, year);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Publisher: " + publisher);
    }
}

class LibraryManagementSystem {
    private List<Item> items;

    public LibraryManagementSystem() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items found in the library.");
        } else {
            for (Item item : items) {
                item.displayInfo();
                System.out.println("--------------------");
            }
        }
    }

    public void deleteItem(String title) {
        boolean found = false;
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                items.remove(item);
                found = true;
                System.out.println("Item deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the library.");
        }
    }

    public void searchItem(String title) {
        boolean found = false;
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.displayInfo();
                System.out.println("--------------------");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the library.");
        }
    }

    public void saveToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("library.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(items);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Library data saved to file.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving library data.");
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("library.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            items = (List<Item>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Library data loaded fromfile.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while loading library data.");
        }
    }
}

public class n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();

        int choice;
        do {
            System.out.println("    |---------------------- Shop Management System Menu ----------------------|");
            System.out.println("    |   1. Add Item                                                           |"); 
            System.out.println("    |   2. Display Items                                                      |");
            System.out.println("    |   3. Delete Item                                                        |");
            System.out.println("    |   4. Search Item                                                        |");
            System.out.println("    |   5. Save to File                                                       |");
            System.out.println("    |   6. Load from File                                                     |");
            System.out.println("    |   7. Exit                                                               |");
            System.out.println("    |-------------------------------------------------------------------------|");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } catch (InputMismatchException e) {
                choice = 0;
                scanner.nextLine(); // Clear the input buffer
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the item type (1 for Book, 2 for Magazine):");
                    int itemType = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter the year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (itemType == 1) {
                        System.out.print("Enter the author: ");
                        String author = scanner.nextLine();

                        Book book = new Book(title, year, author);
                        libraryManagementSystem.addItem(book);
                    } else if (itemType == 2) {
                        System.out.print("Enter the publisher: ");
                        String publisher = scanner.nextLine();

                        Magazine magazine = new Magazine(title, year, publisher);
                        libraryManagementSystem.addItem(magazine);
                    } else {
                        System.out.println("Invalid item type.");
                    }

                    break;

                case 2:
                    libraryManagementSystem.displayItems();
                    break;

                case 3:
                    System.out.print("Enter the title of the item to delete: ");
                    String deleteTitle = scanner.nextLine();
                    libraryManagementSystem.deleteItem(deleteTitle);
                    break;

                case 4:
                    System.out.print("Enter the title of the item to search: ");
                    String searchTitle = scanner.nextLine();
                    libraryManagementSystem.searchItem(searchTitle);
                    break;

                case 5:
                    libraryManagementSystem.saveToFile();
                    break;

                case 6:
                    libraryManagementSystem.loadFromFile();
                    break;

                case 7:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice (1-7).");
            }

            System.out.println();
        } while (choice != 7);

        scanner.close();
    }
}
