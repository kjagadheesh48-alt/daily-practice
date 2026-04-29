def print_board(state):
    for i in range(3):
        print(state[i*3:(i+1)*3])
    print()

def get_moves(pos):
    moves = []
    row, col = pos // 3, pos % 3

    if row > 0: moves.append(-3)   # up
    if row < 2: moves.append(3)    # down
    if col > 0: moves.append(-1)   # left
    if col < 2: moves.append(1)    # right

    return moves

def solve(state, goal, visited, path):
    if state == goal:
        return True

    visited.add(tuple(state))

    zero = state.index(0)

    for move in get_moves(zero):
        new_state = state[:]
        new_pos = zero + move

        # swap
        new_state[zero], new_state[new_pos] = new_state[new_pos], new_state[zero]

        if tuple(new_state) not in visited:
            path.append(new_state)

            if solve(new_state, goal, visited, path):
                return True

            path.pop()  # backtrack

    return False


# Initial and goal states
start = [1, 2, 3,
         4, 0, 5,
         6, 7, 8]

goal = [1, 2, 3,
        4, 5, 0,
        6, 7, 8]

path = [start]

if solve(start, goal, set(), path):
    print("Solution steps:\n")
    for step in path:
        print_board(step)
else:
    print("No solution found")