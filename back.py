from collections import deque

goal = [[1,2,3],[4,5,6],[7,8,0]]

def solve(start):
    q = deque([(start, 0)])
    visited = set()

    while q:
        s, step = q.popleft()
        if s == goal:
            return step

        visited.add(str(s))

        # find 0
        for i in range(3):
            for j in range(3):
                if s[i][j] == 0:
                    x, y = i, j

        # moves
        for dx, dy in [(-1,0),(1,0),(0,-1),(0,1)]:
            nx, ny = x+dx, y+dy
            if 0<=nx<3 and 0<=ny<3:
                new = [row[:] for row in s]
                new[x][y], new[nx][ny] = new[nx][ny], new[x][y]

                if str(new) not in visited:
                    q.append((new, step+1))

    return -1


start = [[1,2,3],[4,0,5],[6,7,8]]
print("Steps:", solve(start))