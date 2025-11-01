# 3. Find the sum and average of array elements

myArray = [3, 5, 6, 3, 66, 4, 3]

ArrSum = 0
ArrAverage = 0

for i in myArray:
    ArrSum += i

ArrAverage = ArrSum / len(myArray)

print("Sum of Array: ", ArrSum)
print("Average of Array: ", ArrAverage)