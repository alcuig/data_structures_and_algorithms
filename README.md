# data_structures_and_algorithms

Commented : insertion_sort()

| def insertion_sort (list):             |                                                                                                                                                                                              |
|----------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|     for index in range(1, len(list)) : | #starts looping through "unsorted list" portion of array, which must start from 2nd element of list onwards                                                                                  |
|         value = list[index]            | #”value” is the item at every index of the unsorted list, which we want to compare to all of the items to the left of it (in the sorted list)                                                |
|         i = index-1                    | # ”i" will iterate left through sorted list, comparing value to sorted items further and further left, until "i" has gotten all the way to the beginning of the list (i.e. when i is = to 0) |
|         while i>=0:                    | #will stop loop if “i” gets to beginning of list                                                                                                                                             |
|             if value < list[i]:        | #if “value” is less than the item that is now at index i, we need to shift the sorted item one slot to the right                                                                             |
|                 list[i+1] = list[i]    | #shift number in slot i right to slot i+1                                                                                                                                                    |
|                 list[i] = value        | #we can then shift "value" left into slot i                                                                                                                                                  |
|                 i = i - 1              | #we then want to cycle more to left, and perform loop over again until we find where unsorted “value” fits in sorted list                                                                    |
|         else:                          | #means that no item in list is smaller than "value", so value is in correct place. Break loop.                                                                                               |
|             break                      |                                                                                                                                                                                              |
