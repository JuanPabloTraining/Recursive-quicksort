# Recursive QuickSort

This repository contains an implementation of the Quicksort algorithm using purely recursion. Quicksort is an efficient sorting algorithm widely used in practice.

## How it Works

The Quicksort algorithm is an efficient sorting method based on the "divide and conquer" strategy. It operates as follows:

1. **Pivot**: Choose an element from the list of elements to be sorted, called the pivot. Typically, the last element of the list is chosen but in this project, it will be selected randomly.
2. **Partition**: Rearrange the list so that all elements with a value less than the pivot come to the right of it and all elements with a value greater come to the right.
3. **Recursion**: Apply the same process recursively to the sublists of elements smaller and larger than the pivot.

## Implementation

The Quicksort implementation in this repository is written in Java. It is based on the recursion principle and follows the steps mentioned above to sort a given list.

## Usage

To use this Quicksort implementation, simply create an instance of the Quicksort class and use the sort method. You will have to send there the list that you want it to order. You can also feel free to run the Main.java file, there you already have and example.
