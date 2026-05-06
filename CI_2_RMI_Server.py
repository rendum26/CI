from xmlrpc.server import SimpleXMLRPCServer

class StringService:
    def concat(self, str1, str2):
        return str1 + str2

# Create server
server = SimpleXMLRPCServer(("localhost", 8000))
print("Server is running...")

# Register instance
server.register_instance(StringService())

# Start server
server.serve_forever()