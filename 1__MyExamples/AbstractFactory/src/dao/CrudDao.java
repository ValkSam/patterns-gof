package dao;

/**
 * Created by ValkSam on 16.10.2016.
 */
public interface CrudDao<T extends Object> {
    T create(T client);

    T read(int clientId);

    T update(T client);

    int delete(T client);
}
