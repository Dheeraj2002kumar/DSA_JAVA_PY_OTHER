# 4. Delete duplicate elements from sorted array

arr = [1, 2, 3, 4, 4, 5, 5, 3, 3]
arr.sort()
print("Sorted arr --> ", arr)

arr = set(arr)
print("converted into array to set --> ", arr)

arr = list(arr)
print("Now converted into list(array) --> ", arr)