# 3. Search in rotated sorted array

def search_rotated_array(arr, key):
    low, high = 0, len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == key:
            return mid
        
        if arr[low] < arr[mid]:
            if arr[low] <= key < arr[mid]:
                high = mid - 1
            else:
                low = mid + 1
        else:
            if arr[mid] <= key < arr[high]:
                low = mid + 1
            else: 
                high = mid - 1

    return -1


# Example usage
arr = [40, 50, 60, 10, 20, 30]
key = 20

index = search_rotated_array(arr, key)
print(f"Element found at index {index}" if index != -1 else "Element not found")