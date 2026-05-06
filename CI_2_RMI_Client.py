import xmlrpc.client

# Connect to server
proxy = xmlrpc.client.ServerProxy("http://localhost:8000/")

# Call remote method
result = proxy.concat("Sagar ", "singh")

print("Concatenated String:", result)