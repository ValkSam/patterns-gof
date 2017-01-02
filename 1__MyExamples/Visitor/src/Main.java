import model.Model;
import model.Model_1;
import model.Model_2;
import visitor.Visitor;
import visitor.VisitorToString;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Model> list = new ArrayList<Model>() {{
            add(new Model_1());
            add(new Model_2());
        }};
        VisitorToString visitor = new VisitorToString();
        for (Model model : list) {
            model.accept(visitor);
            System.out.println(visitor.getResult());
            System.out.println(model.toString());
        }
    }
}
