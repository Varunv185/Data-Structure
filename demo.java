class node {
    int info;
    node next;

    node() {
        info = 0;
        next = null;
    }

    node(int info) {
        this.info = info;
        next = null;
    }
}

class linkList {
    node start;

    linkList() {
        start = null;
    }

    void addFirst(int item) {
        node t = new node(item);
        t.next = start;
        start = t;
    }

    void traverse() {
        node ptr = start;
        while (ptr != null) {
            System.out.println(ptr.info);
            ptr = ptr.next;
        }
    }

    int count() {
        int cnt = 0;
        node ptr = start;
        while (ptr != null) {
            cnt++;
            ptr = ptr.next;
        }
        return cnt;
    }

    int maxx() {
        int max = 0;
        node ptr = start;
        while (ptr != null) {
            if (ptr.info > max)
                max = ptr.info;
            ptr = ptr.next;
        }
        return max;
    }

    node find(int item) {
        node ptr = start;
        while (ptr != null) {
            if (item == ptr.info)
                return ptr;
            ptr = ptr.next;
        }
        return null;

    }

    void append(int item) {
        node t = new node(item);
        if (start == null) {
            start = t;
        } else {
            node ptr = start;
            while (ptr.next != null) {
            ptr = ptr.next;
            }
            ptr.next = t;
        }

    }
}

public class demo {
    public static void main(String[] args) {
        linkList l1 = new linkList();
        l1.addFirst(50);
        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);
        l1.traverse();
        System.out.println(l1.count());
        System.out.println(l1.maxx());
        l1.append(60);
        l1.traverse();

    }

}
