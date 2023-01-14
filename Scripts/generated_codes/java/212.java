/*

Explanation

There are 9 english, 6 mathematics, and 8 geography books. After Harry picks the geography book, there are 2 mathematics and 8 geography books. Harry removes the geography book and trashes it. Then he picks the mathematics book. After he picks the mathematics book, there are 6 graphics books. Harry removes the graphics books and trashes it.
 */

import java.util.*;

class Book {
    int exercises;
    String name;
}

public class BookExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().split(" ");
            Book book = new Book();
            int ex = Integer.valueOf(str[0]);
            String name = str[1];
            book.exercises = ex;
            book.name = name;
            books[i] = book;
        }
        Arrays.sort(books, new BookComparator());
        Book[] result = new Book[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            Book book = books[i];
            if (book.exercises == -1) {
                System.out.println(k + " " + result[k-1].name);
                result[0].exercises -= 1;
                if (result[0].exercises == 0) {
                    k = 0;
                }
            } else {
                if (k > 0) {
                    result[k].exercises = book.exercises;
                    result[k].name = book.name;
                    k++;
                } else {
                    result[0].exercises = book.exercises;
                    result[0].name = book.name;
                    k++;
                }
            }
        }
    }

    static class BookComparator implements Comparator<Book> {
        public int compare(Book a, Book b) {
            if (a.exercises > 0 && b.exercises > 0) {
                return a.exercises - b.exercises;
            } else if (a.exercises > 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}