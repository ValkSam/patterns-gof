package factory;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class Factory {
    public static DbFactory getDbFactory(String factoryType) {
        if ("OBJ".equals(factoryType)) {
            return new ObjDbFactory();
        } else if ("SQL".equals(factoryType)) {
            return new SqlDbFactory();
        } else {
            return new XmlDbFactory();
        }
    }
}
