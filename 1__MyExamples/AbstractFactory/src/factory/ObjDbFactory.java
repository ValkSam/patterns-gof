package factory;

import dao.ClientDao;
import dao.CurrencyDao;
import dao.ObjDbClientDaoImpl;
import dao.ObjDbCurrencyDaoImpl;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class ObjDbFactory implements DbFactory {
    @Override
    public ClientDao getClientDao() {
        return new ObjDbClientDaoImpl();
    }

    @Override
    public CurrencyDao getCurrencyDao() {
        return new ObjDbCurrencyDaoImpl();
    }
}
