Originally from https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

Bus Gossip
==========

Description
-----------

A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Description
-----------------
The first line contains two space-separated integers denoting the respective values of n (the number of integers) and d (the number of left rotations you must perform). 
The second line contains n space-separated integers describing the respective elements of the array's initial state.
```
5 4
1 2 3 4 5
```

Output Description
------------------

Print a single line of  space-separated integers denoting the final state of the array after performing d left rotations.

```
5 1 2 3 4
```