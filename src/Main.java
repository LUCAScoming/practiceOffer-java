import java.util.*;

class Node {

   public Node node;
   public Node headNode;
    private int data;
    private Node next;



    public Node(int data){
        this.data = data;
    }
    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }
    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void add(Node node) {
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public int length() {
        int length = 0;
        Node temp = headNode;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        return length+1;
    }

    public void insert (Node node,int index){
        if (index<1|| index>length() ){
            System.out.println("位置不对，不能插入");
        }
        Node temp = headNode;
        int len = 0 ;
        while (temp.next != null){
            if (index==len){
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
            len++;
        }
    }
    public void print(){
        Node temp = headNode.next;
        while (temp != null){
            System.out.println(temp.data+" ,");
            temp = temp.next;
        }
        System.out.println("---------------");
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(10));
        students.add(new Student(18));
        students.add(new Student(15));
        Collections.sort(students);
        System.out.println(students.get(1).age);
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("05", "张五");
        map.put("03", "张三");
        map.put("12", "张十二");
        map.put("04", "张四");
        map.put("06", "张六");
        map.put("01", "张一");
        map.put("11", "张十一");
        map.put("08", "张八");
        map.put("15", "张十五");
        map.put("09", "张九");
        map.put("02", "张二");
        map.put("10", "张十");
        map.put("14", "张十四");
        map.put("13", "张十三");
        map.put("07", "张七");
        Iterator entryMap = map.entrySet().iterator();

        Set keySet = map.keySet();

        while (entryMap.hasNext()) {
            Map.Entry entry = (Map.Entry) entryMap.next();
            if (entry.getKey() == "03") {
                entryMap.remove();

            }
            Object key = entry.getKey();
            Object value = map.get(key);

            System.out.println(key + "  " + value);
        }

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.add(node2);
        node1.print();

    }

    /*class MapKeyComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            String a = (String) o1;
            String b = (String) o2;
            return b.compareTo(a);
        }
    }*/
}

