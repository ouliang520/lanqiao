class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode headfor=head;
        ListNode last=null;
        ListNode mil=null;
        ListNode next =null;
        int length =0;
        while(head!=null){
            head=head.next;
            length++;
        }
        head=headfor;
        //排除length=1的情况
        if(length==1||k==1){
            return head;
        }
        //排除length=2的情况
        last=head;
        mil=head.next;
        if(length==2){
            mil.next=head;
            head.next=null;
            return mil;
        }
        next=mil.next;
        int j=0;
        headfor=null;
        while(length/k>=j){
            for(int i=0;i<k-1;i++){
                mil.next=last;
                if(i==k-2){
                    j++;
                    if(headfor==null){
                        headfor=mil;
                    }else{
                        head.next=mil;
                    }
                    last=next;
                    if(last.next!=null)
                        mil=last.next;
                    if(mil.next!=null)
                        next=mil.next;
                    break;
                }
                last=mil;
                mil=next;
                next=next.next;

            }
        }
        if(j*k<length)
            head.next=last;
        return headfor;

    }

    public static void main(String[] args) {
//        ListNode e=new ListNode(null,5);
//        ListNode d=new ListNode(e,4);
        ListNode c=new ListNode(null,3);
        ListNode b=new ListNode(c,2);
        ListNode a=new ListNode(b,1);
        Solution solution=new Solution();
        solution.reverseKGroup(a,2);
    }

    private static class ListNode {
        ListNode next;
        int val;

        public ListNode(ListNode next,int val) {
            this.next = next;
            this.val=val;
        }
    }
}