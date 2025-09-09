#num_tuple = (10,20,34,76,45,65)
input_nums = input("Enter 5 numbers:")
num_list = input_nums.split(",")
num_tuple = tuple(num_list)
print(num_list)
print(tuple(num_list))

print(" Numbers divisible by 5 are :")
for num in num_tuple:
    if int(num) % 5 == 0:
        print(num)