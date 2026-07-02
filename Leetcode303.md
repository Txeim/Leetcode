/*
LeetCode 303 - Range Sum Query - Immutable

Iss wale question mia mujhe prefix sum ka concept or classes ka concept use karke problem ko solve karna tha 
mene ek prefix naaam ka array banaya or phir uske baad uske ander prefix sum ko save kara 

SumRange mai mene return kar diya agar mera left == 0 hai to direct mene prefix array se nth array return kar diya 
agar mera left!=0 hai to mene prefix[right]+prefix[left-1] kara isse mera middle jo mujhe chaiye vo mil gya 

Time Complexity:
Constructor: O(n)
sumRange(): O(1)

Space Complexity:
O(n)
*/