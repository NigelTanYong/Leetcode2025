//do it in-place
//Time complexity: O(n*m), Space Complexity: O(1)
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //let n be no. of rows
        //use 2 pointers to do flipping and inverting with xor
        int rows = image.length;
        for(int i =0; i<rows; i++){
            int left=0, right = image[i].length -1;
            while(left<=right){
                //invert
                int tempLeft = image[i][left] ^ 1;
                int tempRight = image[i][right] ^ 1;
                //Swap with inverted result
                image[i][left] = tempRight;
                image[i][right] = tempLeft;
                left++;
                right--;
            }
        }
        return image;
    }
}