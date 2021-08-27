package pl.chojnacki.lesson3.example.hospital;

class Doctor extends Employee {

    protected String specialization;
    public String license;

    Doctor(final String specialization, final String license) {

        this.specialization = specialization;
        this.license = license;
    }

    @Override
    public double earnPayment() {
        return 4 * basicPayment;
    }

    public String getLicense() {
        return this.license;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setLicense(String license) {
        this.license = license;
    }

}

