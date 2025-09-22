# create an empty list called numbers_list
# repeat 5 times
# create an integer that counts number
# store number and print

numbers_list = []

for repeat in range(5):
   
    for i in range(1, 6):
        numbers_list.append(i)  
        print(f"Number {i}")    


print("\nAll numbers stored:", numbers_list)