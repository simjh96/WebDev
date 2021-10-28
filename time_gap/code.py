def dfs(current):
    # condition check
    if current in lock:
        pass
    else:
        if current in keys:
            pass
        for c in T.nodes[current].child:
            # recurse
            dfs(c)
