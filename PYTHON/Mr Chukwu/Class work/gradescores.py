         

#Ask for score in subject 1 and call it first_score
#Ask for score in subject 2 and call it second_score
#Ask for score in subject 3 and call it third_score
#check if first_score is bigger than both second_score and third_score then make first_score the highest. if not,
#check if second_score is bigger than both first_score and third_score then make second_score the highest. if not,
# make third_score is the highest
#print the highest score



first_score = int(input("Enter first score: "))
second_score = int(input("Enter second score: "))
third_score = int(input("Enter third score: "))


if first_score > second_score and first_score > third_score:
    highest = first_score
elif second_score > first_score and second_score > third_score:
    highest = second_score
else:
    highest = third_score
print("Highest score is", highest)
