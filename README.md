# CS320

How can I ensure that my code, program, or software is functional and secure?\
I can ensure that my code is functional by understanding the software requirements and testing that each feature works as expected. My experience with the Contact, Task, and Appointment services taught me the importance of using JUnit tests to check valid inputs, invalid inputs, boundary conditions, and expected exceptions. I also used assertions to verify that methods returned the correct results and actually changed objects when required. Achieving 100% code coverage for all six classes and services helped me confirm that my tests executed all measured executable code, although I understand that coverage alone cannot guarantee that software is free of defects.\

To improve security, I would also test for unauthorized access, validate user input, protect sensitive information, and check for vulnerabilities. In future projects, I would combine unit testing with security testing, integration testing, and code reviews to help ensure that the software is both functional and secure.\

How do I interpret user needs and incorporate them into a program?\
I interpret user needs by carefully reviewing the requirements and identifying what the program must do, what information it must accept, and what conditions it must reject. I then translate those requirements into code and test cases that verify the expected behavior. For example, in my Contact Service, I tested that contact information followed the required length and validation rules, that duplicate IDs were rejected, and that updates worked correctly. In my Appointment Service, I tested that invalid appointment dates and descriptions were rejected.\

I also use positive and negative tests to make sure the program handles both normal situations and errors. If a requirement is unclear, I would ask the customer or stakeholder for clarification rather than make assumptions. This approach helps ensure that the final program meets user expectations and behaves consistently.\

How do I approach designing software?\
I approach software design by first understanding the requirements and breaking the program into manageable classes and services, each with a clear responsibility. I then implement the required functionality and write unit tests to verify that each component works correctly. In Project One, I worked with separate Contact, Task, and Appointment classes and their corresponding services, which allowed me to test data validation separately from operations such as adding, updating, and deleting records.\

I also consider maintainability, efficiency, and security when designing software. I use descriptive names, keep methods focused, validate input, and avoid unnecessary complexity. After making changes, I run tests to check that existing functionality still works. I plan to continue using code reviews, test coverage analysis, and additional testing techniques as needed to identify problems early and reduce technical debt. My goal is to create software that meets the requirements, is reliable, and can be updated easily as user needs change.
