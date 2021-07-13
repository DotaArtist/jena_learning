package leetcode;
import java.util.Iterator;

public class ListNode {
    int val;  // 局域变量
    ListNode next;  // 下一个node
    // 构造函数/构造方法
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class TestListNode{
    void main(String[] args){
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1,a);
        System.out.println(b.val);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(b.next.val);
    }
}