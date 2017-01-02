package model;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class MineField {
    private Picture picture;

    public MineField(Picture picture) {
        this.picture = picture;
    }

    public void printMine(FieldType fieldType, Position position) {
        System.out.println(this + " : " + picture + " - " + fieldType + " pos: " + position.X + " ; " + position.Y);
        /*if (fieldType == FieldType.OPEN) {
            System.out.print(picture);
        } else {
            System.out.print("(");
            System.out.print(picture);
            System.out.print(")");
        }
        System.out.print(" ");
        if (position.Y == 3){
            System.out.println();
        }*/
    }
}


