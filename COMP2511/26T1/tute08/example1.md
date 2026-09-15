```mermaid
sequenceDiagram
    actor User
    participant Browser
    participant AuthenticationService
    participant Database

    User->>Browser: Click the Login button
    activate Browser
    Browser-->>User: Display the Login page

    User->>Browser: Enter correct login details
    Browser->>AuthenticationService: login(username, password)
    activate AuthenticationService
    AuthenticationService->>Database: Check login details
    activate Database
    Database-->>AuthenticationService: Verify login details are correct
    deactivate Database
    AuthenticationService-->>Browser: Login details verified
    deactivate AuthenticationService
    Browser-->>User: Successful login
    deactivate Browser
```