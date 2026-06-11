1. What is a Queue?

A Queue is a linear data structure that follows FIFO (First In First Out).

👉 The first element inserted is the first element removed.

Real-life Example
People standing in a ticket line.
First person enters → First person gets the ticket.
Front -> [10][20][30][40] <- Rear

Dequeue => 10 removed

Front -> [20][30][40] <- Rear
2. Basic Queue Operations
Operation	Meaning
enqueue(x)	Insert element
dequeue()	Remove element
peek()	Front element
isEmpty()	Queue empty?
size()	Number of elements
Java
Queue<Integer> q = new LinkedList<>();

q.offer(10);
q.offer(20);
q.offer(30);

System.out.println(q.peek()); // 10

q.poll(); // removes 10

System.out.println(q.peek()); // 20
3. Time Complexity
Operation	Complexity
Enqueue	O(1)
Dequeue	O(1)
Peek	O(1)
4. Types of Queue
Simple Queue

FIFO queue.

10 20 30
Circular Queue

Last position connects back to first.

Used to avoid wasted space.

Priority Queue

Higher priority element comes out first.

Java:

PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.offer(5);
pq.offer(1);
pq.offer(3);

System.out.println(pq.poll()); // 1

Min Heap by default.

Deque

Insertion and deletion from both ends.

Deque<Integer> dq = new ArrayDeque<>();

dq.addFirst(10);
dq.addLast(20);

dq.removeFirst();
dq.removeLast();
Important Queue Patterns

These are the patterns repeatedly asked in interviews.

Pattern 1: BFS (Level Order Traversal)

Queue is the heart of BFS.

Questions
Binary Tree Level Order Traversal
Minimum Depth of Tree
Rotting Oranges
Word Ladder
Template
Queue<TreeNode> q = new LinkedList<>();

q.offer(root);

while(!q.isEmpty()) {

    TreeNode node = q.poll();

    if(node.left != null)
        q.offer(node.left);

    if(node.right != null)
        q.offer(node.right);
}
Remember

👉 Whenever you hear

Level by level
Shortest path in unweighted graph
Nearest distance

Think BFS + Queue

Pattern 2: Level-wise Processing

Example:

       1
      / \
     2   3
    / \
   4   5

Output:

[1]
[2,3]
[4,5]
Trick

Store current level size.

while(!q.isEmpty()) {

    int size = q.size();

    for(int i=0;i<size;i++) {

        TreeNode node = q.poll();

        // process node
    }
}
Pattern 3: Sliding Window Maximum

Famous interview problem.

LeetCode 239.

Input

nums = [1,3,-1,-3,5,3,6,7]
k = 3

Output

[3,3,5,5,6,7]

Use Deque.

Key Idea

Keep elements in decreasing order.

Deque<Integer> dq = new LinkedList<>();

Complexity:

O(n)

instead of

O(n*k)
Pattern 4: Monotonic Queue

Used in:

Sliding Window Maximum
Sliding Window Minimum
Increasing Queue
1 2 3 5 8
Decreasing Queue
8 5 3 2 1

Questions:

Sliding Window Maximum
Daily Temperatures variation
Constrained subarray problems
Pattern 5: Multi-Source BFS

Very common.

Examples:

Rotting Oranges
Walls and Gates
01 Matrix
Trick

Put ALL starting points into queue first.

for(all rotten oranges)
{
    q.offer(cell);
}

Then run BFS.

Pattern 6: Topological Sort (Kahn's Algorithm)

Uses Queue.

Questions:

Course Schedule
Alien Dictionary
Template
Queue<Integer> q = new LinkedList<>();

for(int i=0;i<n;i++)
{
    if(indegree[i] == 0)
        q.offer(i);
}

while(!q.isEmpty())
{
    int node = q.poll();

    for(int next : graph[node])
    {
        indegree[next]--;

        if(indegree[next] == 0)
            q.offer(next);
    }
}
Pattern 7: Producer-Consumer Queue

Asked in Java Multithreading interviews.

BlockingQueue<Integer> queue
        = new LinkedBlockingQueue<>();

Producer adds.

Consumer removes.

Queue synchronizes both.

Most Important Queue Problems

For interviews, practice in this order:

Easy
Implement Queue using Array
Implement Queue using Linked List
Implement Stack using Queue
Implement Queue using Stacks
Medium
Binary Tree Level Order Traversal
Rotting Oranges
Number of Islands (BFS)
01 Matrix
Course Schedule
Sliding Window Maximum
Hard
Word Ladder
Bus Routes
Shortest Path in Binary Matrix
Interview Shortcut

When you see:

Clue	Think
FIFO	Queue
Level Order	Queue
BFS	Queue
Nearest Distance	Queue
Shortest Path (Unweighted Graph)	Queue
Sliding Window Max	Deque
Topological Sort	Queue
Multiple Starting Points	Multi-Source BFS

For Java interviews (2–3 years experience), the top 5 queue problems you should absolutely master are:

Binary Tree Level Order Traversal
Rotting Oranges
01 Matrix
Course Schedule (Kahn's Algorithm)
Sliding Window Maximum (Deque)




Best practice order to learn:
Simple queue  
BFS on tree  
BFS on graph/grid  
Multi-source BFS  
Topological sort  
Deque  
Monotonic queue  
0-1 BFS