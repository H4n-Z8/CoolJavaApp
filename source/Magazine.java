public class Magazine {
    private String magazineManufacturer;
    private int ammoCapacity;
    private int currentAmmo;

    public Magazine(String magazineManufacturer, int ammoCapacity) {
        this.magazineManufacturer = magazineManufacturer;
        this.ammoCapacity = ammoCapacity;
        this.currentAmmo = ammoCapacity;
    }

    public void setMagazineManufacturer(String magazineManufacturer) {
        this.magazineManufacturer = magazineManufacturer;
    }
    public String getMagazineManufacturer() {
        return this.magazineManufacturer;
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
}