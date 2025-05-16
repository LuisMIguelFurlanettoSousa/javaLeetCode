package src.Easy.ReverseLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next; // Guarda o próximo nó
            current.next = prev;  // Inverte a ligação
            prev = current;  // Move `prev` para frente
            current = nextTemp; // Move `current` para frente
        }

        return prev; // Novo head da lista invertida
    }
}