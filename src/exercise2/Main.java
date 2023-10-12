package exercise2;

abstract class AbstractHandler {
    void open(){
        System.out.println("Open file");
    }
    void create(){
        System.out.println("Create file");
    }
    void change(){
        System.out.println("Change file");
    }
    void save(){
        System.out.println("Save file");
    }
}
public class Main{
    public static void main(String[] args) {
        AbstractHandler first = new XMLHandler();
        first.create();
        first.open();
        first.change();
        first.save();
        System.out.println();

        AbstractHandler second = new TXTHandler();
        second.create();
        second.open();
        second.change();
        second.save();
        System.out.println();

        AbstractHandler third = new DOCHandler();
        third.create();
        third.open();
        third.change();
        third.save();
    }
}
class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open XML file");
    }

    @Override
    void create() {
        System.out.println("Create XML file");
    }

    @Override
    void change() {
        System.out.println("Change XML file");
    }

    @Override
    void save() {
        System.out.println("Save XML file");
    }
}
class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open TXT file");
    }

    @Override
    void create() {
        System.out.println("Create TXT file");
    }

    @Override
    void change() {
        System.out.println("Change TXT file");
    }

    @Override
    void save() {
        System.out.println("Save TXT file");
    }
}
class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open DOC file");
    }

    @Override
    void create() {
        System.out.println("Create DOC file");
    }

    @Override
    void change() {
        System.out.println("Change DOC file");
    }

    @Override
    void save() {
        System.out.println("Save DOC file");
    }
}
