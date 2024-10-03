public class Gun {
    private String model;
    private String manufacturer;
    private char firemode = 's';
    private Magazine magazine;

    public Gun (String model, String manufacturer,Magazine magazine) {
        this.magazine = magazine;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
    public Magazine getMagazine() {
        return this.magazine;
    }

    public String getModel() {
        return this.model;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void reload() {
        this.magazine.setCurrentAmmo(this.magazine.getAmmoCapacity());
        System.out.println("Gun has been Reloaded");
    }

     public void setFiremode(char firemode) {
        this.firemode = firemode;  
    }

    public void switchFiremode() {
        switch(this.firemode) {
            case 's':
                this.firemode = 'b';
            break;
            case 'b':
                if (this.manufacturer == "Colt") {
                    this.firemode = 's';
                } else if (this.manufacturer == "Kalashnikov") {
                    this.firemode = 'a';
                }
            break;
            case 'a':
                this.firemode = 's';
            break;
            default:
                //placeholder
        }      
    }

    public void shoot() {
        if (this.magazine.getCurrentAmmo() < 0){
            System.out.println("Youre out of ammo you have to Reload !!!");
            return;
        }

        if (this.firemode == 's') {
            this.magazine.setCurrentAmmo(this.magazine.getCurrentAmmo() - 1);
            System.out.println("Bang");
            System.out.println("You have " + this.magazine.getCurrentAmmo() + " rounds left.");
        } else if (this.firemode == 'b'){
            this.magazine.setCurrentAmmo(this.magazine.getCurrentAmmo() - 3);
            System.out.println("Bang Bang Bang");
            System.out.println("You have " + this.magazine.getCurrentAmmo() + " rounds left.");
        } else if (this.firemode == 'a'){
            while (this.magazine.getCurrentAmmo() > 0) {
            this.magazine.setCurrentAmmo(this.magazine.getCurrentAmmo() - 1);
            System.out.println("Bang");
            System.out.println("You have " + this.magazine.getCurrentAmmo() + " rounds left.");
            }
        } else {
            System.out.println("Youre out of ammo you have to Reload !!!");
        }
    }
}