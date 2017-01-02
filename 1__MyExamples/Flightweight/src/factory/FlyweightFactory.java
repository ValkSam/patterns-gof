package factory;

import model.MineField;
import model.MineFieldBlank;
import model.MineFieldMine;
import model.Picture;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class FlyweightFactory {
    static final Map<Picture, MineField> mineFields = new HashMap<>();

    public static MineField getMineField(Picture picture) {
        MineField mineField = mineFields.get(picture);
        if (mineField == null) {
            mineField = new MineField(picture);
            mineFields.put(picture, mineField);
        }
        /*//вариант с иерархией
        switch (picture) {
            case BLANK:
                return new MineFieldBlank();
            case MINE:
                return new MineFieldMine();
            default:
                throw new RuntimeException("error");
        }*/
        return new MineField(picture);
    }
}
