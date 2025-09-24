#prompt user to enter fathers and son age
#store the the ages to a variable
# find the difference when the father is twice the age of the son
# then print
father_age = int(input("Enter current father's age from 1-80: "))
son_age = int(input("Enter current son's age from 1-80: "))

difference = son_age * 2 
	
if father_age < difference :
	print("years", difference - father_age)

else:
	print("future:", difference - son_age)






#father_age < 1 or father_age > 80 or son_age < 1 or son_age > 80 :
	#print("invalid format")
