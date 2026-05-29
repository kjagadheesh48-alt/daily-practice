def leap(year):
    if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0:
        return "Leap Year"
    return "Not Leap Year"

print(leap(2024))