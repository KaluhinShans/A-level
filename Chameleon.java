import java.util.Objects;

public class Chameleon extends Reptiles {

    int legs = getLegs();
    String name = getName();

    String skinColor;
    String place;
    String red = "red";
    String blue = "blue";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chameleon chameleon = (Chameleon) o;
        return Objects.equals(place, chameleon.place) &&
                Objects.equals(red, chameleon.red) &&
                Objects.equals(blue, chameleon.blue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(place, red, blue);
    }

    public String changeSkinColor(String skinColor) {
        String newcolor = "green";
        skinColor = newcolor;
        System.out.println("Chameleon is green");

        return skinColor;
    }

    private String changeSkinColor(String skinColor, String colorPlace) {


        if (equals(colorPlace) == equals(red)) {
            skinColor = red;
            System.out.println("Chameleon is red");
        } else if (equals(colorPlace) == equals(blue)) {
            skinColor = blue;
            System.out.println("Chameleon is blue");
        } else {
            changeSkinColor(skinColor);
        }

        return skinColor;
    }
}
