curl "http://localhost:8080/fieldsbank/debits" \
      -H "Content-Type: application/json" \
      -d '{
            "amount": "100.00",
            "type": "DEBIT",
            "date": "2025-08-03T00:00:00.000Z"
          }'