# Binary Search (sorted array)

def Binary_search(arr,key):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == key:
            return mid   # key found give index value
        elif arr[mid] < key:
            low = mid + 1   # search left half
        else:
            high = mid - 1  # search righ half
    return -1


# Example usage
arr = [10, 20, 30, 40, 50, 60, 70]
key = 60

result = Binary_search(arr, key)

if result != 0:
    print(f"Element found at index {result}")
else:
    print("Element not found")