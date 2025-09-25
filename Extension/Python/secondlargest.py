largest = int(input("Enter number 1: "))
second = largest

for i in range(2, 11):
    number = int(input(f"Enter number {i}: "))

    if number > largest:
        second = largest
        largest = number
    elif number > second and number < largest:
        second = number

print("Second largest is", second, "and largest is", largest)