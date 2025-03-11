// const crypto = require('crypto');
// const base64 = require('base-64');

import crypto from 'crypto';
import base64 from 'base-64';

// This is the encrypted message
const text = `VGhpcyB3YXMgZWFzeS4gTGV0J3MgdHJ5IHNvbWV0aGluZyBoYXJkZXIuIE1yIENyeXB0byBuZWVkcyB5b3VyIGhlbHAgdG8gdW5kZXJzdGFuZCB0aGlzIHRleHQ6IAoKZ0FBQUFBQm5ibjhvTzBPN09tcXRxdWZjcDZOazVsNDQ4NEtwZ0xzNmFpaThLejJmX24yWFA2WmIzSUpmbXhPTzdpVHVfQXFZZWRPeTl3cEFLVk9ZNWttN3NxREpoVGR6dTJaQmxkbDgtdnd1bnJ2SGFMNjAyX1pPc09OLWtvRmJvOVNVZW13NHNjQm1JTkJFU1p0akJCUHljWUliNnV1WjZhV1E3MHl3bnNxWXJuOFp5cjVGYzJ1bVJrYUVnaFU1SlM4ZUt4VTlGQThLU1ptTWVxd2VDbFlNNG1tNEN5TzNuems3UEh3aHQ4dXNZU3BLbU5CclFjY1dDenZHQ3hGbDRUX1EwdFRKTWsxSklRX1dXaEpDY3hRTWVLTWxCSlYwb0UwQW9NZDRBd19vN0IzUWpURVFvckk9CgpIZSB0ZWxscyB5b3UgJ1NvbWV0aW1lcywgbWFjaGluZXMgaGF2ZSBuYW1lcyB0aGF0IGh1bWFucyBjYW4ndCByZWFkIHNvIHlvdSBuZWVkIGEgYm9vayB0byBsb29rIHVwIHRoZWlyIG5hbWVzLiBDaGVjayB0aGUgcHViJ3MgcmVjb3JkcyBpbiB0aGUgYm9vayBhbmQgeW91J2xsIGZpbmQgc29tZXRoaW5nIHRoYXQgbWlnaHQgYmUgdXNlZnVs.`;

const mystr_decode = base64.decode(text);
console.log(mystr_decode);

const key = '5Oo_1fd2ECmx1WnUW-_uSeCQaw-khEV5r93EuOt9NdE=';
const encrypted_message =
  'gAAAAABnbn8oO0O7Omqtqufcp6Nk5l4484KpgLs6aii8Kz2f_n2XP6Zb3IJfmxOO7iTu_AqYedOy9wpAKVOY5km7sqDJhTdzu2ZBldl8-vwunrvHaL602_ZOsON-koFbo9SUemw4scBmINBESZtjBBPycYIb6uuZ6aWQ70ywnsqYrn8Zyr5Fc2umRkaEghU5JS8eKxU9FA8KSZmMeqweClYM4mm4CyO3nzk7PHwht8usYSpKmNBrQccWCzvGCxFl4T_Q0tTJMk1JIQ_WWhJCcxQMeKMlBJV0oE0AoMd4Aw_o7B3QjTEQorI=';

const decipher = crypto.createDecipheriv(
  'aes-256-cbc',
  Buffer.from(key, 'base64'),
  Buffer.alloc(16, 0)
);

let decrypted = decipher.update(encrypted_message, 'base64', 'utf8');
decrypted += decipher.final('utf8');

console.log('Decrypted message:', decrypted);
