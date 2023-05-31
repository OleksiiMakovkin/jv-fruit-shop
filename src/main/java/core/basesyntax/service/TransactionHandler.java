package core.basesyntax.service;

import core.basesyntax.models.FruitTransaction;

import java.util.List;

public interface TransactionHandler {

    void handle(List<FruitTransaction> fruitTransactions);
}