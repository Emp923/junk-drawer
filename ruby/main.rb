def say_hello(name)
  puts "Hello #{name}!"
end

def say_goodbye
  puts "Goodbye"
end

puts "Enter a number to multiply by 2"
input = gets.chomp
puts input.to_i * 2

say_hello("Eric")
say_goodbye
