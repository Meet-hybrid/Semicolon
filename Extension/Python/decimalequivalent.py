
binary = input("Enter a binary number: ")

total = 0


for digit in binary:
    digit = int(digit)     
    total = total * 2 + digit

print("Decimal equivalent is:", total)