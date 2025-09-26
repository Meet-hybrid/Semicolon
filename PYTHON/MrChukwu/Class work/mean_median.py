integer_one = int(input("Enter the first integer: "))
integer_two = int(input("Enter the second integer: "))
integer_three = int(input("Enter the third integer: "))
integer_four = int(input("Enter the fourth integer: "))

if integer_one > integer_two and integer_one > integer_three and integer_one > integer_four :
    highest = integer_one

elif integer_two > integer_one and integer_two > integer_three and integer_two > integer_four:
    highest = integer_two

elif integer_three > integer_one and integer_three > integer_two and integer_three > integer_four:
    highest = integer_three

else:
    highest = integer_four

if integer_one < integer_two and integer_one < integer_three and integer_one < integer_four :
    lowest = integer_one

elif integer_two < integer_one and integer_two < integer_three and integer_two < integer_four:
    lowest = integer_two

elif integer_three < integer_one and integer_three < integer_two and integer_three < integer_four:
    lowest = integer_three

else:
    highest = integer_four
sum = (integer_one + integer_two + integer_three + integer_four)
median = ( highest + lowest)
print("the median is", sum - median)
