package dao;

import model.Client;
import model.Currency;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class SqlDbCurrencyDaoImpl implements CurrencyDao {
    @Override
    public Currency create(Currency Currency) {
        return Currency;
    }

    @Override
    public Currency read(int CurrencyId) {
        return new Currency(CurrencyId);
    }

    @Override
    public Currency update(Currency Currency) {
        return Currency;
    }

    @Override
    public int delete(Currency Currency) {
        return Currency.getId();
    }
}
