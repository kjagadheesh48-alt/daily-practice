teams = list(map(int, input().split()))

if len(teams) == 1:
    print(teams[0])
else:
    difference = max(teams) - min(teams)
    print(difference)
