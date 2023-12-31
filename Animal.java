public abstract class Animal {
    public String sonidos;
    public String alimentos;
    public String hábitat;
    public String nombreCientífico;

    public Animal(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
        this.nombreCientífico = nombreCientífico;
    }

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();

    public abstract String getNombreCientífico();
}
