
number = int(input("Enter number 1: "))
largest = number   


for i in range(2, 11):
    number = int(input(f"Enter number {i}: "))
    if number > largest:
        largest = number


print("The largest number is:", largest)