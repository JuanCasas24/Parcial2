class Felinos extends Animal {
    public Felinos(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        super(sonidos, alimentos, hábitat, nombreCientífico);
    }

   
    public String getSonido() {
        return sonidos;
    }

   
    public String getAlimentos() {
        return alimentos;
    }

    
    public String getHábitat() {
        return hábitat;
    }


    public String getNombreCientífico() {
        return nombreCientífico;
    }
}
