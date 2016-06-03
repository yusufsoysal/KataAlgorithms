package com.yusufsoysal.algorithms.interview;

/*
 * How do you reverse a linked list in place?
 */
public class ReverseLinkedList {

    public  <T> MyLinkedList<T> reverse(MyLinkedList<T> linkedList) {
        if( linkedList.getNext() == null ){
            return linkedList;
        }

        MyLinkedList<T> next = linkedList.getNext();
        linkedList.setNext(null);

        MyLinkedList<T> reversed = reverse(next);
        next.setNext(linkedList);

        return reversed;
    }

    static class MyLinkedList<T> {
        private final T value;
        private MyLinkedList<T> next;

        public MyLinkedList(T value){
            this.value = value;
        }

        public MyLinkedList<T> getNext() {
            return next;
        }

        public void setNext(MyLinkedList next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MyLinkedList<?> that = (MyLinkedList<?>) o;

            if (value != null ? !value.equals(that.value) : that.value != null) return false;
            return next != null ? next.equals(that.next) : that.next == null;
        }

        @Override
        public int hashCode() {
            int result = value != null ? value.hashCode() : 0;
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }
    }
}
