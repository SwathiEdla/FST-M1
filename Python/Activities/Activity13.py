def calculate_sum(numbers):
  total = 0
  for number in numbers:
	  total += number  
  return total  

num_list = list(map(int, input("Enter numbers separated by space: ").split()))
print(num_list)

# Call the sum() function with numList as argument
result = calculate_sum(num_list)

# Print result with message
print("The sum of all the elements is: " + str(result))
