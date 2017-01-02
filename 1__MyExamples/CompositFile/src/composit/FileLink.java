package composit;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class FileLink implements File {
    private String name;
    private File file;

    /**/
    @Override
    public boolean isFile() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    public FileLink(File file) {
        this.file = file;
    }

    /**/

    @Override
    public String getContent() {
        return file.getContent();
    }

    @Override
    public void setContent(String content) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void showFile() {
        System.out.println(file.getName());
    }
}
