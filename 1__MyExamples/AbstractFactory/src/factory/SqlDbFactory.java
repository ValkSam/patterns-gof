package factory;

import dao.ClientDao;
import dao.CurrencyDao;
import dao.SqlDbClientDaoImpl;
import dao.SqlDbCurrencyDaoImpl;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class SqlDbFactory implements DbFactory {
    @Override
    public ClientDao getClientDao() {
        return new SqlDbClientDaoImpl();
    }

    @Override
    public CurrencyDao getCurrencyDao() {
        return new SqlDbCurrencyDaoImpl();
    }
}
