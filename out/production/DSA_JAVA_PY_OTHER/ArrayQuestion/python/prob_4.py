# 4. Count even and odd numbers in an array

myArray = [3, 5, 6, 7, 88, 5, 44]

evenCount = 0
oddCount = 0

for i in myArray:
    if i % 2 == 0:
        evenCount += 1
    else:
        oddCount += 1

print("Even count in array: ", evenCount)
print("Odd count in array: ", oddCount)