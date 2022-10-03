/*Formulating recursive solution:

function(n, k) -> returns the winner if there are n players and kth players is killed in each step
function(n-1, k) -> return the winner if there are n-1 players and kth players is killed in each step
and so on.

If the number of player is n then its 0 to n-1
If the number of player is n-1 then its 0 to n-2

	function(n, k){
		int winner = find(n-1, k)
		// map the winner from the group of n-1 players to group of n players
		// Let's take an example of n = 6, and k = 3
	}
n = 6, k = 3
So the 6 players are from 0 to n - 1, i.e 0 1 2 3 4 5
At first round 3rd players gets killed i.e player 2 will be killed.
So, the remaining players are 0 1 ~ 3 4 5

Now, we'll solve the problem for size 5 with players 0 1 2 3 4 and we'll map (k + 1)th player as a first player in new problem.
0 1 2 3 4 5 -> 3 4 - 0 1 2
So if our subproblem of size n-1 return x as a winner and original winner y can be derived by using

y = (x + k) % n*/

package com.arpit;

import java.util.Scanner;

class Solution {
    public int findTheWinner(int n, int k) {
        return findWinner(n, k) + 1;   // 1 for converting 0 indexed to 1 indexed
    }
    
    public int findWinner(int n, int k){
        if(n == 1) return 0;
        int x = findWinner(n-1, k);
        int y = (x  + k )% n;
        return y;
    }
}