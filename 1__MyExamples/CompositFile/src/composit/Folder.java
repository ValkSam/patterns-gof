package composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class Folder implements File {
    private String name;
    private List<File> fileItemList = new ArrayList<File>();

    public Folder(String name) {
        this.name = name;
    }

    /**/
    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public String getContent() {
        String result = "";
        for (File fileItem : fileItemList) {
            result += fileItem.getContent();
        }
        return result;
    }

    @Override
    public void setContent(String content) {
        return;
    }

    @Override
    public int getSize() {
        int result = 0;
        for (File fileItem : fileItemList) {
            result += fileItem.getContent().length();
        }
        return result;
    }

    @Override
    public void showFile() {
        for (File fileItem : fileItemList) {
            fileItem.showFile();
        }
    }

    /**/
    public void add(File file) {
        fileItemList.add(file);
    }

    @Override
    public String getName() {
        return name;
    }
}
