def fizzBuzz (num):
    if(num<0):
        return "Invalid Input"
    list = []
    for x in range(1, num):
        if(x%3 == 0 and x%5 == 0):
            list.append("FIZZBUZZ")
        elif(x%3 == 0):
            list.append("FIZZ")
        elif(x%5 == 0):
            list.append("BUZZ")
        else:
            list.append(x)

    list.append(num)
    return list
print(fizzBuzz (30))


