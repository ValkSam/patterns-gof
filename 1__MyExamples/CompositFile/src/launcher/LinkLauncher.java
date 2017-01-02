package launcher;


import composit.File;
import composit.FileItem;
import composit.FileLink;
import composit.Folder;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class LinkLauncher implements Launcher {
    @Override
    public void run() {
        File fileExe1 = new FileItem("file1.exe", "dish_description_1");
        fileExe1.setContent("qwert");
        FileLink linkExe1 = new FileLink(fileExe1);
        File fileExe2 = new FileItem("file2.exe", "dish_description_2");
        fileExe2.setContent("asdfg");
        FileLink linkExe2 = new FileLink(fileExe2);
        File fileDoc1 = new FileItem("file3.doc", "dish_description_3");
        fileDoc1.setContent("text 1");
        FileLink linkDoc1 = new FileLink(fileDoc1);
        File fileDoc2 = new FileItem("file4.doc", "dish_description_4");
        fileDoc2.setContent("text 2");
        FileLink linkDoc2 = new FileLink(fileDoc2);
        /**/
        Folder root = new Folder("root");
        /**/
        Folder applications = new Folder("application");
        applications.add(linkExe1);
        applications.add(linkExe2);
        root.add(applications);
        /**/
        Folder documents = new Folder("documents");
        documents.add(linkDoc1);
        documents.add(linkDoc2);
        root.add(documents);
        /**/
        linkExe1.showFile();
        linkExe2.showFile();
        linkDoc1.showFile();
        linkDoc2.showFile();
        /**/
        System.out.println();
        System.out.println("now loading: ");
        System.out.println(linkExe1.getContent());
        System.out.println(linkExe2.getContent());
        System.out.println(linkDoc1.getContent());
        System.out.println(linkDoc2.getContent());
    }
}
