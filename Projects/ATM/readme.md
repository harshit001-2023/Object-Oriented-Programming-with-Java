```
ATM-Web-Project/
├── backend/
│   ├── Accounts.java          // (unchanged)
│   ├── OptionMenu.java        // (unchanged)
│   ├── Atm.java               // (entry point, keep for testing)
│   └── IO.java                // (console helper, optional)
│
├── frontend/
│   ├── index.html             // Login page
│   ├── dashboard.html         // Main UI after login
│   ├── css/
│   │   └── style.css          // Styling
│   ├── js/
│   │   ├── login.js           // Login validation & submission
│   │   └── dashboard.js       // Handle transactions
│
├── servlets/ (optional)
│   ├── LoginServlet.java      // Handles login request
│   ├── TransactionServlet.java// Handles withdraw/deposit
│
└── web.xml                    // Servlet mapping (if using servlets)
```