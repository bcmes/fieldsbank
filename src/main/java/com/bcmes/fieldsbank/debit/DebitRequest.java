package com.bcmes.fieldsbank.debit;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record DebitRequest(
    BigDecimal amount,
    String type,
    OffsetDateTime date
) {
    public TransactionModel toModel() {
        TransactionModel transactionModel = new TransactionModel();
        transactionModel.amount = this.amount;
        transactionModel.type = this.type;
        transactionModel.date = this.date;
        return transactionModel;
    }
}
