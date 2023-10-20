class Cánidos extends Animal {
    public Cánidos(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        super(sonidos, alimentos, hábitat, nombreCientífico);
    }

    @Override
    public String getSonido() {
        return sonidos;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHábitat() {
        return hábitat;
    }

    @Override
    public String getNombreCientífico() {
        return nombreCientífico;
    }
}
