package miniproje.minibokkstore;
//1-c: procuct oz:brand,sheet(sayfa sayisi),code
public class NoteBook {
    private String brand;
    private String sheet;
    private String code;

    public NoteBook(String brand, String sheet, String code) {
        this.brand = brand;
        this.sheet = sheet;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

