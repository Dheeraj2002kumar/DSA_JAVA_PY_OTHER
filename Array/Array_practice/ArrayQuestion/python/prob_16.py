# Linear Search


# def Linear_search(arr, key):
#     for i in range(len(arr)):
#         if arr[i] == key:
#             return 1
#     return -1

# arr = [10, 20, 30, 40, 50]
# key = 30
# print(Linear_search(arr, key))





def linear_search_all(arr, key):
    indices = []
    count = 0
    for i in range(len(arr)):
        if arr[i] == key:
            indices.append(i)
            count += 1
    return [indices, count]

arr = [5, 10, 15, 10, 20, 10, 10, 10]
key = 10
print(linear_search_all(arr, key))
