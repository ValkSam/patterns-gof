public class Main {

    public static void main(String[] args) {
        Builder concreteBuilder = new ConcreteBuilder();
        Builder brickBuilder = new BrickBuilder();
        BuildingCompany cityCompany = new CityCompany();
        cityCompany.setBuilder(concreteBuilder);
        cityCompany.buildBase();
        cityCompany.buildRoom();
        cityCompany.buildRoom();
        cityCompany.setBuilder(concreteBuilder);
        cityCompany.buildRoom();
        cityCompany.buildRoom();
        cityCompany.buildRoof();

        System.out.println(Math.ceil(100/11));
        System.out.println(100%11);
    }
}
