/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = OrderbinarySearch(mountainArr , target , 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }else{
            return OrderbinarySearch(mountainArr , target , peak , mountainArr.length()-1);
        }
    }
    
    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);

            if (midVal > nextVal) {
                // You're in the descending part of the array
                // This may be the answer, but look to the left too
                end = mid;
            } else {
                // You're in the ascending part
                start = mid + 1;
            }
        }

        // At the end of the loop, start == end pointing to the peak
        return start;
    }
     
    public int OrderbinarySearch(MountainArray mountainArr, int target, int start , int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);
            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}

