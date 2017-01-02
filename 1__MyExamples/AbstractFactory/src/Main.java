import dao.ClientDao;
import dao.CurrencyDao;
import factory.DbFactory;
import factory.Factory;
import model.Client;
import model.Currency;

public class Main {

    public static void main(String[] args) {
        DbFactory objDbFactory = Factory.getDbFactory("OBJ");
        ClientDao clientDao = objDbFactory.getClientDao();
        System.out.println("create client 1");
        Client client1 = new Client(1);
        System.out.println(clientDao.create(client1));
        System.out.println("read client 1");
        System.out.println(clientDao.read(1));
        System.out.println("update client 1 to 2 ");
        client1.setId(2);
        System.out.println(clientDao.update(client1));
        /**/
        System.out.println("=====");
        /**/
        DbFactory xmlDbFactory = Factory.getDbFactory("XML");
        CurrencyDao CurrencyDao = xmlDbFactory.getCurrencyDao();
        System.out.println("create Currency 1");
        Currency Currency1 = new Currency(1);
        System.out.println(CurrencyDao.create(Currency1));
        System.out.println("read Currency 1");
        System.out.println(CurrencyDao.read(1));
        System.out.println("update Currency 1 to 2 ");
        Currency1.setId(2);
        System.out.println(CurrencyDao.update(Currency1));
    }
}
