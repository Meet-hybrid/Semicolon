print("""
List of menu functions:
1  -> Phone book
2  -> Messages
3  -> Chat
4  -> Call register
5  -> Tones
6  -> Settings
7  -> Call divert
8  -> Games
9  -> Calculator
10 -> Reminders
11 -> Clock
12 -> Profiles
13 -> Sim services
""")

menu = int(input("Enter your choice from 1 - 13: "))

match menu:
    case 1:
        print("""
Phone book:
1 -> Search
2 -> Service Nos. 1
3 -> Add name
4 -> Erase
5 -> Edit
6 -> Assign tone
7 -> Send b’card
8 -> Options
9 -> Speed dials
10 -> Voice tags
""")
        pb = int(input("Enter Phone book choice (1-10): "))
        match phone_book:
            case 1:
                print("Search")
            case 2:
                print("Service Nos")
            case 3:
                print("Add name")
            case 4:
                print("Erase")
            case 5:
                print("Edit")
            case 6:
                print("Assign tone")
            case 7:
                print("Send b’card")
            case 8:
                print("Options")
                print(" 1 -> Type of view")
                print(" 2 -> Memory status")
                opt = int(input("Enter Options choice (1-2): "))
                match opt:
                    case 1:
                        print("Type of view")
                    case 2:
                        print("Memory status")
            case 9:
                print("Speed dials")
            case 10:
                print("Voice tags")

    case 2:
        print("""
Messages:
1 -> Write messages
2 -> Inbox
3 -> Outbox
4 -> Picture messages
5 -> Templates
6 -> Smileys
7 -> Message settings
8 -> Info service
9 -> Voice mailbox number
10 -> Service command editor
""")
        msg= int(input("Enter Messages choice (1-10): "))
        match msg:
            case 1:
                print("Write messages")
            case 2:
                print("Inbox")
            case 3:
                print("Outbox")
            case 4:
                print("Picture messages")
            case 5:
                print("Templates")
            case 6:
                print("Smileys")
            case 7:
                print("Message settings")
                print("1 -> Set 1")
                print("2 -> Common")
                ms = int(input("Enter 1 or 2: "))
                match ms:
                    case 1:
                        print("Set 1")
                        print(" 1 -> Message centre number")
                        print(" 2 -> Messages sent as")
                        print(" 3 -> Message validity")
                        s1 = int(input("Enter Set 1 choice (1-3): "))
                        match s1:
                            case 1:
                                print("Message centre number")
                            case 2:
                                print("Messages sent as")
                            case 3:
                                print("Message validity")
                    case 2:
                        print("Common")
                        print(" 1 -> Delivery reports")
                        print(" 2 -> Reply via same centre")
                        print(" 3 -> Character support")
                        c = int(input("Enter Common choice (1-3): "))
                        match c:
                            case 1:
                                print("Delivery reports")
                            case 2:
                                print("Reply via same centre")
                            case 3:
                                print("Character support")
            case 8:
                print("Info service")
            case 9:
                print("Voice mailbox number")
            case 10:
                print("Service command editor")

    case 3:
        print("Chat")

    case 4:
        print("""
Call register:
1 -> Missed calls
2 -> Received calls
3 -> Dialed numbers
4 -> Erase recent call lists
5 -> Show call duration
6 -> Show call costs
7 -> Call cost settings
8 -> Prepaid credit
""")
        call_register = int(input("Enter Call register (1-8): "))
        match call_register:
            case 1:
                print("Missed calls")
            case 2:
                print("Received calls")
            case 3:
                print("Dialled numbers")
            case 4:
                print("Erase recent call lists")
            case 5:
                print("Show call duration")
                print(" 1-> Last call duration")
                print(" 2-> All call duration")
                print(" 3-> Received call duration")
                print(" 4-> Dialled call duration")
                print(" 5-> Clear timers")
                scd = int(input("Enter call choice (1-5): "))
                match scd:
                    case 1:
                        print("Last calls")
                    case 2:
                        print("All calls")
                    case 3:
                        print("Received calls")
                    case 4:
                        print("Dialled calls")
                    case 5:
                        print("Clear timer")
            case 6:
                print("Show call costs")
            case 7:
                print("Call cost settings")
            case 8:
                print("Prepaid credit")