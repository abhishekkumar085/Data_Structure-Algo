# import base64
# from cryptography.fernet import Fernet

# # The base64-encoded message
# encoded_message = "VGhpcyB3YXMgZWFzeS4gTGV0J3MgdHJ5IHNvbWV0aGluZyBoYXJkZXIuIE1yIENyeXB0byBuZWVkcyB5b3VyIGhlbHAgdG8gdW5kZXJzdGFuZCB0aGlzIHRleHQ6IAoKZ0FBQUFBQm5ibjhvTzBPN09tcXRxdWZjcDZOazVsNDQ4NEtwZ0xzNmFpaThLejJmX24yWFA2WmIzSUpmbXhPTzdpVHVfQXFZZWRPeTl3cEFLVk9ZNWttN3NxREpoVGR6dTJaQmxkbDgtdnd1bnJ2SGFMNjAyX1pPc09OLWtvRmJvOVNVZW13NHNjQm1JTkJFU1p0akJCUHljWUVibnV1WjZhV1E3MHl3bnNxWXJuOFp5cjVGYzJ1bVJrYUVnaFU1SlM4ZUt4VTlGQThLU1ptTWVxd2VDbFlNNG1tNEN5TzNuems3UEh3aHQ4dXNZU3BLbU5CclFjY1dDenZHQ3hGbDRUX1EwdFRKTWsxSklRX1dXaEpDY3hRTWVLTWxCSlYwb0UwQW9NZDRBd19vN0IzUWpURVFvckk9CgpIZSB0ZWxscyB5b3UgJ1NvbWV0aW1lcywgbWFjaGluZXMgaGF2ZSBuYW1lcyB0aGF0IGh1bWFucyBjYW4ndCByZWFkIHNvIHlvdSBuZWVkIGEgYm9vayB0byBsb29rIHVwIHRoZWlyIG5hbWVzLiBDaGVjayB0aGUgcHViJ3MgcmVjb3JkcyBpbiB0aGUgYm9vayBhbmQgeW91J2xsIGZpbmQgc29tZXRoaW5nIHRoYXQgbWlnaHQgYmUgdXNlZnVsLic="


# # Decode the base64 message
# decoded_message = base64.b64decode(encoded_message).decode("utf-8")
# print("Decoded message:", decoded_message)



# # Convert decoded message into a list and extract the encrypted text from the 2nd index
# lines = decoded_message.split('\n')

# encrypted_text = lines[2].strip()
# #print(encrypted_text)

# # Wordlist of potential keys (modify this list)
# wordlist = [
#     "localhost", "server1", "machine", "lucio", "book", "records",
#     "database", "pub", "hostname", "network", "key", "password","Sometimes","Mr Crypto","Swankey","pub's","records"
# ]

# #Try each word as a possible key
# for word in wordlist:
#     try:
#         # Convert word into a 32-byte key
#         key = base64.urlsafe_b64encode(word.ljust(32).encode())

#         # Create Fernet cipher with the guessed key
#         cipher = Fernet(key)

#         # Attempt to decrypt
#         decrypted_text = cipher.decrypt(encrypted_text).decode()

#         print(f"SUCCESS! Key Found: {word}")
#         print(f"Decrypted Text: {decrypted_text}")
#         break  # Stop if successful
#     except:
#         pass  # Ignore failed attempts

# print("No valid key found. Try adding more words to the list.")

import base64
from cryptography.fernet import Fernet

# The encrypted text
encrypted_text = "gAAAAABnbn8oO0O7Omqtqufcp6Nk5l4484KpgLs6aii8Kz2f_n2XP6Zb3IJfmxOO7iTu_AqYedOy9wpAKVOY5km7sqDJhTdzu2ZBldl8-vwunrvHaL602_ZOsON-koFbo9SUemw4scBmINBESZtjBBPycYEbnuuZ6aWQ70ywnsqYrn8Zyr5Fc2umRkaEghU5JS8eKxU9FA8KSZmMeqweClYM4mm4CyO3nzk7PHwht8usYSpKmNBrQccWCzvGCxFl4T_Q0tTJMk1JIQ_WWhJCcxQMeKMlBJV0oE0AoMd4Aw_o7B3QjTEQorI="

# Extended Wordlist
wordlist = [
    "sometimes", "machines", "names", "book", "lookup", "pub", "records",
    "hostname", "library", "directory", "dns", "registry", "database", "network",
    "pub_records", "machine_names", "lookup_book", "pubs_book", "public_records",
    "dns_lookup", "server_records", "hostname_list", "machine_list", "public_key",
    "pubkey", "logbook", "system_registry", "crypto_book", "crypto_records",
    "public_database", "network_registry", "dns_records", "encrypted_records",
    "system_records", "server_log", "lookup_registry", "crypto_registry",
    "host_lookup", "machine_registry", "sysadmin_book", "sysadmin_records",
    "server_directory", "domain_registry", "whois_lookup", "crypto_lookup",
    "domain_names", "lookup_server", "lookup_system", "machine_directory",
    "server_database", "system_logs", "public_log", "public_lookup",
    "machine_log", "encrypted_log", "network_book", "lucio", "light", "lux",
    "lucius", "lucid", "illuminate", "bright", "shine", "radiant", "glow","pub's","book"
]

# Try each word as a possible key
for word in wordlist:
    try:
        # Convert word into a 32-byte key
        key = word.ljust(32).encode()  # Ensure it's 32 bytes
        key = base64.urlsafe_b64encode(key)  # Encode in base64

        # Create Fernet cipher with the guessed key
        cipher = Fernet(key)

        # Attempt to decrypt
        decrypted_text = cipher.decrypt(encrypted_text.encode()).decode()

        print(f"\nSUCCESS! Key Found: {word}")
        print(f"Decrypted Text: {decrypted_text}")
        break  # Stop if successful
    except Exception:
        pass  # Ignore failed attempts

else:
    print("No valid key found. Try adding more words to the list.")

