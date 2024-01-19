📚 **Library Management System Update - v2.0.1** 🚀

📝 **Description:**
- Implemented RESTful API endpoints for improved data exchange.
- Added support for filtering and sorting book listings.
- Enhanced security measures for user authentication and authorization.
- Improved error handling and logging mechanisms.

🔧 **Changes Made:**
- Introduced new RESTful routes: `/books`, `/users`, `/transactions`.
- Implemented query parameters for filtering and sorting book listings.
- Enhanced JWT token validation and expiration handling.
- Refactored authentication middleware for better code organization.

🐛 **Bug Fixes:**
- Resolved issue #102: Incorrect book count displayed on user dashboard.
- Fixed issue #201: Unauthorized access to certain API endpoints.

👩‍💻 **Technical Details:**
- Upgraded Actix-Web framework to the latest version.
- Utilized Diesel for database migrations and schema management.
- Implemented integration tests for critical API endpoints.
- Applied Rustfmt for consistent code formatting.

🔖 **Version Bump:**
- Bumped the version to 2.0.1.

📚 **Documentation:**
- Updated API documentation with new routes and query parameters.
- Added examples for making requests to the new RESTful endpoints.
- Documented authentication and authorization processes.

🧹 **Miscellaneous:**
- Cleaned up redundant code and unused dependencies.
- Ensured compliance with the latest Rust edition.
- Conducted code review and addressed static analysis findings.

👉 **Please review thoroughly and perform regression testing before merging into the main branch. Feedback and suggestions are appreciated!** 🙌
