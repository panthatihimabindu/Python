def isPerfect(n):

    sum = 1
    i = 2
    while i * i <= n:
        if n % i == 0:
            sum = sum + i + n / i
        i += 1
    return(True if sum == n and n != 1 else False)


def getPerfectNumbers(m, n):
    if m < 0 or n < 0 or m > n:
        return -1
    list = []
    for x in range(m, n):
        if(isPerfect(x)):
            list.append(x)
    return list


print(getPerfectNumbers(1, 100))
