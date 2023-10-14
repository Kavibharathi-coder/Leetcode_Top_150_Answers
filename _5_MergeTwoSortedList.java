package TopInterviewQuestions;

 class ListNode{
    int val;
    ListNode next;

    public ListNode(int value){
        this.val = value;
    }
    public ListNode(int value, ListNode nextP){
        this.val = value;
        this.next = nextP;
    }
}
public class _5_MergeTwoSortedList {
    public static void main(String[] args) {

    }

    public static int mergeTwoSortedlist(ListNode head1, ListNode head2){
        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while(head1 != null && head2 != null){

            if(head1.val <= head2.val){
                ListNode node = new ListNode(head1.val);
                temp.next = node;
                temp = temp.next;
                head1 = head1.next;
            }
            else{
                ListNode node  = new ListNode(head2.val);
                temp.next = node;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return current.val;
    }
}
