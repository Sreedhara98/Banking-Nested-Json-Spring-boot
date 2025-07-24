```json

{
    "customerId": "CUST-987654321",
    "firstName": "Sharath",
    "lastName": "Kumar",
    "email": "sharath.kumar@bankmail.com",
    "phone": "+91-9876543210",
    "address": {
        "street": "5th Cross, MG Road",
        "city": "Shivamogga",
        "state": "Karnataka",
        "postalCode": "577201",
        "country": "India"
    },
    "accounts": [
        {
            "accountId": "ACC-1234567890",
            "accountType": "Savings",
            "currency": "INR",
            "balance": 254320.75,
            "status": "Active",
            "openedDate": "2018-06-15",
            "transactions": [
                {
                    "transactionId": "TXN-001",
                    "date": "2025-07-20T10:30:00Z",
                    "type": "DEBIT",
                    "amount": 5000,
                    "description": "ATM Withdrawal",
                    "status": "SUCCESS"
                },
                {
                    "transactionId": "TXN-002",
                    "date": "2025-07-21T12:45:00Z",
                    "type": "CREDIT",
                    "amount": 20000,
                    "description": "Salary Credit",
                    "status": "SUCCESS"
                }
            ]
        },
        {
            "accountId": "ACC-0987654321",
            "accountType": "Current",
            "currency": "INR",
            "balance": 1250000,
            "status": "Active",
            "openedDate": "2020-01-10",
            "transactions": []
        }
    ],
    "loans": [
        {
            "loanId": "LOAN-112233",
            "loanType": "Home Loan",
            "principalAmount": 5000000,
            "outstandingAmount": 3200000,
            "interestRate": 8.5,
            "tenureMonths": 240,
            "emi": 43250,
            "nextDueDate": "2025-08-05",
            "status": "Active"
        }
    ],
    "cards": [
        {
            "cardId": "CARD-778899",
            "cardType": "Credit Card",
            "cardNumber": "XXXX-XXXX-XXXX-1234",
            "expiryDate": "2027-05",
            "limit": 200000,
            "availableLimit": 150000,
            "status": "Active",
            "transactions": [
                {
                    "transactionId": "CC-TXN-9001",
                    "date": "2025-07-18T14:20:00Z",
                    "merchant": "Amazon",
                    "amount": 4500,
                    "currency": "INR",
                    "status": "SUCCESS"
                }
            ]
        }
    ],
    "kycStatus": "Verified",
    "riskProfile": "Low",
    "preferences": {
        "smsAlerts": true,
        "emailAlerts": true,
        "preferredLanguage": "English"
    }
}
