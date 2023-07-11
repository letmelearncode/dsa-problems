**Heap** is a data structure with below property.
1. It should be a complete binary tree which means **the n-1 level should be 
completely filled and nth level should be filled from left to right**.
2. The **priority of parent node would always be greater** than its immediate children.
3. Heaps are typically implemented as arrays, where the position of each element in the array represents its position in the tree structure.
4. Heaps are primarily used to efficiently maintain and retrieve the maximum or minimum element from a collection.

**Note**:
1. There can be two types of Heaps.
   1. **Min Heap** - Parent node has value lesser than the children. eg ranks
   2. **Max Heap** - Parent node has value greater than the children. eg marks
   
**Operations**:
1. Addition - O(logN)
2. Deletion - O(logN)
3. Max/Min Search - 0(1)