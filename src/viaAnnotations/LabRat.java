package viaAnnotations;

/**
 * Created by Olga Pavlova on 08/09/2015.
 */
public class LabRat {
    private String text;
    private String name;

    public LabRat(String text) {
        this.text = text;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void sayHi(){
        System.out.println(text);
    }
}

