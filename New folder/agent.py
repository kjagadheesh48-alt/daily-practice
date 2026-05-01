def simple_reflex_agent(location, status):
    if status == "Dirty":
        return "Suck"
    elif location == "A":
        return "Move Right"
    elif location == "B":
        return "Move Left"

# Example usage
# Input percept (location, status)
percepts = [
    ("A", "Dirty"),
    ("A", "Clean"),
    ("B", "Dirty"),
    ("B", "Clean")
]

for percept in percepts:
    action = simple_reflex_agent(percept[0], percept[1])
    print(f"Percept: {percept} -> Action: {action}")