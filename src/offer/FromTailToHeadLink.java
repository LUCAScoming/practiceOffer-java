package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 思路：
 * 用栈解决。
 * */
class ListNode {
    int data;
    ListNode next = null;

    private ListNode(int data) {
        this.data = data;
    }
}

public class FromTailToHeadLink {
    public List<Integer> method(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode node = listNode;
        while (node != null) {
            stack.push(node.data);
            node = node.next;
        }
        while (stack != null) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
