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
            assertEquals(dll.head(), dll.tail());
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
            assertEquals(dll.tail(), dll.head());
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



}
