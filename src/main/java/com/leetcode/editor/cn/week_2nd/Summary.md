二叉堆是一种特殊的二叉树---满二叉树，正是这种结构，二叉堆可以用数组来表示，一旦知道了父节点或者子节点即可根据公式快速算出子节点/父节点的坐标，从而实现快速交换，在元素发生变化时，以O(logn)的速度快速找出最大/最小值