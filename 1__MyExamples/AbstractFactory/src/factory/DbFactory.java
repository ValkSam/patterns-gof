package factory;

import dao.ClientDao;
import dao.CurrencyDao;

/**
 * Created by ValkSam on 16.10.2016.
 */
public interface DbFactory {
    ClientDao getClientDao();

    CurrencyDao getCurrencyDao();
}
