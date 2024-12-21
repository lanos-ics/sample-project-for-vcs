Practice Questions

Lowercase Conversion
-Write a program to convert the string "JAVA Programming" into all lowercase letters.
    Expected output: java programming

Uppercase Conversion
Write a program to convert the string "python programming" into all uppercase letters.
Expected output: PYTHON PROGRAMMING

String Concatenation
Concatenate the string "Hello" with " World" and print the result.
Expected output: Hello World

Empty String Check
Write a program to check if the string "" (an empty string) is empty. Print true or false.

Starts With a Prefix
Given the string "Learn Java Programming", check if it starts with "Learn".
Expected output: true

Index of a Substring
Find the index of the substring "world" in the string "Hello world! Welcome to Java.".
Expected output: 6

Last Index of a Character
Write a program to find the last index of the character 'e' in the string "experience".
Expected output: 8

Character at a Specific Position
Write a program to find the character at index 10 in the string "Learning Strings in Java".
Expected output: 'g'

Ends With a Suffix
Check if the string "Programming Basics" ends with "ics".
Expected output: true

Combine Methods
Given the string "Java is fun", do the following in sequence:

Convert the string to uppercase.
Concatenate " and powerful" to the uppercase string.
Check if the resulting string ends with "POWERFUL". Print the final result.
Expected output: true


________________________________________________________________________

/*

1. Email Validation
   Write a program to check if an email address entered by a user is valid.
   Conditions:

The email should start with a valid prefix (e.g., "user@").
The email should end with a valid domain (e.g., ".com", ".org").
Example:
Input: "user@example.com"
Output: true
Input: "invalidemail.com"
Output: false


2. File Path Analysis
   Given a file path string, determine the following:
   String filePath = "C:\\Users\\Admin\\Documents\\ProjectReport.pdf";

Check if the file is a PDF (.endsWith(".pdf")).
Extract and print the file name ("ProjectReport") without the extension.
Hint: Use .lastIndexOf() to find the position of the last \\ and the ..


3. Username Check for a Registration System
   In a user registration system, check if a username meets the following conditions:

It should not be empty (isEmpty()).
It must start with an uppercase letter (.startsWith() and .toUpperCase()).
Example:
Input: "JohnDoe"
Output: true
Input: "johndoe"
Output: false


4. Advertisement Banner
   You are building an advertisement banner generator. Given a company name and a tagline:
   String companyName = "Lanos Technologies";
   String tagline = "Innovation for the Future";
   Generate a banner that converts both strings to uppercase and concatenates them with a separator " - ".
   Example Output:
   "LANOS TECHNOLOGIES - INNOVATION FOR THE FUTURE"

5. Search Functionality in a News App
   You are building a search feature for a news app. Given a headline:
   String headline = "Breaking News: Java 21 Released Today";
   Write a program to check if:

The headline contains the keyword "Java" (indexOf()).
The headline starts with "Breaking News" (.startsWith()).
Extract the word "Java" from the headline using .substring() and print it.
Expected Outputs:
Contains "Java": true
Starts with "Breaking News": true
Extracted word: Java

*/