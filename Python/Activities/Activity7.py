#Let the user enter their own list
numbers = input("Enter numbers separated by spaces: ")

# Convert the input string into a list of integers
num_list = [int(x) for x in numbers.split()]

# Calculate sum
total = sum(num_list)

# Print result
print("The sum of the elements in the list is:", total)