def insertion_sort (list):
    for index in range(1, len(list)) :
        value = list[index]
        i = index-1 
        
        while i>=0: 
            if value < list[i]:
                list[i+1] = list[i] 
                list[i] = value 
                i = i - 1

            else: 
                break 

a=[7,1,3,5,9,2,3]

insertion_sort(a)
print(a)

