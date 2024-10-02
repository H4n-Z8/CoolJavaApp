public class Gun {
    private String model;
    private String manufacturer;
    private int ammoCapacity;
    private int currentAmmo;
    private char firemode = 's';

    public Gun (String model, String manufacturer, int ammoCapacity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ammoCapacity = ammoCapacity;
        this.currentAmmo = ammoCapacity;
    }


    public String getModel() {
        return this.model;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }
    public int getAmmoCapacity() {
        return this.ammoCapacity;
    }

    public void setCurrentAmmo(int currentAmmo) {
        this.currentAmmo = currentAmmo;
    }
    public int getCurrentAmmo() {
        return this.currentAmmo;
    }

    public void reload() {
        this.currentAmmo = this.ammoCapacity;
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
        if (this.currentAmmo < 0){
            System.out.println("Youre out of ammo you have to Reload !!!");
            return;
        }

        if (this.firemode == 's') {
            this.currentAmmo = this.currentAmmo - 1;
            System.out.println("Bang");
            System.out.println("You have " + this.currentAmmo + " rounds left.");
        } else if (this.firemode == 'b'){
            this.currentAmmo = this.currentAmmo - 3;
            System.out.println("Bang Bang Bang");
            System.out.println("You have " + this.currentAmmo + " rounds left.");
        } else if (this.firemode == 'a'){
            while (this.currentAmmo > 0) {
            this.currentAmmo = this.currentAmmo - 1;
            System.out.println("Bang");
            System.out.println("You have " + this.currentAmmo + " rounds left.");
            }
        } else {
            System.out.println("Youre out of ammo you have to Reload !!!");
        }
    }
}