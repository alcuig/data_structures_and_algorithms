def insertion_sort (ls):
    for index in range(1, len(ls)) :
        value = ls[index]
        i = index-1 
        
        while i>=0: 
            if value < ls[i]:
                ls[i+1] = ls[i] 
                ls[i] = value 
                i = i - 1

            else: 
                break

a=[7,1,3,5,9,2,3]

insertion_sort(a)
print(a)

