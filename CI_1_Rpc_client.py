import xmlrpc.client

print("Connecting to server...")

proxy = xmlrpc.client.ServerProxy("http://localhost:8000/")

print("Connected!")

num = int(input("Enter number: "))

print("Sending request...")

result = proxy.factorial(num)

print("Factorial =", result)