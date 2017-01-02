import factory.FlyweightFactory;
import model.FieldType;
import model.MineField;
import model.Picture;
import model.Position;

public class Main {

    public static void main(String[] args) {
        MineField mineField;
        mineField = FlyweightFactory.getMineField(Picture.BLANK);
        mineField.printMine(FieldType.OPEN, new Position(1,1));

        mineField = FlyweightFactory.getMineField(Picture.BLANK);
        mineField.printMine(FieldType.CLOSED, new Position(1,2));

        mineField = FlyweightFactory.getMineField(Picture.MINE);
        mineField.printMine(FieldType.OPEN, new Position(1,3));

        mineField = FlyweightFactory.getMineField(Picture.MINE);
        mineField.printMine(FieldType.CLOSED, new Position(2,1));

        mineField = FlyweightFactory.getMineField(Picture.MINE_FLAG);
        mineField.printMine(FieldType.CLOSED, new Position(2,2));

        mineField = FlyweightFactory.getMineField(Picture.ONE);
        mineField.printMine(FieldType.CLOSED, new Position(2,2));
    }
}
