Fail2Ban: is a Java program that scans server log files to detect repeated failed login attempts from IP addresses, similar to the basic functionality of the real-world tool Fail2Ban. This program reads a log file, identifies lines that indicate invalid login attempts, extracts the IP address from those lines, and counts how many times each IP fails to log in. It then writes all IP addresses with 3 or more failed attempts to an output file.

🚀 How It Works
- Takes two command-line arguments:
  - java Fail2Ban <inputLogFile> <outputFile>
- Reads the input log file line by line.
- Uses String.split() to parse each line and extract the IP address.
- Identifies failed attempts using the keyword "Invalid".
- Tracks the number of failures per IP.
- Writes only the IPs with ≥ 3 failures to the output file.

