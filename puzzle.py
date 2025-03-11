from cryptography.fernet import Fernet

# generate a new key
key = Fernet.generate_key()
print(key.decode())

# create a cipher object using the key
cipher = Fernet(key)

# define a message to encrypt
message = "This is a secret message."
encoded_message = message.encode()

# encrypt the message
encrypted_message = cipher.encrypt(encoded_message)
print(f"Encrypted message: {encrypted_message.decode()}")

# decrypt the message
decrypted_message = cipher.decrypt(encrypted_message)
print(f"Decrypted message: {decrypted_message.decode()}")

