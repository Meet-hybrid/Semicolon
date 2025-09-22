
integer_one = int(input("Enter the first integer: "))
integer_two = int(input("Enter the second integer: "))
integer_three = int(input("Enter the third integer: "))


if (integer_one > integer_two and integer_one < integer_three) or (integer_one > integer_three and integer_one < integer_two):
    second_highest = integer_one
elif (integer_two > integer_one and integer_two < integer_three) or (integer_two > integer_three and integer_two < integer_one):
    second_highest = integer_two
else:
    second_highest = integer_three


print("Second highest score is", second_highest)