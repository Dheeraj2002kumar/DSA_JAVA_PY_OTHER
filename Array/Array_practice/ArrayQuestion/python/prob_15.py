# 5. Delete elements less than K

arr = [1, 2, 3, 4, 5, 6, 7]
K = 3

# result = []
# for i in arr:
#     if i >= K:
#         result.append(i)

# print(result)


arr = [x for x in arr if x >= K]
print(arr)
