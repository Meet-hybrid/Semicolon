binary = int(input("Enter a binary number: "))

total = 0

while binary > 0:
    last_digit = binary % 10      
    total = total * 2 + last_digit
    binary = binary // 10       

print("Decimal equivalent is:", total)