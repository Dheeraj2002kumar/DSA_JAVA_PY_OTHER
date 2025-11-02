# 2. Find the maximum and minimum element in an array

myArray = [32, 5, 76, 8, 85, 4]


if myArray == None or len(myArray) == 0:
    print("Array is empty...")

minElement = myArray[0]
maxElement = myArray[0]

for i in myArray:
    if i < minElement:
        minElement = i
    
    if i > maxElement:
        maxElement = i

print("Minimum Element: ", minElement)
print("Maximum Element: ", maxElement)