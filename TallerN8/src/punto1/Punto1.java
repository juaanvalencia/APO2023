package punto1;

public class Punto1 {
    private int numSides;
    private boolean regular;

    public Punto1(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public Punto1(int numSides) {
        this(numSides, false);
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class Punto1 {\n");
        sb.append("    private int numSides;\n");
        sb.append("    private boolean regular;\n\n");
        sb.append("    public Punto1(int numSides, boolean regular) {\n");
        sb.append("        this.numSides = numSides;\n");
        sb.append("        this.regular = regular;\n");
        sb.append("    }\n\n");
        sb.append("    public Punto1(int numSides) {\n");
        sb.append("        this(numSides, false);\n");
        sb.append("    }\n\n");
        sb.append("    public int getNumSides() {\n");
        sb.append("        return numSides;\n");
        sb.append("    }\n\n");
        sb.append("    public void setNumSides(int numSides) {\n");
        sb.append("        this.numSides = numSides;\n");
        sb.append("    }\n\n");
        sb.append("    public boolean isRegular() {\n");
        sb.append("        return regular;\n");
        sb.append("    }\n\n");
        sb.append("    public void setRegular(boolean regular) {\n");
        sb.append("        this.regular = regular;\n");
        sb.append("    }\n");
        sb.append("}\n");
        return sb.toString();
    }
}
