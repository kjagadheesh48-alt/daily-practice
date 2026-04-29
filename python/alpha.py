import math

def alpha_beta(depth, index, is_max, alpha, beta, tree):
    
    # If we reach a leaf node
    if depth == 0:
        return tree[index]

    # Maximizing player
    if is_max:
        value = -math.inf
        
        for j in range(2):
            child_value = alpha_beta(depth - 1, 2 * index + j, False, alpha, beta, tree)
            value = max(value, child_value)
            alpha = max(alpha, value)

            # Prune branch
            if alpha >= beta:
                break
        
        return value

    # Minimizing player
    else:
        value = math.inf
        
        for j in range(2):
            child_value = alpha_beta(depth - 1, 2 * index + j, True, alpha, beta, tree)
            value = min(value, child_value)
            beta = min(beta, value)

            # Prune branch
            if alpha >= beta:
                break
        
        return value


# Leaf nodes of the tree
tree = [3, 5, 6, 9, 1, 2, 0, -1]

# Run the algorithm
result = alpha_beta(3, 0, True, -math.inf, math.inf, tree)

print("Optimal value:", result)