puts "Enter your first name"
first_name = gets.chomp
puts "Enter your last name"
last_name = gets.chomp
full_name = first_name + " " + last_name
puts "Your full name is #{full_name}"
reversed_name = full_name.reverse
puts "Your reversed name is #{reversed_name}"
total = first_name.length + last_name.length
puts "Your name has #{total} characters in it"
