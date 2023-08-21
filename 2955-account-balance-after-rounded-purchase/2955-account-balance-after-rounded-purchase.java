class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int result=0;
        if(purchaseAmount%10!=0){
            int rem=purchaseAmount%10;
           
            if(rem<5){
                result=purchaseAmount-rem;
                return ( 100 - result);
            }
            else{
                result=purchaseAmount+10;
               result=(result)-(rem);
            }
            
        }
        else {
            result=purchaseAmount;
        }
        return (100-result);
    }
}