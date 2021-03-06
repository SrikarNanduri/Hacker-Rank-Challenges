You are playing a revised version of the game, where, you have to unlock all doors in a given setting, in a given fashion, to enter the playing area.

- Initially, any door is either locked or unlocked.
- If a door is locked and you unlock it, then
  - if the next consecutive door is locked, it will automatically get unlocked.
  - if the next consecutive door is already unlocked, nothing will happen.
  - there will be no effect on any following door.

For example, if there are 10 doors as shown below, where 0 denotes an `unlocked` door, and 1 denotes a `locked`door, a minimum of 3 operations, will be required to unlock all doors.

![image](https://s3.amazonaws.com/hr-assets/0/1516608827-ee131cf007-roulette.png)

Note: You are allowed to unlock the doors in any order you wish.

Complete the function `revisedRussianRoulette` that takes an integer array denoting locked/unlocked status of each door in the array, and return an integer array denoting the minimum and maximum number of unlock operations needed to unlock all the doors.

**Input Format**

The first line contains a single integer n, denoting the total number of doors.

The next line contains n space separated integers, either 0 or 1. 1 denotes a `locked door` and 0 denotes an `unlocked door`.

**Constraints**

- 1<=n<=10000

**Output Format**

Print two integers separated by one space, denoting the minimum and maximum number of unlock operations needed respectively.

**Sample Input 0**

```
10
0 1 1 0 1 1 1 1 0 0

```

**Sample Output 0**

```
3 6

```

**Explanation 0**

Door 1 : Already unlocked. 
Door  2: Currently locked, so unlock operation performed to unlock the door. 
Door  3: Was locked, but since door 2 is unlocked, door 3 unlocks automatically. 
Door  4: Already unlocked. 
Doors 5,6,7 and 8 are unlocked in the same fashion as doors 2 and 3. 
Door  9: Already unlocked. 
Door 10 : Already unlocked.

Hence, a minimum of 3 doors need to be unlocked for all doors to be unlocked (refer diagram in challenge statement).

Similarly, a maximum of 6 doors need to be unlocked for all doors to be unlocked.