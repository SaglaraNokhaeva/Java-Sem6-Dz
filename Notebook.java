class Notebook {    

    Integer ram_memory;
    Integer hard_drive;
    String os;
    String colour;

    public Notebook(int i, int j, String string1, String string2) {
        this.ram_memory = i;
        this.hard_drive = j;
        this.os = string1;
        this.colour = string2;
    }

    public Integer get_ram_memory() {
        return this.ram_memory;
    }

}
