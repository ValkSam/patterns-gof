package launcher;

import composit.File;
import composit.FileItem;
import composit.Folder;

/**
 * Created by ValkSam on 30.10.2016.
 */
public class FileLauncher implements Launcher {
    @Override
    public void run() {
        File fileExe1 = new FileItem("file1.exe", "dish_description_1");
        fileExe1.setContent("qwert");
        File fileExe2 = new FileItem("file2.exe", "dish_description_2");
        fileExe2.setContent("asdfg");
        File fileDoc1 = new FileItem("file3.doc", "dish_description_3");
        fileDoc1.setContent("text 1");
        File fileDoc2 = new FileItem("file4.doc", "dish_description_4");
        fileDoc2.setContent("text 2");
        /**/
        Folder root = new Folder("root");
        /**/
        Folder applications = new Folder("application");
        applications.add(fileExe1);
        applications.add(fileExe2);
        root.add(applications);
        /**/
        Folder documents = new Folder("documents");
        documents.add(fileDoc1);
        documents.add(fileDoc2);
        root.add(documents);
        /**/
        /*System.out.println("size: " + root.getSize());
        root.showFile();
        System.out.println("size: " + applications.getSize());
        applications.showFile();
        System.out.println("size: " + documents.getSize());
        documents.showFile();*/
        /**/
//        System.out.println("content: " + root.getContent());
//        System.out.println("content: " + applications.getContent());
//        System.out.println("content: " + documents.getContent());
        fileExe1.showFile();
        fileExe2.showFile();
        fileDoc1.showFile();
        fileDoc2.showFile();
    }
}
