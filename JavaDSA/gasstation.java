public class gasstation {
    public static int GasStation(int[] gas , int[] cost){
        int sGas=0,sCost=0,res=0,total=0;

        for(int i =0 ;i<gas.length;i++){
            sGas += gas[i];
            sCost += cost[i];
        }
            if(sGas < sCost ) return -1;
            for(int i = 0 ; i < gas.length;i++){
            total += gas[i] - cost[i];
            if(total<0){
                total = 0;
                res = i+1;
            }
            }
        return res;
    }
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(GasStation(gas, cost));
    }
}

// Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]

// Calculate total gas and cost:
// sGas = 1 + 2 + 3 + 4 + 5 = 15
// sCost = 3 + 4 + 5 + 1 + 2 = 15
// Check if circuit is possible:
// 15 >= 15, so it's possible.
// Find the starting point:
// i = 0: total = 1 - 3 = -2, reset total = 0, res = 1
// i = 1: total = 2 - 4 = -2, reset total = 0, res = 2
// i = 2: total = 3 - 5 = -2, reset total = 0, res = 3
// i = 3: total = 4 - 1 = 3
// i = 4: total = 3 + (5 - 2) = 6

// The algorithm returns res = 3, which is the correct starting point.
// To verify:

// Start at index 3: Gas = 4, Cost = 1, Remaining = 3
// Move to index 4: Gas = 3 + 5 = 8, Cost = 2, Remaining = 6
// Move to index 0: Gas = 6 + 1 = 7, Cost = 3, Remaining = 4
// Move to index 1: Gas = 4 + 2 = 6, Cost = 4, Remaining = 2
// Move to index 2: Gas = 2 + 3 = 5, Cost = 5, Remaining = 0

// We complete the circuit without running out of gas, confirming that index 3 is the correct starting point.
