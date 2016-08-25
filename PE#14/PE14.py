'''The following iterative sequence is defined for the set of positive integers:

n = n/2 (n is even)
n = 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.'''
hashmap = {1:1}

def chainLen(x):
    if hashmap.get(x) is None:
        if x%2 == 0:
            hashmap[x] = 1 + chainLen(x/2)
        else:
            hashmap[x] = 1 + chainLen(3*x + 1)
        return hashmap.get(x)
    else:
        return hashmap.get(x)

#currently returns the value of the longest chain but not the number that produced the chain

maximum = 0
for i in range(1,1000000):
    length = chainLen(i)
    if length > maximum:
        maximum = length

for key, chain in hashmap.iteritems():
    if chain == maximum:
        print key


