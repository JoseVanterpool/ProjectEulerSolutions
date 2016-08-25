#What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

index = 3
fibA = 1
fibB = 1
fibC = 2

while len(str(fibC)) < 1000:
    fibA = fibB
    fibB = fibC
    fibC = fibA + fibB
    index += 1

print index