//Geedy
//Time complexity: O(n)
//Space complexity: (O(1))
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        //while till the position is 2nd last becuase end with 0
        //skip two bits when see 1
        //see 0, that is one bit
        //return true if position reach last bits
        //if postion is more, then false

        int i = 0;
        while(i<bits.length-1){
            if(bits[i] == 1){
                i+=2; //two bit
            }
            else{
                i++; //one bit
            }
        }
        return i==bits.length-1; //if equal means one-bit.
    }
}