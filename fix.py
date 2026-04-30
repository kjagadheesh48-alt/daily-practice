def solve(state, goal, visited):
    if state == goal:
        print(state)
        return True

    visited.add(str(state))

    # find 0
    for i in range(3):
        for j in range(3):
            if state[i][j] == 0:
                x, y = i, j

    for dx, dy in [(-1,0),(1,0),(0,-1),(0,1)]:
        nx, ny = x+dx, y+dy
        if 0<=nx<3 and 0<=ny<3:
            new = [row[:] for row in state]
            new[x][y], new[nx][ny] = new[nx][ny], new[x][y]

            if str(new) not in visited:
                if solve(new, goal, visited):
                    return True

    return False


start = [[1,2,3],[4,0,5],[6,7,8]]
goal  = [[1,2,3],[4,5,0],[6,7,8]]

solve(start, goal, set())