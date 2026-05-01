def alpha_beta(node, depth, alpha, beta, maximizing):
    # If leaf node or depth limit reached
    if depth == 0 or isinstance(node, int):
        return node

    if maximizing:
        value = float('-inf')
        for child in node:
            value = max(value, alpha_beta(child, depth - 1, alpha, beta, False))
            alpha = max(alpha, value)
            if alpha >= beta:   # Beta cut-off
                break
        return value
    else:
        value = float('inf')
        for child in node:
            value = min(value, alpha_beta(child, depth - 1, alpha, beta, True))
            beta = min(beta, value)
            if beta <= alpha:   # Alpha cut-off
                break
        return value