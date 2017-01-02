/**
 * Created by ValkSam on 22.10.2016.
 */
public abstract class BuildingCompany {
    Builder builder = new ConcreteBuilder();

    void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void buildBase() {
        System.out.println("Построен фундамент");
    };

    public void buildRoom(){
        builder.build();
    };

    public void buildRoof(){
        System.out.println("Построен крыша");
    };
}
