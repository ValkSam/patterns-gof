package composit;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class FileItem implements File {
    private String name;
    private String description;
    private String content;

    /**/
    @Override
    public boolean isFile() {
        return true;
    }

    public FileItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**/

    @Override
    public String getContent() {
        return loadContentFromDisk();
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int getSize() {
        return getContent().length();
    }

    @Override
    public void showFile() {
        System.out.println(getContent());
    }

    /**/
    private String loadContentFromDisk() {
        System.out.println(name.concat(" loading from disk .... "));
        return content;
    }
    /**/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
