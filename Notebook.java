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
    
    public void filter_rm(Integer select) {
        int k = 4;
        if (select == 2)
            k = 8;
        if (select == 3)
            k = 16;
        if (this.ram_memory.equals(k))
            System.out.printf("ОП - %d; ЖД - %d; OС - %s; цвет - %s \n", this.ram_memory, this.hard_drive, this.os, this.colour);
    }

    public void filter_hd(Integer select) {
        int k = 128;
        if (select == 2)
            k = 256;
        if (select == 3)
            k = 512;
        if (this.hard_drive.equals(k))
            System.out.printf("ОП - %d; ЖД - %d; OС - %s; цвет - %s \n", this.ram_memory, this.hard_drive, this.os, this.colour);
    }

    public void filter_os(Integer select) {
        String k = "windows";
        if (select == 2)
            k = "linux";        
        if (this.os.equals(k))
            System.out.printf("ОП - %d; ЖД - %d; OС - %s; цвет - %s \n", this.ram_memory, this.hard_drive, this.os, this.colour);
    }

    public void filter_cl(Integer select) {
        String k = "white";
        if (select == 2)
            k = "black";
        if (select == 3)
            k = "grey";
        if (this.colour.equals(k))
            System.out.printf("ОП - %d; ЖД - %d; OС - %s; цвет - %s \n", this.ram_memory, this.hard_drive, this.os, this.colour);

    }
}
