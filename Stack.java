package latihan.modul.pkg3;
public class Stack {
   
    private Object[] items;
    private int top;

    public Stack() {
        this.items = new Object[10];
        this.top = -1;
    }

    public void push(Object item) {
        if (this.top == this.items.length - 1) {
            Object[] newItems = new Object[this.items.length * 2];
            for (int i = 0; i < this.items.length; i++) {
                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
        this.top++;
        this.items[this.top] = item;
    }

    public Object pop() {
        Object item = this.items[this.top];
        this.top--;
        return item;
    }

    public Object peek() {
        return this.items[this.top];
    }

    public boolean empty() {
        return this.top == -1;
    }

    public int search(Object item) {
        for (int i = this.top; i >= 0; i--) {
            if (this.items[i].equals(item)) {
                return this.top - i + 1;
            }
        }
        return -1;
    }
}


