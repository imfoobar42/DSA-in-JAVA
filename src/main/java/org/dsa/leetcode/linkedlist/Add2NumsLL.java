package org.dsa.leetcode.linkedlist;


class Add2NumsLL {
    public int traverseLLToNum(ListNode l){
        ListNode temp = l;
        int result = 0;
        while(temp!=null){
            result = result *10 +temp.val;
        }
        return result;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value1 =  traverseLLToNum(l1);
        int value2 = traverseLLToNum(l2);
        int sum = value1+value2; // 807 -> 708
        int valueLL = sum;
        ListNode newList = new ListNode();
        ListNode temp = newList;
        while(sum>0){
            temp.val =  (sum%10) ;
            sum /=10;
        }

    return l1;
}
}