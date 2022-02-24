package com.company;

public class HeapSort {


    //오름차순 정렬
    public static int descHeap(int[] arr, int pIdx){
            int lIdx = (pIdx * 2) + 1;
            int rIdx = (pIdx * 2) + 2;
            if(lIdx >= arr.length && rIdx >= arr.length){
                return 0;
            }

            // 왼쪽   자식 노드  p*2 + 1
            if (arr[pIdx] < arr[lIdx]) {
                pIdx = lIdx;
            }
            // 오른쪽 자식 노드   p*2 + 2
            if (arr[pIdx] < arr[rIdx]) {
                pIdx = rIdx;
            }

        return pIdx;
    }

    public static int[] swap(int[] arr, int pIdx, int tIdx){
        int tmp = arr[pIdx];
        arr[pIdx] = arr[tIdx];
        arr[tIdx] = tmp;
        return arr;
    }

    public static void main(String[] args){
        int []arr = {7,6,5,8,4,5,3};

        // 부모노드  (자식 노드 - 1) / 2
        int pIdx;
        int largest;
        do {
            pIdx = 0;
            for (int i = 0; i < arr.length / 2; i++) {
                largest = descHeap(arr, i);
                swap(arr, i, pIdx);
            }
        }while(pIdx != 0);
        //부모 노드와 자식 노드 비교

        for(int j: arr){
            System.out.printf("%d, ", j);
        }
    }
}
