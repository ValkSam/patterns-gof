package factory;

import dao.ClientDao;
import dao.CurrencyDao;
import dao.XmlDbClientDaoImpl;
import dao.XmlDbCurrencyDaoImpl;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class XmlDbFactory implements DbFactory {
    @Override
    public ClientDao getClientDao() {
        return new XmlDbClientDaoImpl();
    }

    @Override
    public CurrencyDao getCurrencyDao() {
        return new XmlDbCurrencyDaoImpl();
    }
}
