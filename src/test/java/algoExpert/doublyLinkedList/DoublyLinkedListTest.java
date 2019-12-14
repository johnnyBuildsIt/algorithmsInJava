package algoExpert.doublyLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListTest {

    DoublyLinkedList dll;

    @BeforeEach
    void setup() {
        dll  = new DoublyLinkedList();
    }

    @Nested
    class HeadAndTailInserts{
        @Test
        void shouldReturnTrueWhenSearchingForNodeInList(){
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            assertEquals(true, dll.containsNodeWithValue(5));
        }

        @Test
        void shouldReturnFalseWhenSearchingForANodeNotInList() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            assertEquals(false, dll.containsNodeWithValue(4));
        }

        @Test
        void shouldReturnFalseWhenSearchingAnEmptyList() {
            assertEquals(false, dll.containsNodeWithValue(4));
        }

        @Test
        void shouldBeEmptyIfHeadAndTailNull() {
            assertEquals(true, dll.isEmpty());
        }

        @Test
        void shouldNotBeEmptyIfHasNode() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            assertEquals(false, dll.isEmpty());
        }

        @Test // in a better implementation, head and tail should be private
        void shouldSetHeadAndTailWhenSettingHeadOnEmptyList() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            assertEquals(dll.headValue(), dll.tailValue());
        }

        @Test
        void shouldContainOriginalHeadWhenSettingNewHead() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            DoublyLinkedList.Node newHead = new DoublyLinkedList.Node(8);
            dll.setHead(newHead);
            assertEquals(true, dll.containsNodeWithValue(5));
        }

        @Test
        void shouldReturnElementAt1stIndexWithTwoElements() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            DoublyLinkedList.Node newHead = new DoublyLinkedList.Node(8);
            dll.setHead(newHead);
            assertEquals(5, dll.get(1));
        }

        @Test
        void shouldReturnLengthWithElements() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setHead(node);
            DoublyLinkedList.Node newHead = new DoublyLinkedList.Node(8);
            dll.setHead(newHead);
            assertEquals(2, dll.length());
        }

        @Test
        void shouldReturnZeroLengthWhenEmpty() {
            assertEquals(0, dll.length());
        }

        @Test
        void shouldSetHeadWhenSettingTail() {
            DoublyLinkedList.Node node = new DoublyLinkedList.Node(5);
            dll.setTail(node);
            assertEquals(dll.tailValue(), dll.headValue());
        }

        @Test
        void shouldHaveCorrectLengthWhenHeadAndTailSet(){
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            assertEquals(2, dll.length());
        }
    }

    @Nested
    class Insertions {
        @Test
        void shouldInsertNewNodeBeforeHead() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            dll.setHead(headNode);

            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);

            dll.insertBefore(dll.headNode(), newNode);

            assertEquals(10, dll.headValue());
        }

        @Test
        void nodeInsertedBeforeHeadShouldHaveNullPrevValue() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            dll.setHead(headNode);

            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);

            dll.insertBefore(dll.headNode(), newNode);

            assertEquals(null, dll.headNode().prev);
        }

        @Test
        void shouldInsertNewNodeBeforeTail() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);

            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);

            dll.insertBefore(dll.tailNode(), newNode);

            assertEquals(10, dll.get(1));
        }

        @Test
        void shouldInsertNewNodeAfterTail() {
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(5);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);

            dll.insertAfter(dll.tailNode(), newNode);

            assertEquals(10, dll.tailValue());
        }

        @Test
        void shouldInsertNewNodeAfterHead() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);

            dll.insertAfter(dll.headNode(), newNode);

            assertEquals(10, dll.get(1));
        }

        @Test
        void shouldInsertNewNodeAtPositionIfEmpty() {
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);
            dll.insertAtPosition(2, newNode);

            assertEquals(10, dll.headValue());
        }

        @Test
        void shouldInsertNewNodeAtPosition() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);

            dll.insertAtPosition(2, newNode);

            assertEquals(10, dll.get(1));
        }

        @Test
        void shouldInsertNodeAtPositionTwo() {
            DoublyLinkedList.Node first = new DoublyLinkedList.Node(1);
            DoublyLinkedList.Node second = new DoublyLinkedList.Node(2);

            dll.insertAtPosition(1, first);
            dll.insertAtPosition(2, second);

            assertEquals(2, dll.get(1));
        }

        @Test
        void shouldRemovedNodeBeforeInsertingIfAlreadyInList() {
            DoublyLinkedList.Node first = new DoublyLinkedList.Node(1);
            DoublyLinkedList.Node second = new DoublyLinkedList.Node(2);
            DoublyLinkedList.Node third = new DoublyLinkedList.Node(3);
            DoublyLinkedList.Node fourth = new DoublyLinkedList.Node(4);

            dll.setHead(first);
            dll.insertAfter(first, second);
            dll.insertAfter(second, third);
            dll.insertAfter(third, fourth);
            dll.insertAfter(second, fourth);

            assertEquals(null, third.next);
        }
    }

    @Nested
    class Removal {
        @Test
        void shouldRemoveHead() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), newNode);

            dll.remove(headNode);

            assertEquals(10, dll.headValue());
        }

        @Test
        void shouldRemoveHeadAndSetNewHeadPrevToNull() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), newNode);

            dll.remove(headNode);

            assertEquals(null, dll.headNode().prev);
        }

        @Test
        void shouldRemoveTail() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), newNode);

            dll.remove(tailNode);

            assertEquals(10, dll.tailValue());
        }

        @Test
        void shouldRemoveNodeNotHeadOrTail() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), newNode);

            dll.remove(newNode);

            assertEquals(false, dll.containsNodeWithValue(10));
        }

        @Test
        void shouldRemoveHeadAndTailIfLengthOne() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            dll.setHead(headNode);

            dll.remove(headNode);

            assertEquals(0, dll.length());
        }

        @Test
        void shouldRemoveNodeWithValue() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node newNode = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), newNode);

            dll.removeNodesWithValue(10);

            assertEquals(false, dll.containsNodeWithValue(10));
        }

        @Test
        void shouldRemoveMultipleNodesWithValue() {
            DoublyLinkedList.Node headNode = new DoublyLinkedList.Node(5);
            DoublyLinkedList.Node tailNode = new DoublyLinkedList.Node(8);
            dll.setHead(headNode);
            dll.setTail(tailNode);
            DoublyLinkedList.Node node1 = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), node1);
            DoublyLinkedList.Node node2 = new DoublyLinkedList.Node(10);
            dll.insertBefore(dll.tailNode(), node2);

            dll.removeNodesWithValue(10);

            assertEquals(false, dll.containsNodeWithValue(10));
        }
    }



}
