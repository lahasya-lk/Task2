🧩 Project Overview

This project simulates multiple students submitting their exam scores concurrently using Java threads.
Each thread writes student data — name, roll number, and marks — to a shared CSV file.
The writing process is made thread-safe using synchronization, ensuring that no data corruption occurs even when multiple threads write simultaneously.

This project also includes JUnit test cases to validate:

File writing correctness

Thread completion behavior

🛠️ Features

Multiple threads simulating student score submissions

Thread-safe file operations using synchronized methods

Writes data to scores.csv in comma-separated format

Automated JUnit testing for:

File creation and content check

Thread completion verification
