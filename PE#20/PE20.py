#Find the sum of the digits in the number 100!

def fac(x):
    if x <= 1:
        return 1
    else:
        return x * fac(x-1)

digits =  str(fac(100))
sum = 0
for digit in digits:
    sum = sum + int(digit)

print sum