# 5. Insert element in a sorted array while maintaining order

arr = [1, 2, 3, 4, 6, 7, 8]
print(len(arr))

arr.append(5)
print(arr)

n = len(arr)
for i in range(n):
    for j in range(0, n-i-1):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j+1] = arr[j + 1], arr[j]

print(arr)
