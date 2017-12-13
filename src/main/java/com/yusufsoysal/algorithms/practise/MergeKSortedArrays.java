package com.yusufsoysal.algorithms.practise;

import java.util.PriorityQueue;

public class MergeKSortedArrays {

    public static int[] merge(int[] ... arrays){
        PriorityQueue<QueueNode> queue = new PriorityQueue<>();
        int totalSize = 0;
        for(int i = 0; i<arrays.length; i++) {
            totalSize += arrays[i].length;
            if(arrays[i].length > 0 ){
                queue.add(new QueueNode(i, 0, arrays[i][0]));
            }
        }

        int[] result = new int[totalSize];
        int resultIndex = 0;
        while( queue.size() > 0 ){
            QueueNode queueNode = queue.poll();

            int arrayIndex = queueNode.arrayIndex;
            int newIndex = queueNode.index + 1;
            if( arrays[arrayIndex].length > newIndex ){
                queue.add(new QueueNode(arrayIndex, newIndex, arrays[arrayIndex][newIndex]));
            }

            result[resultIndex++] = queueNode.value;
        }

        return result;
    }

    static class QueueNode implements Comparable<QueueNode>{
        private final int arrayIndex;
        private int index;
        private final int value;

        public QueueNode(int arrayIndex, int index, int value) {
            this.arrayIndex = arrayIndex;
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(QueueNode otherNode) {
            return value - otherNode.value;
        }
    }

}
