# user-management
A spring boot microservice that is involved creation, modification and deletion of users to a system

# DB 
PostgresSQL

# Functionality
The application accepts POST requests with JSON payload where the user's first name and last name has to be entered. The user is then created within the system with a sequence number. The date of creation of the user is also stamped on the record, along with the first name and the last name.

# Authentication
Spring security is implemented with Basic authentication enabled.
