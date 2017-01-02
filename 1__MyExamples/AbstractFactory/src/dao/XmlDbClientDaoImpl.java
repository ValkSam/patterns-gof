package dao;

import model.Client;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class XmlDbClientDaoImpl implements ClientDao {

    @Override
    public Client create(Client client) {
        return client;
    }

    @Override
    public Client read(int clientId) {
        return new Client(clientId);
    }

    @Override
    public Client update(Client client) {
        return client;
    }

    @Override
    public int delete(Client client) {
        return client.getId();
    }
}
