package models;

/**
 *
 * @author Aalan
 */
public class NodoD {
    private Friend friend;
    
    private NodoD prev;
    private NodoD next;

    public NodoD() {
    }

    public NodoD(Friend friend) {
        this.friend = friend;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public NodoD getPrev() {
        return prev;
    }

    public void setPrev(NodoD prev) {
        this.prev = prev;
    }

    public NodoD getNext() {
        return next;
    }

    public void setNext(NodoD next) {
        this.next = next;
    }
    
    
}
