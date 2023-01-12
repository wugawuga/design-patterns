package compositepattern;

public class Application {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        Folder wuga = new Folder("wuga");
        Folder music = new Folder("music");
        Folder picture = new Folder("picture");
        Folder doc = new Folder("doc");
        Folder usr = new Folder("usr");

        File track1 = new File("track1");
        File track2 = new File("track2");
        File pic1 = new File("pic1");
        File doc1 = new File("doc1");
        File java = new File("java");

        root.addComponent(home);
        root.addComponent(usr);

        home.addComponent(wuga);
        home.addComponent(music);
        home.addComponent(picture);
        home.addComponent(doc);

        music.addComponent(track1);
        music.addComponent(track2);
        picture.addComponent(pic1);
        doc.addComponent(doc1);
        usr.addComponent(java);

        show(root);
    }

    private static void show(Component component) {
        System.out.println(component.getClass().getName() + "|" + component.getName());
        if (component instanceof Folder) {
            for (Component c : ((Folder) component).getChildren()) {
                show(c);
            }
        }
    }
}
