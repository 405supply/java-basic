package assignment.algorithm;

public class BinarySearch {
    /*
    * Assumes given array {sorted} be ascending sorted array
    * returns -1 if target is not found in given array
    */
    public int biSearch(int[] sorted, int target) {
        return biSearchRecursive(sorted, target, 0, sorted.length - 1);
    }

    private int biSearchRecursive(int[] sorted, int target, int front, int rear) {
        if (front > rear) return -1;

        int mid = (front + rear) / 2;

        if (sorted[mid] > target) return biSearchRecursive(sorted, target, front, mid - 1);
        else if (sorted[mid] < target) return biSearchRecursive(sorted, target, mid + 1, rear);
        else return mid;
    }

}
