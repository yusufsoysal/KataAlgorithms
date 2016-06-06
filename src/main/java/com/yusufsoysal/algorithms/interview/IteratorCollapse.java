package com.yusufsoysal.algorithms.interview;

import java.util.Iterator;

/*
 * Write an algorithm that collapses a list of Iterators into a single Iterator.
 */
public class IteratorCollapse {
    public final <T> Iterator<T> singleIterator(Iterator<T> ... iterators) {
        return new MyIterator<>(iterators);
    }

    static class MyIterator<T> implements Iterator<T> {

        private final Iterator<T>[] iterators;
        private int currentIndex = 0;

        public MyIterator(Iterator<T> ... iterators){
            this.iterators = iterators;
        }

        @Override
        public boolean hasNext() {
            if( iterators == null ){
                return false;
            }

            boolean returnValue = isCurrentIteratorHasAnyValue();
            if( !returnValue && moveToNextIterator() ){
                returnValue = isCurrentIteratorHasAnyValue();
            }

            return returnValue;
        }

        private boolean isCurrentIteratorHasAnyValue() {
            return iterators[currentIndex].hasNext();
        }

        private boolean moveToNextIterator(){
            if( currentIndex + 1 < iterators.length ) {
                currentIndex ++;
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            hasNext();

            return iterators[currentIndex].next();
        }
    }
}
