"""

Explanation
Harry grabs the books one-by-one.
He grabs the book "english". The pile has the book "english" with 9 remaining exercises.
He grabs the book "mathematics". The pile has "mathematics" and "english" with 6 remaining exercises and 9 remaining exercises.
He grabs the book "geography". The pile has "geography", "mathematics" and "english" with 8 remaining exercises and 6 remaining exercises and 9 remaining exercises.
Harry wants to do a book exercise. Number of remaining exercises of books in the pile: 8, 6, 9. Minimum number of remaining exercises: 6. There are 2 books with 6 remaining exercises. The book "mathematics" is at the top of the pile. If he picks the book "mathematics", he has to remove 2 books. If he picks the book "english", he has to remove 1 book. Since Harry will remove the minimum number of books, he will pick the book "english". The pile has "geography" and "mathematics" with 8 remaining exercises and 6 remaining exercises.
Harry grabs the book "graphics". The pile has "graphics", "geography" and "mathematics" with 3 remaining exercises and 8 remaining exercises and 6 remaining exercises.
Harry wants to do a book exercise. Number of remaining exercises of books in the pile: 3, 8, 6. Minimum number of remaining exercises: 3. There is 1 book with 3 remaining exercises. The book "graphics" is at the top of the pile. If he picks the book "graphics", he has to remove 0 books. If he picks the book "geography", he has to remove 2 books. Since Harry will remove the minimum number of books, he will pick the book "graphics". The pile has "geography" and "mathematics" with 8 remaining exercises and 6 remaining exercises.
*/

import sys
import heapq

class myheap(list):
    """
    Custom Class for a heap, which has the following features.
    1. add() - to add a new item to the heap.
    2. remove() - to remove the first element from the heap.
    3. pop() - to remove the first element from the heap.
    """
    def __init__(self, a=[]):
        list.__init__(self, a)
        heapq.heapify(self)

    def add(self, item):
        heapq.heappush(self, item)

    def remove(self, item):
        self.pop(self.index(item))

    def __call__(self):
        return self[0]


def get_number_of_books_to_remove(myheap, book):
    """
    Function to get the number of books to remove from the heap,
    to fetch the book that has minimum number of exercises remaining.
    This function is called when the argument is -1 in the input.

    :param myheap: - the heap object.
    :param book: - the book that has minimum number of exercises remaining.
    :return: number of books to remove.
    """
    counter = 0
    while myheap():
        if myheap()[1] == book[1]:
            break
        myheap.remove(myheap())
        counter += 1
    return counter


def main():
    """
    Main Function.
    :return: None
    """
    # Get the number of actions from the user.
    number_of_actions = int(raw_input("Enter the number of actions: "))
    # Initialize the heap object.
    myheap = myheap()
    # Iterate over the number of actions
    for _ in range(number_of_actions):
        # Get the user input.
        user_input = raw_input("Enter the action: ")
        user_input = user_input.split(" ")
        if int(user_input[0]) == -1:
            """
            -1 implies that Harry wants to do a book exercise.
            """
            # Check whether the heap is empty or not.
            if len(myheap) == 0:
                print("Heap is empty.")
                sys.exit()
            else:
                # Get the minimum number of exercises remaining among the books and
                # the number of books to remove.
                book = myheap()
                number_of_books_to_remove = get_number_of_books_to_remove(myheap, book)
                # Remove the book from the heap.
                myheap.remove(book)
                print("{} {}".format(number_of_books_to_remove, book[1]))
        else:
            """
            If the user_input is not -1, then add the book to the heap.
            """
            myheap.add((int(user_input[0]), user_input[1]))


if __name__ == "__main__":
    main()