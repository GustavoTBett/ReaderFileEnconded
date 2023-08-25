# ReaderFileEnconded
This is a Java program that decodes a file with automatic character encoding detection using the juniversalchardet library. The program takes an encoded file as input, detects the character encoding, decodes its content, and prints the decoded content to the console.

# How It Works
* The program reads the provided file path from the command-line arguments.
* It uses the juniversalchardet library to detect the character encoding of the file.
* The program then reads the content of the encoded file using the detected character encoding.
* The decoded content is printed to the console.

# Decoding Logic
The juniversalchardet library takes care of automatically detecting the character encoding of the input file. You don't need to implement custom decoding logic in this case.

# Disclaimer
This program is a basic example and demonstrates the usage of the juniversalchardet library for character encoding detection. It's intended for educational and illustrative purposes only.
