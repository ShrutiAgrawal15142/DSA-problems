class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // this approch will be use when there is no constraint of any time complexity
        
//         for(int i=0; i<arr.length -1; i++){
//             if(arr[i]> arr[i+1]){
//                 return i;
//             }
//         }
//         return -1;
        
        
        // also can do this by linear search
        
//         int i=0;
//         while(arr[i]<arr[i+1]){
//             i++;
//         }
//         return i;
        
        // this approch will be used while keeping in mind the time complexity
        
        int left = 0, right = arr.length -1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]<=arr[mid+1]){
                left = mid+1;
            }
            else{
                right = mid;
            }
            
        }
        return left;
    }
}