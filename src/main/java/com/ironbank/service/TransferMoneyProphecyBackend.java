package com.ironbank.service;

import com.ironbank.dao.MoneyDao;
import com.ironbank.model.Bank;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TransferMoneyProphecyBackend implements TransferMoneyService {
    private final MoneyDao moneyDao;
    private final ProphetService prophet;

    @Override
    public long transfer(String name, long amount) {
        Bank bank = moneyDao.findAll().get(0);
        if (bank.getTotalAmount() > amount && prophet.willSurvive(name)) {
            bank.credit(amount);
            return moneyDao.save(bank).getTotalAmount();
        }
        return -1;
    }
}
