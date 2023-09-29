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

**Use Cases**
Heaps have several real-world applications due to their efficient time complexities and ability to maintain the maximum or minimum element efficiently. Here are some common use cases of heaps:

1. **Graph Algorithms**: Heaps are used in various graph algorithms, such as Prim's algorithm for minimum spanning trees and Kruskal's algorithm for finding the minimum spanning tree in a graph. The heaps help in efficiently selecting the next edge with the minimum weight during the process.

2. **Priority Queues**: Heaps are widely used to implement priority queues, where elements are inserted with associated priorities and the highest priority element is retrieved first. Priority queues are utilized in various applications like task scheduling, job processing, event handling, and network packet routing.

3. **Dijkstra's Algorithm**: Heaps are used in Dijkstra's algorithm, a popular algorithm for finding the shortest path in a graph. The algorithm relies on a priority queue to efficiently select the next vertex with the smallest distance during the exploration process.

4. **Heap Sort**: Heapsort is a sorting algorithm that uses a heap to sort elements in ascending or descending order. It leverages the heap property to extract the maximum or minimum element and builds a sorted array. Although not as widely used as other sorting algorithms like quicksort or mergesort, heapsort is valuable in scenarios where **in-place** sorting is required.

5. **Event-driven Systems**: Heaps are useful in event-driven systems, such as event scheduling or event-driven simulations. Events can be inserted into a heap with their associated timestamps, and the heap allows efficient retrieval of the next event based on the timestamp.

6. **Memory Management**: Heaps are utilized in memory management systems, such as dynamic memory allocation and deallocation. In languages like C/C++, heap memory is used for dynamic allocation, and a heap data structure is responsible for managing the available memory blocks and their allocation/deallocation.

7. **Median Calculation**: Heaps can be employed to efficiently calculate the median of a stream of numbers. By maintaining a max-heap and a min-heap, the maximum element of the max-heap represents the median for a set of numbers.

8. **Kth Largest/Smallest Element**: Heaps can efficiently find the kth largest or smallest element in an array or stream of elements. By maintaining a heap of size k, the largest or smallest k elements can be retrieved in logarithmic time complexity.


These are just a few examples of the many practical applications of heaps. The efficiency and versatility of heaps make them valuable in solving a wide range of problems that involve maintaining priority, efficient selection, or event-driven scenarios.





