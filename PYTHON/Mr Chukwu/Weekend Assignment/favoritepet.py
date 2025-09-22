#prompt user to enter their favorite pet
#convert pet to lowercase
#check if pet is "cat" then display "Meew, cats are awesome!" if not,
#"Cool choice, but I love cats."



pet = input("What's your favorite pet? ").lower()


if pet == "cat":
    print("Meew, cats are awesome!")
else:
    print("Cool choice, but I love cats.")